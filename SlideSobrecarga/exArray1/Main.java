package exArray1;

public class Main {

	public static void main(String[] args) {
		
		double[] notas = {10,7,5,4,8,9,6.5,5.5,8,7};
		
		Curso curso = new Curso("Inglês", notas);
		
		curso.mediaNotas();
		curso.maiorNota(notas);
		

	}

}
