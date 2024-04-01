public class Main {
	public static void main(String[] args) {

		Cliente cliente = new Cliente();
		//chamando a classe wrapper
		//cliente.idade = null;

		/*int idade = 37;
		double novaIdade = (double) idade;
		System.out.println(novaIdade);

		Integer idade = 37;
		Double novaIdade = idade.doubleValue();

		System.out.println(novaIdade);*/
	Integer num1 = 128; //cliente@794
	Integer num2 = 128;//cliente@795
		System.out.println(num1 == num2);
//da false porque o operador == está comparando o endereço do espaço na memoria e não o valor armazenado nele
		//porque o Integer é um objeto e a variavel está fazendo referência ao objeto e armazenando o valor nele


	}
}