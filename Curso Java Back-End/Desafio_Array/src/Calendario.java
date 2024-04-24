public class Calendario {
//cria a classe calendário
	String obterNomeMes(int numeroMes) {
//cria o método obterNomeMes e atribui como parâmetro o int numeroMes
		String [] mes = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro",
			"Outubro", "Novembro", "Dezembro"};//cria o array com o nome dos meses
		return mes[numeroMes-1];//retorna o String do indice-1, pois inicia do 0, se não por o -1 fica um mês a frente
	}

}