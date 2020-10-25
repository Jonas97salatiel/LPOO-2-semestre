package polimorfismo;

public abstract class Disciplina {
	
	String nome, periodo;
	
	double nota1, nota2;
	
	Disciplina(String nome, String periodo, double nota1, double nota2){
			
		this.nome = nome;
		this.periodo= periodo;
		this.nota1 = nota1;
		this.nota2 = nota2;
	}
	
	public abstract void avaliarDisciplina();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getPeriodo() {
		return periodo;
	}

	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}

	public double getNota1() {
		return nota1;
	}

	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}

	public double getNota2() {
		return nota2;
	}

	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}
	

}
