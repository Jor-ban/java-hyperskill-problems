class Movie {
    private String title;
    private String desc;
    private int year;

    // write two constructors here
    Movie(String title, int year) {
        this.title = title;
        this.year = year;
        desc = "empty";
    }
    Movie(String title, String desc, int year) {
        this(title, year);
        this.desc = desc;
    }

    public String getTitle() {
        return title;
    }
    public String getDesc() {
        return desc;
    }
    public int getYear() {
        return year;
    }
}