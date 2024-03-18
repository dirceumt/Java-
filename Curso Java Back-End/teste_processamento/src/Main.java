import java.util.Locale;
public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
    double n1 = 3;
    double n2 = n1*5;
    double multiplicacao = n1*n2;
    System.out.printf("O NUMERO 1 É %.2f %n O NUMERO 2 É %.2f %n SUA MULTIPLICAÇÃO DA: %.2f %n", n1, n2, multiplicacao );
    double divisao = (double) n1/n2;
    System.out.printf("SUA DIVISÃO É: %.2f", divisao);

    }


}