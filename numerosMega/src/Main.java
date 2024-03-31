import java.util.ArrayList;



public class Main {
	public static void main(String[] args) {

		/*int[] jogo1 = {45, 25, 34, 12, 28, 4};

		int[] jogo2 = Arrays.copyOf(jogo1, 6);
		System.out.println(Arrays.toString(jogo2));*/

		ArrayList<String> alunos = new ArrayList<>();
		alunos.add("JOAO");
		alunos.add("MARIA");

		for (int i = 0; i < alunos.size(); i++) {
			String aluno = alunos.get(i);
			System.out.println(aluno);


		}
	}
}