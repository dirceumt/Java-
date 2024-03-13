package entities;
public class CalcSalario {
	public String nome;
	public double salarioBruto;
	public double irpf;
	public double descIrpf = 0;
	public double aumento = 0;
	public void setAumento(double aumento){
		this.aumento = aumento;
	}
	public void calcIrpf(){

		this.descIrpf = this.salarioBruto*(this.irpf/100); //pega as variáveis de instância e faz o cálculo e armazena
		// o resultado dele na var descIrpf
	}
	public double salarioLiquido(){

		calcIrpf(); //chama o método para garantir que o desconto do irpf seja feito antes
		double liquido = salarioBruto - descIrpf;
		return liquido;
	}
	public double aumentoSalario(){
		return (salarioBruto*(this.aumento/100)) + salarioBruto;
	}
}
