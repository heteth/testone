package testone.dao;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.query.Param;
//import org.springframework.stereotype.Repository;
import org.springframework.data.repository.Repository;
import testone.domain.Account;

import java.util.Date;

//@Repository
public interface AccountRepo extends Repository<AccountRepo.C, Integer> {
    @Query("select a.*, sum(amount) balance " +
            "from account a " +
            "left join \"transaction\" on a.id=account_id and status in ('OK','PENDING') " +
            "where account_no=:accountNo " +
            "group by a.id")
    Account getAccount(String accountNo);

    @Query(value = "select sum(amount) balance " +
            "from account a " +
            "left join \"transaction\" on a.id=account_id and status in ('OK','PENDING') " +
            "where account_no=:accountNo " +
            "group by a.id")
    Account getJustBalance(String accountNo);

    @Query(value = "select count(*), current_date, '3' from account limit 1", rowMapperClass = Tuple3RowMapper.class)
    Tuple3<Long, Date, String> getThreeValues();

    class C{}
}
