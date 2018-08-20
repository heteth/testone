package testone.domain;

import org.springframework.data.relational.core.mapping.Column;

public class Account2 {
    private int id;

    private String accountNumber;

    private Long balance;

    public int getId() {
        return id;
    }

    @Column("account_no")
    public String getAccountNumber() { return accountNumber; }

    public Long getBalance() {
        return balance;
    }
}
