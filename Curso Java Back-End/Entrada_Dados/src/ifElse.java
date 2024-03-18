import java.util.Scanner;
import java.util.Locale;
public class ifElse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("DIGITE A QUANTIDADE DE MINUTOS ULTILIZADAS: ");
        int num = scan.nextInt();
        int ecedente = num - 100;
        double juros = (double)2*ecedente;
        double total = (double)juros + 50;
        if(num <= 100){
            System.out.println("O VALOR DE SUA FATURA É R$ 50.00");
              }
        else{
            System.out.printf("O VALOR DE SUA FATURA É: R$ %.2f %n", total );
            System.out.printf("OS JUROS POR ATRASO FORAM: R$ %.2f %n", juros );
        }

        scan.close();
    }
}
