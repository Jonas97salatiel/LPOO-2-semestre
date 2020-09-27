package ex05;

public class Main {

	public static void main(String[] args) {
		
		
		Pneus objPneus = new Pneus(1000.00, "Pneus de chuva", "Pirelle");
		Motor objMotor = new Motor(200, 5000.00, "Ford");
		Banco objBanco = new Banco(2000.00, "coro", "Ford");
		
		Carro objCarro = new Carro(objBanco, objPneus, objMotor);

		objCarro.totalPreco(objBanco, objPneus, objMotor);
		
		
		Pneus objPneus1 = new Pneus(1500.00, "Pneus lisos", "Pirelle");
		Motor objMotor1 = new Motor(350, 9000.00, "Ford");
		Banco objBanco1 = new Banco(1500.00, "Algodão", "Ford");
		
		Carro objCarro1 = new Carro(objBanco1, objPneus1, objMotor1);

		objCarro1.totalPreco(objBanco1, objPneus1, objMotor1);
		
		Pneus objPneus2 = new Pneus(2000.00, "Pneu medio", "Pirelle");
		Motor objMotor2 = new Motor(60, 700.00, "Ford");
		Banco objBanco2 = new Banco(2000.00, "Sintetico", "Ford");
		
		Carro objCarro2 = new Carro(objBanco2, objPneus2, objMotor2);

		objCarro2.totalPreco(objBanco2, objPneus2, objMotor2);

	}

}
