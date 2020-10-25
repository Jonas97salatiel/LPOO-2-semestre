package polimorfismo;

public class DisciplinaSemestral extends Disciplina{
	
	
	double nota3, result; 
	
	
	DisciplinaSemestral(String nome, String periodo, double nota1, double nota2, double nota3) {
		
		super(nome, periodo, nota1, nota2);
		
		this.nota3 = nota3;
		
	}

	public void avaliarDisciplina() {	
		
		result = (nota1 + nota2 + nota3)/3;
		System.out.println(result);
		
	}
	
	
	public void setNota3(double nota3) {
		this.nota3 = nota3;
	}
	
	public double getNota2() {
		return this.nota3;
	}

}
