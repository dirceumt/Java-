public class Calculadora {

	static double calcularMedia(int[] numeros){
		int soma = 0;

		/*for(int i = 0; i<5; i++){
			soma += numeros[i];*/
		for(int i = 0; i<numeros.length; i++){
			soma += numeros[i];

		}
		return soma/numeros.length;
	}
}
