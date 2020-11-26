package tictactoeLpoo.core;

import tictactoeLpoo.ui.UI;



public class Player {
	
	
	private String name;
	private Board board;
	private char symbol;
	
	
	
	public Player(String name, Board board, char symbol) {
		super();
		this.name = name;
		this.board = board;
		this.symbol = symbol;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Board getBoard() {
		return board;
	}


	public void setBoard(Board board) {
		this.board = board;
	}


	public char getSymbol() {
		return symbol;
	}


	public void setSymbol(char symbol) {
		this.symbol = symbol;
	}

	
	/*Função responsável por receber o movimento do jogador.*/

	private Move inputMove() throws InvalidMoveException {
		
		String moveStr = UI.readInput("Jogador '" + name + "' => ");
		
		return new Move(moveStr);
		
		
	}
	
	/*Função responsável por marcar o movimento do jogador no board.*/
	public boolean play() throws InvalidMoveException{
	
		Move move = inputMove();
		return board.play(this, move);
		
	}

}
