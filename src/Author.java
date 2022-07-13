public class Author {
    private final String authorName, authorSurname;

    public Author(String authorName, String authorSurname) {
        this.authorName = authorName;
        this.authorSurname = authorSurname;
    }

    public String getAuthorName() {
        return this.authorName;
    }

    public String getAuthorSurname() {
        return this.authorSurname;
    }

    public String toString() {
        return "Автор: " + this.authorName + " " + this.authorSurname;
    }
}
