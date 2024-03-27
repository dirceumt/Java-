import java.util.Arrays;


public class Main {
	public static void main(String[] args) {

		int[] jogo1 = {45, 25, 34, 12, 28, 4};

		int[] jogo2 = Arrays.copyOf(jogo1, 6);
		System.out.println(Arrays.toString(jogo2));
	}
}