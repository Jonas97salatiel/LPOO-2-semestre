package polimorfismo;

public class DisciplinaTrimestral extends Disciplina{
	
	private double result;

	DisciplinaTrimestral(String nome, String periodo, float nota1, float nota2) {
		super(nome, periodo, nota1, nota2);
		
	}

	@Override
	public void avaliarDisciplina() {
		
		result = ((nota1 * 0.4) + (nota2 * 0.6));
		System.out.println(result);
		
	}

}
