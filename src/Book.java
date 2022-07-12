import java.util.Objects;

public class Book {
    private String name;
    private Author author;
    private int year;

    public Book(String name, Author author, int year) {
        this.name = name;
        this.author = author;
        this.year = year;
    }

    public String getName() {
        return this.name;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Book book2 = (Book) other;
        return name.equals(book2.name) && author.equals(book2.author) && year == book2.year;
    }
    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
    @Override
        public String toString() {
        return "Название книги: " + this.name + " Автор: " + this.author + " Год издания: " + this.year;
    }
}

