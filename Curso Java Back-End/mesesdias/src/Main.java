public class Main {
	public static void main(String[] args) {

		String [] mes = {"jan", "fev", "mar", "abr", "mai", "jun", "jul",
				"ago", "set", "out", "nov", "dez"};
		int [] total = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		for (int i = 0; i < mes.length; i++) {
			System.out.println(mes[i]);
			System.out.println(total[i]);

		}
	}
}