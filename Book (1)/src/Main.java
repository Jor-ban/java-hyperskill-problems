class Book {
    String title;
    int yearOfPublishing;
    String[] authors;

    String getTitle() {
        return title;
    }
    void setTitle(String title) {
        this.title = title;
    }
    int getYearOfPublishing() {
        return yearOfPublishing;
    }
    void setYearOfPublishing(int yearOfPublishing) {
        this.yearOfPublishing = yearOfPublishing;
    }
    String[] getAuthors() {
        return authors;
    }
    void setAuthors(String[] authors) {
        this.authors = authors;
    }
}