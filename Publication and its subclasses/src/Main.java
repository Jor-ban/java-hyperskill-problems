class Publication {

    private String title;

    public Publication(String title) {
        this.title = title;
    }

    public final String getInfo() {
        return getType() + getDetails();
    }

    public String getType() {
        return "Publication";
    }

    public String getDetails() {
        return ": " + this.title;
    }

}

class Newspaper extends Publication {

    private String source;

    public Newspaper(String title, String source) {
        super(title);
        this.source = source;
    }

    public String getType() {
        return "Newspaper";
    }
    public String getDetails() {
        return " (source - " + this.source + ")" + super.getDetails();
    }

}

class Article extends Publication {

    private String author;

    public Article(String title, String author) {
        super(title);
        this.author = author;
    }

    public String getType() {
        return "Article";
    }
    public String getDetails() {
        return " (author - " + this.author + ")" + super.getDetails();
    }

}

class Announcement extends Publication {

    private int daysToExpire;

    public Announcement(String title, int daysToExpire) {
        super(title);
        this.daysToExpire = daysToExpire;
    }

    public String getType() {
        return "Announcement";
    }
    public String getDetails() {
        return " (days to expire - " + this.daysToExpire + ")" + super.getDetails();
    }

}