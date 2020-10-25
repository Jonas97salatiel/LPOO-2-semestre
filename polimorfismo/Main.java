package polimorfismo;

public class Main {

	public static void main(String[] args) {
		
		Disciplina[] Boletim = new Disciplina[3];
		
		Boletim[0] = new DisciplinaTrimestral("LPOO2", "nortuno", 7, 3);
		Boletim[1] = new DisciplinaSemestral("LPOO2", "nortuno", 7, 3, 8);
		Boletim[2] = new DisciplinaAnual("LPOO2", "nortuno", 7, 3, 3, 8, 9, 7);
		
		Boletim[0].avaliarDisciplina();
		Boletim[1].avaliarDisciplina();
		Boletim[2].avaliarDisciplina();
		
		
		
		

	}

}
