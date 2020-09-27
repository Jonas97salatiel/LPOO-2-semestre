package exArray2;

import java.util.Date;

public class Carro {

	
	String modelo;
	Date date;
	double[] preco = new double[5];
	double maiorPreco;
	
	public Carro(String modelo, Date date, double[] preco) {
		
		this.modelo = modelo;
		this.date = date;
		this.preco = preco;
		
	}
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public double[] getPreco() {
		return preco;
	}
	public void setPreco(double[] preco) {
		this.preco = preco;
	}
	
	public void maiorPreco(double[] preco) {
			
			double maiorPreco = preco[0];
			
			for (int i = 0; i < preco.length; i++) {
				if(preco[i] > maiorPreco) {
					maiorPreco = preco[i];
				}
			}
			
			System.out.println("A maior preço é o " + maiorPreco);
			
		
	}
	
	public void menorPreco(double[] preco) {
		
		double menorPreco = preco[0];
		
		for (int i = 0; i < preco.length; i++) {
			if(preco[i] < menorPreco) {
				menorPreco = preco[i];
			}
		}
		
		System.out.println("O menor preço é o " + menorPreco);
		
	
	}
	
	public void mediaPreco() {
		
		double mediaPreco = preco[0];
		
		for (int i = 0; i < preco.length; i++) {
			
			mediaPreco = mediaPreco + preco[i];
		}
		
		mediaPreco = mediaPreco / 5;
		
		System.out.println("A media das notas é a " + mediaPreco);
	}
	
	
	
}
