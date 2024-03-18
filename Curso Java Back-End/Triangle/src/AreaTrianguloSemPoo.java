import java.util.Locale;
import java.util.Scanner;

public class AreaTrianguloSemPoo{
	public static void main (String[]args){
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		System.out.println("INFORME OS TRÊS LADOS DO TRIÂNGULO: ");
		int l1 = scan.nextInt();
		int l2 = scan.nextInt();
		int l3 = scan.nextInt();
		double p1 = (l1+l2+l2)/2;
		double area1 = Math.sqrt(p1*(p1-l1)*(p1-l2)*(p1-l3));
		System.out.println("INFORME OS TRÊS LADOS DO SEGUNDO TRIÂNGULO: ");
		int x1 = scan.nextInt();
		int x2 = scan.nextInt();
		int x3 = scan.nextInt();
		double p2 = (x1+x2+x3)/2;
		double area2 = Math.sqrt(p2*(p2-x1)*(p2-x2)*(p2-x3));
		if (area1>area2){
			System.out.println("O MAIOR É O PRIMEIRO!");
		}
		else {
			System.out.println("O MAIOR É O SEGUNDO!");
		}

	}

}