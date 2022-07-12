public class Main {
    public static void main(String[] args) {
        Author rayBradbury = new Author("Ray", "Bradbury");
        Book fahrenheit451 = new Book("Fahrenheit 451", rayBradbury, 1953);
        System.out.println(fahrenheit451);

        Book fahrenheit451NewYear = new Book("Fahrenheit 451", rayBradbury, 1990);
        Book fahrenheit451Second = new Book("Fahrenheit 451", rayBradbury, 1953);

        System.out.println();

        Author jackLondon = new Author("Jack", "London");
        Book whiteFang = new Book("White Fang", jackLondon,1906);
        System.out.println(whiteFang);

        whiteFang.setYear(2000);
        System.out.println(whiteFang);

        System.out.println(whiteFang.equals(fahrenheit451));
        System.out.println(fahrenheit451.equals(fahrenheit451Second));
        System.out.println(fahrenheit451NewYear.equals(fahrenheit451));
    }
}