public class Main {
    public static void main(String[] args) {
        Book Fahrenheit451 = new Book("Fahrenheit 451", new Author("Ray", "Bradbury"), 1953);
        Author RayBradbury = new Author("Ray", "Bradbury");
        System.out.println("Fahrenheit451.getName = " + Fahrenheit451.getName());
        System.out.println("RayBradbury.getAuthorName = " + RayBradbury.getAuthorName());
        System.out.println("RayBradbury.getAuthorSurname = " + RayBradbury.getAuthorSurname());
        System.out.println("Fahrenheit451.getYear = " + Fahrenheit451.getYear());
        System.out.println();

        Book WhiteFang = new Book("White Fang", new Author("Jack", "London"),1906);
        Author JackLondon = new Author("Jack", "London");
        System.out.println("WhiteFang.getName = " + WhiteFang.getName());
        System.out.println("JackLondon.getAuthorName = " + JackLondon.getAuthorName());
        System.out.println("JackLondon.getAuthorSurname = " + JackLondon.getAuthorSurname());
        System.out.println("WhiteFang.getYear = " + WhiteFang.getYear());

        WhiteFang.setYear(2000);
        System.out.println("WhiteFang.getYear = " + WhiteFang.getYear());


    }
}