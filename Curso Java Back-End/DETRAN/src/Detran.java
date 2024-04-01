import java.util.Scanner;
import java.util.Locale;
import entidades.Carro;
public class Detran {
	public static void main (String[]args){
		Scanner scan = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		Carro carro = new Carro();

			System.out.println("INFORME OS DADOS DO CARRO:");
			System.out.println("INFORME A FABRICANTE:");
			carro.marca = scan.nextLine();
			System.out.println("INFORME O MODELO: ");
			carro.modelo = scan.nextLine();
			System.out.println("INFORME O ANO DE FABRICAÇÃO: ");
			carro.anoFabricacao = scan.nextInt();
			scan.nextLine();
			System.out.println("INFORME A COR: ");
			carro.cor = scan.nextLine();
			System.out.println("DADOS ARMAZENADOS COM SUCESSO!");
			System.out.printf("MARCA: %s\n MODELO: %s\n ANO: %d\n COR: %s \n",
					carro.marca, carro.modelo, carro.anoFabricacao, carro.cor);
		}

	}

