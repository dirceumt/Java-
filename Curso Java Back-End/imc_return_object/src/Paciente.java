public class Paciente {
	double peso;
	double altura;

	//estou criando uma classe Paciente que tem como metodo calcularIndiceMassaCorporal do tipo IndiceMassaCorporal e
	// instancia um objeto IndiceMassaCorporal e atribui a variavel imc os valores atribuidos a resultado, peso e
	// altura conforme o codigo abaixo:
	IndiceMassaCorporal calcularIndiceMassaCorporal() {
		IndiceMassaCorporal imc = new IndiceMassaCorporal();
		imc.resultado = peso / (altura * altura);
		imc.peso = peso;
		imc.altura = altura;

		return imc;
		//atribui o valor do calculo do imc a variavel resultado chamando o argumento  imc.resultado
		//peso a imc.peso e altura a imc.altura
	}

}
