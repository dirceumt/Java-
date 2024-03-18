import java.util.Scanner;
public class SwitchExpressions {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (true){
			System.out.println("->HORÁRIO DE FUNCIONAMENTO<-");
			System.out.println("Informe um dia da semana: ");
			String dia = scan.nextLine();
			String horario = switch (dia) {
				case "segunda", "terca", "quarta", "quinta", "sexta" -> horario = "08:00 ÀS 18:00";
				case "sabado", "domingo" -> horario = "FECHADO ";
				default -> "OPÇÃO INVÁLIDA! ";
			};
			System.out.println(horario);

		}
	}
}