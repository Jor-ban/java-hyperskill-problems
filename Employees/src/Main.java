class Employee {
    private String name,email;
    private int experience;

    Employee(String name, String email, int experience) {
        this.name = name;
        this.email = email;
        this.experience = experience;
    }

    public String getName() { return name; }
    public String getEmail() { return email; }
    public int getExperience() { return experience; }
}

class Developer extends Employee {
    private String mainLanguage;
    private String[] skills;

    Developer(String name, String email, int experience, String mainLanguage, String[] skills) {
        super(name, email, experience);
        this.mainLanguage = mainLanguage;
        this.skills = skills;
    }

    public String getMainLanguage() { return mainLanguage; }
    public String[] getSkills() { return skills; }
}

class DataAnalyst extends Employee {

    private boolean phd;
    String[] methods;

    DataAnalyst(String name, String email, int experience, boolean phd, String[] methods) {
        super(name, email, experience);
        this.phd = phd;
        this.methods = methods;
    }

    public String[] getMethods() { return methods; }
    public boolean isPhd() { return phd; }
}