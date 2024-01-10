import entidades.FunctionArea;
import java.util.Locale;
import java.util.Scanner;
public class AreaTrianguloComPooo {
	public static void main (String[]args){
		Scanner scan = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		FunctionArea area = new FunctionArea();//cria instancia(objeto) da classe FunctionArea, atribui a var area
		System.out.println("INFORME OS 3 LADOS DO PRIMEIRO TRIÂNGULO: ");
		double aX = scan.nextDouble();
		double bX = scan.nextDouble();
		double cX = scan.nextDouble();
		System.out.println("INFORME OS 3 LADOS DO SEGUNDO TRIÂNGULO: ");
		double aY = scan.nextDouble();
		double bY = scan.nextDouble();
		double cY = scan.nextDouble();
		double areaX = area.calcularArea(aX, bX, cX); //atribui a var areaX e Y os valores calculados pelo metodo
		double areaY = area.calcularArea(aY, bY, cY);//calcularArea passando os valores aX,bX,cX e aY,bY e cY como
		if (areaX > areaY) {                        //argumentos
			System.out.printf("AREA MAIOR É O TRIÂNGULO 1, COM %.2f" , areaX);
		} else {
			System.out.printf("AREA MAIOR:  É O TRIÂNGULO 2, COM %.2f", areaY);
		}
		scan.close();
	}

}
