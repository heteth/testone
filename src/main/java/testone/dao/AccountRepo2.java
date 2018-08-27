package testone.dao;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;
import testone.domain.Account;
import testone.domain.Account2;

//import org.springframework.stereotype.Repository;

//@Repository
public interface AccountRepo2 extends Repository<Account, Integer> {
    @Query("select a.*, sum(amount) balance " +
            "from account a " +
            "left join \"transaction\" on a.id=account_id and status in ('OK','PENDING') " +
            "where account_no=:accountNo " +
            "group by a.id")
    Account2 getAccount(String accountNo);
}
