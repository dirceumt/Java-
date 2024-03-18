import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        System.out.println("Hello world!");
        System.out.println("Ola mundo!");

        double x = 100.121215748;
        System.out.printf("%.2f%n", x);
        int y = 100;
        System.out.println(y);

    }
}