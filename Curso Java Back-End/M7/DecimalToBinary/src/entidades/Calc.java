package entidades;
public class Calc {
	public String converter (int decimal){
		StringBuilder binario = new StringBuilder();
		if (decimal == 0) {
			return "0";
		}
		while (decimal > 0){
			int restoDiv = decimal % 2;
			binario.insert(0,restoDiv);
			decimal /=2;
		}
		return binario.toString();

	}
}
