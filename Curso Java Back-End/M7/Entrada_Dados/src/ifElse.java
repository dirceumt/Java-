import java.util.Scanner;
import java.util.Locale;
public class ifElse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("DIGITE A QUANTIDADE DE MINUTOS ULTILIZADAS: ");
        int num = scan.nextInt();
        double juros = (double)0.5*num;
        if(num <= 100){
            System.out.println("O VALOR DE SUA FATURA É R$ 50.00");
              }
        else{
            System.out.println("O VALOR DE SUA FATURA É: R$ "+juros + "Reais");
        }

        scan.close();
    }
}
