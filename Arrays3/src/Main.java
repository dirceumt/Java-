public class Main {
	public static void main(String[] args) {

		Turmas turma1 = new Turmas();
		turma1.idTurma = "TURMA 1";
		turma1.nomeProfessora = "Dona Maria";
		turma1.alunos = new Aluno[3];

		turma1.alunos[0] = new Aluno();
		turma1.alunos[0].nome = "Antonio";
		turma1.alunos[0].idade = 3;

		turma1.alunos[1] = new Aluno();
		turma1.alunos[1].nome = "Maria";
		turma1.alunos[1].idade = 4;

		turma1.alunos[2]= new Aluno();
		turma1.alunos[2].nome = "Joana";
		turma1.alunos[2].idade = 4;

		/*for (int i = 0; i < turma1.alunos.length; i++) {
			if (turma1.alunos[i] != null) {
				System.out.printf("%d, %s, %d anos %n", i, turma1.alunos[i].nome, turma1.alunos[i].idade);
			}
		}
		for (int i = 0; i < turma1.alunos.length; i++) {
			Aluno aluno = turma1.alunos[i];
			if (turma1.alunos[i] != null) {
				System.out.printf("%d, %s, %d anos %n", i, turma1.alunos[i].nome, turma1.alunos[i].idade);*/
		turma1.imprimirListaAlunos();
	}
}

