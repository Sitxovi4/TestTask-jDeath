package com.sitx.spring.model;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "user")
public class User {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "userId", unique = true, nullable = false)
    private int userId;

    @Basic
    @Column(name = "name")
    private String NAME;

    @Basic
    @Column(name = "surname")
    private String SURNAME;

    @OneToMany(mappedBy = "user")
    private List<Account> accounts = new ArrayList<Account>();


    public User() {
    }



    public int getUserId() {
        return userId;
    }


    public void setUserId(int ID) {
        this.userId = ID;
    }


    public String getNAME() {
        return NAME;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME;
    }


    public String getSURNAME() {
        return SURNAME;
    }

    public void setSURNAME(String SURNAME) {
        this.SURNAME = SURNAME;
    }


    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }

    @Override
    public String toString(){
        return getClass().getSimpleName() + "{id: " + userId +
                                            ", name: " + NAME +
                                            ", surname: " + SURNAME +
                                            "};";
    }




}
