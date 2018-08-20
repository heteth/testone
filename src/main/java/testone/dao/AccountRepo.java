package testone.dao;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.query.Param;
//import org.springframework.stereotype.Repository;
import org.springframework.data.repository.Repository;
import testone.domain.Account;

//@Repository
public interface AccountRepo extends Repository<Account, Integer> {
    @Query("select a.*, sum(amount) balance " +
            "from account a " +
            "left join \"transaction\" on a.id=account_id and status in ('OK','PENDING') " +
            "where account_no=:accountNo " +
            "group by a.id")
    Account getAccount(@Param("accountNo") String accountNo);
}
