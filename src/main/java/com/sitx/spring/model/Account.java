package com.sitx.spring.model;




import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "account")
public class Account {

    @ManyToOne
    @JoinColumn(name = "userId")
    private User user;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "accountId", unique = true, nullable = false)
    private int accountId;

    @Column(name = "account")
    private int account;

//    @Column(name = "userId")
//    private  int userId;

    public Account() {
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public int getAccount() {
        return account;
    }

    public void setAccount(int account) {
        this.account = account;
    }

//    public int getUserId() {
//        return userId;
//    }
//
//    public void setUserId(int userId) {
//        this.userId = userId;
//    }


    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }


    @Override
    public String toString() {
        return "Account{" +
                "accountId=" + accountId +
                ", account=" + account +
                '}';
    }
}
