class Application {

    public String name;

    public void run(String[] args) {
        System.out.println(name);
        for (String n : args) {
            System.out.println(n);
        }
    }
}