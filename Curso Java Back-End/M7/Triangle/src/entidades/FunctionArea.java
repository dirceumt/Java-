package entidades;
public class FunctionArea{
	public double calcularArea(double a1, double a2, double a3){
		double p = (a1+a2+a3)/2;
		double area = Math.sqrt(p*(p-a1)*(p-a2)*(p-a3));
		return area;
	}

}