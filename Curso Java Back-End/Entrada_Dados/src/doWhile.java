import java.util.Scanner;
import java.util.Locale;
public class doWhile {
	public static void main (String[]args){
		Scanner scan = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		do{
			System.out.println("DIGITE A TEMPERATURA EM CELCIUS: ");
			double tc = scan.nextDouble();
			double tf = ((9*tc)/5)+32;
			System.out.println("SUA TEMPERATURA EM FAHRENHEIT É: "+tf);
			System.out.println("DESEJA REPETIR? s(sim) n(não) ");
			char resposta = scan.next().charAt(0);
			if(resposta != 's' && resposta != 'S'){
				break;
			}
		} while(true);
		scan.close();
	}
}
