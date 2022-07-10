public class Main {
    public static void main(String[] args) {
        Book Fahrenheit451 = new Book("Fahrenheit 451", "Ray", "Bradbury", 1953);
        System.out.println("Fahrenheit451.name = " + Fahrenheit451.getName());

        System.out.println("Fahrenheit451.year = " + Fahrenheit451.getYear());

        Book WhiteFang = new Book("White Fang", "Jack","London", 1906);
        System.out.println("WhiteFang.name = " + WhiteFang.getName());

        System.out.println("WhiteFang.year = " + WhiteFang.getYear());

        WhiteFang.setYear(2000);
        System.out.println("WhiteFang.year = " + WhiteFang.getYear());


    }
}