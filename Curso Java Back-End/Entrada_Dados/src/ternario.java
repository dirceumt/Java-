import java.util.Scanner;
import java.util.Locale;
public class ternario {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        System.out.println("INFORME O VALOR DA COMPRA :" );
        double valor = scan.nextDouble();
        double desconto = (valor <= 100) ? valor * 0.1 : valor*0.15;
        double vdesconto = valor - desconto;
        System.out.printf("O VALOR DA COMPRA FOI %.2f; %nO DESCONTO FOI %.2f; %nO VALOR TOTAL É %.2f!", valor, desconto, vdesconto);



    }
}
