import java.util.Scanner;
import java.util.Locale;
public class funcoesJava {
	public static void main (String[] args){
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		System.out.println("INFORME TRÊS NUMEROS: ");
		double n1 = scan.nextDouble();
		double n2 = scan.nextDouble();
		double n3 = scan.nextDouble();
		double maior = max(n1, n2, n3);
		showResult(maior);
		scan.close();
	}
	public static double max(double n1, double n2, double n3){
		double aux;
		if(n1>n2 && n1>n3){
			aux = n1;
		}
		else if (n2 > n3){
			aux=n2;
		}
		else {
			aux = n3;
		}
		return aux;
	}
public static void showResult(double value){
		System.out.println("O MAIOR É: "+ value);
}
}

