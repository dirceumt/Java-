public class Turmas {

	String idTurma;
	String nomeProfessora;
	Aluno[] alunos;
	void imprimirListaAlunos(){
		for (Aluno aluno : alunos) {
			if (aluno != null){
				System.out.printf("%s, %d anos %n", aluno.nome, aluno.idade);
			}

		}
	}
}
