package tictactoeLpoo.core;

/*classe responsável por controlar os movimentos no board*/

public class Move {
	
	private int i;
	private int j;
	
	public Move(String MoveStr) throws InvalidMoveException{
		/*Tratamento de exceção para evitar que o jogador informe posições inválidas.*/
		try {
			
			
			String[] tokens = MoveStr.split(",");
			
			this.i = Integer.parseInt(tokens[0]) ;
			this.j = Integer.parseInt(tokens[1]) ;

			
		} catch(Exception e) {
			
			throw new InvalidMoveException("Ajogada é inválida");
			
		}
		

	}
	
	public void play() {
		
	}

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	public int getJ() {
		return j;
	}

	public void setJ(int j) {
		this.j = j;
	}
	

}
