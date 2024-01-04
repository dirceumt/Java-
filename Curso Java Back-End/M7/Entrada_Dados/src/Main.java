import java.util.Scanner;
import java.util.Locale;
import java.lang.Math;
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        System.out.println("INFORME UM NÚMERO QUALQUER: ");
        double x = scan.nextDouble();
        System.out.println("SEU NUMERO É: " +x);




        scan.close();
    }
}