package testone.domain;

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

    public void setId(int id) {
        this.id = id;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public void setBalance(Long balance) {
        this.balance = balance;
    }
}
