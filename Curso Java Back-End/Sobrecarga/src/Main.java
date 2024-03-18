import java.util.Scanner;
import java.util.Locale;
import entidades.CalcArea;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		CalcArea area = new CalcArea();
		System.out.println("==============================================");
		System.out.println("=============CALCULADORA DE ÁREAS=============");
		System.out.println("==============================================");
		System.out.println("                                              ");
		System.out.println("Selecione a área que deseja calcular:");
		System.out.println("Digite R para área de um retângulo ");
		System.out.println("Digite C para área de um círculo ");
		String select = scan.next();
		do {
			switch (select.toUpperCase()) {
				case "R":

					System.out.println("Digite a largura do retângulo: ");
					double larg = scan.nextDouble();
					System.out.println("Digite o comprimento do retângulo: ");
					double compri = scan.nextDouble();
					double arearet = area.CalcArea(larg, compri);
					System.out.printf("A ÁREA DE SEU RETÂNGLO É: %.2f %n ", arearet);
					break;
				case "C":
					System.out.println("Digite o raio do círculo: ");
					double raio = scan.nextDouble();
					double areacirc = area.CalcArea(raio);
					System.out.printf("A ÁREA DE SEU CÍRCULO É: %.2f%n ", areacirc);
					break;
				default:
					System.out.println("OPÇÃO INVÁLIDA, TENTE NOVAMENTE! ");

			}
		}while(true);



	}
	}