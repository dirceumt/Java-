public class Main {
	public static void main(String[] args) {

		Turmas turma1 = new Turmas();
		turma1.idTurma = "TURMA 1";
		turma1.nomeProfessora = "Dona Maria";
		turma1.alunos = new Aluno[3];

		turma1.alunos[0] = new Aluno();
		turma1.alunos[0].nome = "Antonio";

		turma1.alunos[1] = new Aluno();
		turma1.alunos[1].nome = "Maria";

		turma1.alunos[2]= new Aluno();
		turma1.alunos[2].nome = "Joana";

		System.out.println();
	}
}