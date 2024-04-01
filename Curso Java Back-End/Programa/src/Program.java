import entities.Product;
import java.util.Scanner;
import java.util.Locale;

public class Program {
	public static void main(String[] args) {
	Locale.setDefault(Locale.US);
	Scanner scan = new Scanner(System.in);
	Product product = new Product();
	System.out.println("ENTER PRODUCT DATA: ");
	System.out.println("NAME: ");
	product.name = scan.nextLine();
	System.out.println("PRICE: ");
	product.price = scan.nextDouble();
	System.out.println("QUANTITY IN STOCK");
	product.quantity = scan.nextInt();


	System.out.println(product);
	scan.close();
	}
}
