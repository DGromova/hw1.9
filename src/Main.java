public class Main {
    public static void main(String[] args) {
        Author rayBradbury = new Author("Ray", "Bradbury");
        Book fahrenheit451 = new Book("Fahrenheit 451", rayBradbury, 1953);

        System.out.println("fahrenheit451.getName = " + fahrenheit451.getName());
        System.out.println("rayBradbury.getAuthorName = " + rayBradbury.getAuthorName());
        System.out.println("rayBradbury.getAuthorSurname = " + rayBradbury.getAuthorSurname());
        System.out.println("fahrenheit451.getYear = " + fahrenheit451.getYear());
        System.out.println();

        Author jackLondon = new Author("Jack", "London");
        Book whiteFang = new Book("White Fang", jackLondon,1906);

        System.out.println("whiteFang.getName = " + whiteFang.getName());
        System.out.println("jackLondon.getAuthorName = " + jackLondon.getAuthorName());
        System.out.println("jackLondon.getAuthorSurname = " + jackLondon.getAuthorSurname());
        System.out.println("whiteFang.getYear = " + whiteFang.getYear());

        whiteFang.setYear(2000);
        System.out.println("whiteFang.getYear = " + whiteFang.getYear());
    }
}