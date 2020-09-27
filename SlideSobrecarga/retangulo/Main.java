package retangulo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		try (Scanner input = new Scanner(System.in)) {
			double largura;
			double comprimento;
			
			Retangulo retangulo1 = new Retangulo(0, 0);
			retangulo1.calcArea(0, 0);
			retangulo1.calcPerimetro(0, 0);
			
			System.out.println("informe a largura do retângulo ");
			largura = input.nextDouble();
			
			System.out.println("informe o comprimento do retângulo ");
			comprimento = input.nextDouble();
			
			Retangulo retangulo2 = new Retangulo(largura, comprimento);
			retangulo2.calcArea(largura, comprimento);
			retangulo2.calcPerimetro(largura, comprimento);
		}
		
		
		

	}

}
