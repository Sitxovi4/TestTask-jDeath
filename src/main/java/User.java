class User {

    private int ID;
    private String NAME;
    private String SURNAME;
    private int ACCOUNT;

    int getID() {
        return ID;
    }

    String getNAME() {
        return NAME;
    }

    String getSURNAME() {
        return SURNAME;
    }

    int getACCOUNT() {
        return ACCOUNT;
    }

    void setID(int ID) {
        this.ID = ID;
    }

    void setNAME(String NAME) {
        this.NAME = NAME;
    }

    void setSURNAME(String SURNAME) {
        this.SURNAME = SURNAME;
    }

    void setACCOUNT(int ACCOUNT) {
        this.ACCOUNT = ACCOUNT;
    }

//    @Override
//    public String toString(){
//        return getClass().getSimpleName() + "{id: " + ID + ", name: " + NAME + ", surname: " + SURNAME + ", account: " + ACCOUNT + "};";
//    }
}
