package com.sitx.spring.model;

public class User {

    private int ID;
    private String NAME;
    private String SURNAME;
    private int ACCOUNT;


    public User(int ID, String NAME, String SURNAME, int ACCOUNT) {
        this.ID = ID;
        this.NAME = NAME;
        this.SURNAME = SURNAME;
        this.ACCOUNT = ACCOUNT;
    }

    public int getACCOUNT() {
        return ACCOUNT;
    }

    public void setACCOUNT(int ACCOUNT) {
        this.ACCOUNT = ACCOUNT;
    }

    public User(){}

    public int getID() {
        return ID;
    }

    public String getNAME() {
        return NAME;
    }

    public String getSURNAME() {
        return SURNAME;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME;
    }

    public void setSURNAME(String SURNAME) {
        this.SURNAME = SURNAME;
    }


    @Override
    public String toString(){
        return getClass().getSimpleName() + "{id: " + ID +
                                            ", name: " + NAME +
                                            ", surname: " + SURNAME +
                                            ", account: " + ACCOUNT +  "};";
    }
}
