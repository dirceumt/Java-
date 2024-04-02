public class Main {
	public static void main(String[] args) {
		Numeros numeros = new Numeros();
		/*int valor = numeros.getNumero1();
		System.out.println(valor);*/
		numeros.setNumero1(69);
		int novoNumero = numeros.getNumero1();
		System.out.println(novoNumero);

	}
}