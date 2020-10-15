package ex01Static;

public class Main {

	public static void main(String[] args) {
	
		Livro obj01 = new Livro(5);
		
		obj01.disponivel();
		
		obj01.emprestado();
		
		obj01.emAtraso();
		
		obj01.reservado();
		
		Revista obj02 = new Revista(5);
		
		obj02.disponivel();
		
		obj02.emprestado();
		
		obj02.emAtraso();
		
		obj02.reservado();
		
		Tese obj03 = new Tese(5);
	
		obj03.disponivel();
		
		obj03.emprestado();
		
		obj03.emAtraso();
		
		obj03.reservado();
		

	}

}
