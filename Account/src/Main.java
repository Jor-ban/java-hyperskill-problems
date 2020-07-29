class Account {

    private long balance;
    private String ownerName;
    private boolean locked;

    long getBalance() {
        return balance;
    }
    void setBalance(long balance) {
        this.balance = balance;
    }
    String getOwnerName() {
        return ownerName;
    }
    void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
    boolean isLocked() {
        return locked;
    }
    void setLocked(boolean locked) {
        this.locked = locked;
    }
}