public class Principal {
	public static void main(String[] args) {
		Aeronave aeronave = new Aeronave();
		aeronave.totalAssentos = 100;

	System.out.printf("AERONAVE (%s): %d Assentos disponíveis!\n", aeronave.ativarDesativar(),
			aeronave.calculoAssentosDisponiveis());

	}
}