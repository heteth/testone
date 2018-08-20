package testone.dao;

import org.springframework.data.annotation.Id;

public class Account {
    private int id;

    private String accountNo;

    private Long balance;

    public int getId() {
        return id;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public Long getBalance() {
        return balance;
    }
}
