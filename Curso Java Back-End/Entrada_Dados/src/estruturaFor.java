import java.util.Scanner;
public class estruturaFor {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("digite um numero: ");
		int x = scan.nextInt();
		for (int num = 0; num <= x; num++) {
			System.out.println(num);
		}
	}
}