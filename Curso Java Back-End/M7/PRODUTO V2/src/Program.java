import java.util.Locale;
import java.util.Scanner;
import entities.Product;
public class Program {

	public static void main(String[] args) {
		do {
			Scanner scan = new Scanner(System.in);
			Locale.setDefault(Locale.US);
			Product product = new Product();
			System.out.println("====CADASTRO DE PRODUTO====");
			System.out.println("INFORME O NOME DO PRODUTO: ");
			product.name = scan.nextLine();
			System.out.println("INFORME A QUANTIDADE DE ITENS: ");
			product.quantity = scan.nextInt();
			System.out.println("INFORME O PREÇO DO PRODUTO: ");
			product.price = scan.nextDouble();
			System.out.printf("PRODUTO: %s %n QUANTIDADE: %d %n VALOR EM ESTOQUE: %.2f %n", product.name,
					product.quantity, product.price);
			System.out.println();
			System.out.println(product);
		}while (true);
	}
}