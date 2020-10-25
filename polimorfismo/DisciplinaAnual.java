package polimorfismo;

public class DisciplinaAnual extends Disciplina{
	
	double nota3,nota4, nota5, nota6, result; 

	DisciplinaAnual(String nome, String periodo, double nota1, double nota2, double nota3, double nota4, double nota5, double nota6) {
		super(nome, periodo, nota1, nota2);
	
		this.nota3 = nota3;
		this.nota4 = nota4;
		this.nota5 = nota5;
		this.nota6 = nota6;
		
	}

	@Override
	public void avaliarDisciplina() {
		
		result = ((nota1+nota2+nota3+nota4+nota5)/5.0 * 0.6)+(nota6 * 0.4);
		System.out.println(result);
		
	}

	public double getNota3() {
		return nota3;
	}

	public void setNota3(double nota3) {
		this.nota3 = nota3;
	}

	public double getNota4() {
		return nota4;
	}

	public void setNota4(double nota4) {
		this.nota4 = nota4;
	}

	public double getNota5() {
		return nota5;
	}

	public void setNota5(double nota5) {
		this.nota5 = nota5;
	}

	public double getNota6() {
		return nota6;
	}

	public void setNota6(double nota6) {
		this.nota6 = nota6;
	}

	public double getResult() {
		return result;
	}

	public void setResult(double result) {
		this.result = result;
	}

}
