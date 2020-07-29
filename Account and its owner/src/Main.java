import java.util.Optional;

public class Main {


    public static void main(String[] args) {

        // create an instance of Account here
        User usr = new User("demo-user", "Alexander", "Schmidt");
        Account ac = new Account("123456", 1000, usr);

        // pass it into process method
        process(ac);
    }

    static class Account {

        private String code;
        private long balance;
        private User owner;

        public Account(String code, long balance, User owner) {
            this.code = code;
            this.balance = balance;
            this.owner = owner;
        }

        public String getCode() {
            return code;
        }

        public long getBalance() {
            return balance;
        }

        public User getOwner() {
            return owner;
        }
    }

    static class User {

        private String login;
        private String firstName;
        private String lastName;

        public User(String login, String firstName, String lastName) {
            this.login = login;
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public String getLogin() {
            return login;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }
    }


    public static void process(Account account) {
        try {
            final Optional<User> owner = Optional.ofNullable(account.getOwner());

            System.out.println(account.getCode());
            System.out.println(account.getBalance());

            owner.ifPresent(o -> {
                System.out.println(o.getLogin());
                System.out.println(o.getFirstName());
                System.out.println(o.getLastName());
            });

        } catch (Exception e) {
            System.out.println("Something wrong...");
        }
    }
}