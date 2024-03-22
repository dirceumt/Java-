public class Aeronave {
	String ativo;
	int totalAssentos;
	int assentosReservados = 19;
	int calculoAssentosDisponiveis(){
		return totalAssentos - assentosReservados;
	}
	String ativarDesativar(){
		if (assentosReservados>0){
			this.ativo = "Ativada";
		}else{
			this.ativo = "Desativada";
		}
		return this.ativo;
	}
}
