package entidades;
public class CalcArea {
	public double CalcArea(double l1, double l2) {
		double calcularArea = l1 * l2;
		return calcularArea;
	}
//sobrecarga de método. estou usando o metodo CalcArea duas vezes e alterando só os parâmetros.
	public double CalcArea(double raio) {
		double calcularArea = Math.PI * Math.pow(raio, 2);
		return calcularArea;
	}
}
