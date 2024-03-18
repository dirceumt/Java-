import entidades.FunctionProduct;
//import entidades.Produtos -> não necessita importar pois ja ta declarada na classe FunctionProduct;
import java.util.Locale;
import java.util.Scanner;
public class Program {
	public static void main (String[]args){
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		FunctionProduct produto = new FunctionProduct();
		while (true){
				 produto.voltarMenu();
			String entrada = scan.next();

			switch (entrada.toUpperCase()){
				case "C":
					produto.novoProduto();
					break;
				case "R":
					System.out.println("VEM O MÉTODO REMOVER!");
					break;
				case "E":
					produto.consultarEstoque();
					break;
				case "S":
					System.out.println("PROGRAMA ENCERRADO!");
					//codigo encerrar
					return;
				default:
					System.out.println("OPÇÃO INVÁLIDA, TENTE NOVAMENTE!");
					continue;

			}

		}
	}


	}

