public class Book {
    private String name;
    private int year;

    public Book(String name, String authorName, String authorSurname, int year) {
        this.name = name;
        this.year = year;
    }
    public class Author {
        private String authorName, authorSurname;

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
    }

    public String getName() {
        return this.name;
    }

    public int getYear() {
        return  this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
