package testone.dao;

import org.springframework.data.relational.core.mapping.Column;

import java.math.BigDecimal;

public class Account3 {
    private int id;

    private String accountNumber;

    private BigDecimal balance;

    public Account3(int id, String accountNumber, BigDecimal balance) {
        this.id = id;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public String getAccountNumber() { return accountNumber; }

    public BigDecimal getBalance() {
        return balance;
    }
}
