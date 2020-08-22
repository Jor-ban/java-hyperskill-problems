class BankAccount {

    protected String number;
    protected Long balance;

    public BankAccount(String number, Long balance) {
        this.number = number;
        this.balance = balance;
    }
}
class CheckingAccount extends BankAccount {
    double fee;

    CheckingAccount(String number, long balance, double fee) {
        super(number, balance);
        this.fee = fee;
    }
}
class SavingAccount extends BankAccount {
    double interestRate;

    SavingAccount(String number, long balance, double interestRate) {
        super(number, balance);
        this.interestRate = interestRate;
    }
}