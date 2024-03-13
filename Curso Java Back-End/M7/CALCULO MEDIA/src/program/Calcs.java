package program;

public class Calcs {
	double primeiraNota;
	double segundaNota;
	double terceiraNota;
	double media;

	public double mediaTrimestre(double primeiraNota, double segundaNota, double terceiraNota){
		this.media = (primeiraNota+segundaNota+terceiraNota)/3;
		return this.media;
	}
	public double reprovacao(){

		double reprovado = 7 - this.media;
		return reprovado;
	}
}
