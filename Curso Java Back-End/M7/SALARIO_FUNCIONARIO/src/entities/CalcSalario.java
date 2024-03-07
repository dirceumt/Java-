package entities;
public class CalcSalario {
	public String nome;
	public double salarioBruto;
	public double irpf;
	public double descIrpf = 0;
	public void calcIrpf(){
		this.descIrpf = this.salarioBruto*(this.irpf/100);
	}
	public double salarioLiquido(){
		calcIrpf();
		double liquido = salarioBruto - descIrpf;
		return liquido;
	}


}
