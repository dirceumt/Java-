import java.util.Scanner;
import java.util.Locale;

public class AreaTrianguloSemPoo {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		double l1, l2, l3, tl1, tl2, tl3;
		System.out.println("INFORME OS 3 LADOS DO PRIMEIRO TRIÂNGULO: ");
		l1 = scan.nextDouble();
		l2 = scan.nextDouble();
		l3 = scan.nextDouble();
		double p = (l1+l2+l3)/2;
		double area = Math.sqrt(p*(p-l1)*(p-l2)*(p-l3));
		System.out.println("INFORME OS 3 LADOS DO SEGUNDO TRIÂNGULO: ");
		tl1 = scan.nextDouble();
		tl2 = scan.nextDouble();
		tl3 = scan.nextDouble();
		double p2 = (tl1+tl2+tl3)/2;
		double area2 = Math.sqrt(p*(p2-tl1)*(p2-tl2)*(p2-tl3));
		if (area > area2) {
			System.out.printf("AREA MAIOR É O TRIÂNGULO 1, COM %.2f" , area);
		} else {
			System.out.printf("AREA MAIOR:  É O TRIÂNGULO 2, COM %.2f", area2);
		}
		scan.close();

	}
}