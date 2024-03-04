import entidades.FunctionArea;
import java.util.Locale;
import java.util.Scanner;

public class AreaTrianguloComPooo{
	public static void main (String[]args){
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		FunctionArea calcArea = new FunctionArea();
		System.out.println("INFORME OS 3 LADOS DO PRIMEIRO TRIÂNGULO: ");
		int x1 = scan.nextInt();
		int x2 = scan.nextInt();
		int x3 = scan.nextInt();
		System.out.println("INFORME OS TRÊS LADOS DO SEGUNDO TRIÂNGULO: ");
		int y1 = scan.nextInt();
		int y2 = scan.nextInt();
		int y3 = scan.nextInt();
		double area1 = calcArea.calcularArea(x1, x2, x3);
		double area2 = calcArea.calcularArea(y1, y2, y3);
		if (area1>area2){
			System.out.println("O MAIOR TRIÂNGULO É O PRIMEIRO! ");
		}
		else{
			System.out.println("O MAIOR TRIÂNGULO É O SEGUNDO! ");
		}
	}
}