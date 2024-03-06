package entities;
import java.lang.Math;
public class Calculos {
	public float largura;
	public float comprimento;
	public float area(){
		float calcArea = largura*comprimento;
		return calcArea;
	}
	public float perimetro(){
		float calcPerimetro = 2*(largura+comprimento);
		return calcPerimetro;
	}
	public float diagonal(){
		float calcDiagonal = (float) Math.sqrt(Math.pow(largura,2)+Math.pow(comprimento,2));
		return calcDiagonal;
	}
}
