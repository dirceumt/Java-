import java.util.Locale;
import java.util.Scanner;

public class dia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        System.out.println("DIGITE UM NUMERO DE 1 A 7 RELACIONADOS AOS DIAS DA SEMANA: ");
        int  x = scan.nextInt();
        String dia;

        switch(x) {
            case 1:
                dia = "SEGUNDA-FEIRA!";
                break;
            case 2:
                dia = "TERÇA-FEIRA!";
                break;
            case 3:
                dia = "QUARTA-FEIRA!";
                break;
            case 4:
                dia = "QUINTA-FEIRA!";
                break;
            case 5:
                dia = "SEXTA-FEIRA!";
                break;
            case 6:
                dia = "SÁBADO!";
                break;
            case 7:
                dia = "DOMINGO!";
                break;
            default:
                dia = "ENTRADA INCORRETA, TENTE NOVAMENTE!";
        }
        System.out.println("O DIA ESCOLHIDO FOI " + dia);
                scan.close();

    }


}
