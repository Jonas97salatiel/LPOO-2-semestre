package ex05;

public class Carro {

	
	Banco banco;
	Pneus pneus;
	Motor motor;
	double total;

	
	public Carro(Banco banco, Pneus pneus, Motor motor) {
		
		this.banco = banco;
		this.pneus = pneus;
		this.motor = motor;
	}
	
	

	public Banco getBanco() {
		return banco;
	}
	public void setBanco(Banco banco) {
		this.banco = banco;
	}
	public Pneus getPneus() {
		return pneus;
	}
	public void setPneus(Pneus pneus) {
		this.pneus = pneus;
	}
	public Motor getMotor() {
		return motor;
	}
	public void setMotor(Motor motor) {
		this.motor = motor;
	}
	 
	
	
	public void totalPreco(Banco Banco, Pneus pneus, Motor motor ) {
		
		total = Banco.getPreco() + pneus.getPreco() + motor.getPreco();
		System.out.println("#### Valores do Carro ###");
		System.out.println("Valor do banco = " + Banco.getPreco());
		System.out.println("Valor dos pneus = " + pneus.getPreco());
		System.out.println("Valor do motor = " + motor.getPreco());
		System.out.println("Valor do carro = " + total);
		
	}
	
}
