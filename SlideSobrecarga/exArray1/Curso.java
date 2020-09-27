package exArray1;

public class Curso {

	
	String nomeCurso;
	double[] notas = new double[10];
	double media;
	double mediaNotas;
	
	
	public Curso(String nomeCurso, double[] notas) {
		
		this.nomeCurso = nomeCurso;
		this.notas = notas;
		
		
	}
	
	
	
	public String getNomeCurso() {
		return nomeCurso;
	}
	
	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}
	
	public double[] getNotas() {
		return notas;
	}
	
	public void setNotas(double[] notas) {
		
		this.notas = notas;
	}
	
	
	public void mediaNotas() {
		
		for (int i = 0; i < notas.length; i++) {
			
		media = media + notas[i];
		}
		
		mediaNotas = media / 10;
		
		System.out.println("A media das notas é a " + mediaNotas);
	}
	
	public void maiorNota(double[] notas) {
		
		double maiorNota = 0;
		
		for (int i = 0; i < notas.length; i++) {
			if(notas[i] > maiorNota) {
				maiorNota = notas[i];
			}
		}
		
		System.out.println("A maior nota é a " + maiorNota);
		
	
	}
	
	
}
