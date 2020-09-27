package retangulo;

public class Retangulo {

	double largura;
	double comprimento;
	
	public Retangulo(double largura, double comprimento) {
		
		this.largura = largura;
		this.comprimento = comprimento;
		
	}
	
	public double getLargura() {
		return largura;
	}
	public void setLargura(double largura) {
		while (largura < 0 || largura > 20 ) {
			System.out.println("largura invalida. Favor informar largura maior que 0 ou menor que 20" );
			
		}
		this.largura = largura;
	}
	public double getComprimento() {
		return comprimento;
	}
	public void setComprimento(double comprimento) {
		while (comprimento < 0 || comprimento > 20 ) {
			System.out.println("comprimento invalido. Favor informar comprimento maior que 0 ou meno que 20" );
			
		}
		this.comprimento = comprimento;
	}
	
	
	public void calcArea(double largura, double comprimento) {
		
		double area = largura*comprimento;
		
		System.out.println("A Área do rentângulo é igual a " + area);
	}
	
	
	public void calcPerimetro(double largura, double comprimento) {
		
		double perimetro = (largura+comprimento)/2 ;
		
		System.out.println("O perímetro do rentângulo é igual a " + perimetro);
	}
	
}
