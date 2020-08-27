interface AccountService {
    /**
     * It finds an account by owner id
     * @param id owner unique identifier
     * @return account or null
     */
    Account findAccountByOwnerId(long id);
    /**
     * It count the number of account with balance > the given value
     * @param value
     * @return the number of accounts
     */
    long countAccountsWithBalanceGreaterThan(long value);
}

class AccountServiceImpl implements AccountService {

    Account[] accs;

    AccountServiceImpl(Account[] accs) {
        this.accs = accs;
    }

    public Account findAccountByOwnerId(long id) {
        for (Account acc : accs) {
            if (acc.getOwner().getId() == id) {
                return acc;
            }
        }
        return null;
    }
    public long countAccountsWithBalanceGreaterThan(long value) {
        long amount = 0;
        for (Account acc : accs) {
            if (acc.getBalance() > value) {
                amount++;
            }
        }
        return amount;
    }
}

class Account {

    private long id;
    private long balance;
    private User owner;

    public Account(long id, long balance, User owner) {
        this.id = id;
        this.balance = balance;
        this.owner = owner;
    }

    public long getId() { 
        return id; 
    }

    public long getBalance() { 
        return balance; 
    }

    public User getOwner() { 
        return owner; 
    }
}

class User {

    private long id;
    private String firstName;
    private String lastName;

    public User(long id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public long getId() { 
        return id; 
    }

    public String getFirstName() { 
        return firstName; 
    }

    public String getLastName() { 
        return lastName; 
    }
}