public class CalculoImc {
	double peso;
	double altura;

public double imc() {
	double calculo = peso / (altura * altura);
	return calculo;
}
}
