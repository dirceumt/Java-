package entidades;
public class FunctionArea {
	public double calcularArea(double a, double b, double c){//encapsula no metodo calcularArea que vai ser chamado na outra classe
		double p = (a+b+c)/2;
		return Math.sqrt(p*(p-a)*(p-b)*(p-c));
	}

}
