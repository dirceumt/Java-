public class Calculadora {
	static double calcularMedia(double [] numeros){
		double total = 0;
		for (int i = 0; i<numeros.length; i++){
			total += numeros[i];

		}
		return total /numeros.length;
	}
}
