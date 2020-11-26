package tictactoeLpoo.core;

import tictactoeLpoo.Constants;
import tictactoeLpoo.ui.UI;

public class Board {
	
	
	private char [][] matrix; /*Matriz que ir� armezenar as jogadas*/
	
	/* Fun��o que inst�ncia a matriz do jogo, passando o tamanho do mesmo.*/
	public Board() {
		matrix = new char[Constants.BOARD_SIZE][Constants.BOARD_SIZE];
		clear();
	}
	
	
	/* Fun��o para limpar o jogo.*/
	public void clear() {
		
		for(int i = 0; i < matrix.length; i++) {
			
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = ' ';
			}
		}
	}
	
	/* Fun��o para imprimi o jogo.*/
	
	public void print () {
		
		UI.printNewLine();
			
		for(int i = 0; i < matrix.length; i++) {
			
			for (int j = 0; j < matrix[i].length; j++) {
				
				UI.printTextWithNoNewLine(String.valueOf(matrix[i][j]));
				
				if( j < matrix[i].length -1) {
					
					UI.printTextWithNoNewLine(" | ");
				}
			
			}
			
			UI.printNewLine();
			
			if(i < matrix.length - 1 ) {
				
				UI.printText("---------");
			}
			
		}
	}
	
	/* Fun��o para verificar se o board est� completamente preenchido.*/
	
	public boolean isFull() {
		
		for(int i = 0; i < matrix.length; i++) {
			
			for (int j = 0; j < matrix[i].length; j++) {
				
				if (matrix [i][j] == ' ') {
					return false;
				}
			}
		}
		
		return true;
	}
	
	/* Fun��o que controla os movimentos dos players.*/
	
	public boolean play(Player player, Move move) throws InvalidMoveException{
		
		int i = move.getI();
		int j = move.getJ();
		
		if(i < 0 || j < 0 || i > Constants.BOARD_SIZE || j >= Constants.BOARD_SIZE) {
			
			throw new InvalidMoveException("O intervalo da jogada � inv�lido");
		}
		
		if(matrix[i][j] != ' ') {
			throw new InvalidMoveException("Esta jogada j� foi realizada!");
		}
		
		matrix[i][j] = player.getSymbol();
	
		return checkRows(player) || checkCols(player) || checkDiagonal1(player) || checkDiagonal2(player);
		
		
	}
	
	/* Fun��o para verificar se detemrinado jogador j� marcou todas as posi��es em alguma das linhas.*/
	
	private boolean checkRows(Player player) {
		
		for (int i = 0; i < Constants.BOARD_SIZE; i++) {
		
			if(checkRow(i, player)) {
				return true;
			}
		}
		
		return false;
	}
	
	/*Fun��o que verifica se determinado jogador j� marcou todas as posi��es da linha*/
	
	private boolean checkRow(int i, Player player) {
		
		char symbol = player.getSymbol();
		
		for( int j = 0 ; j < Constants.BOARD_SIZE; j++) {
			
			if(matrix[i][j] != symbol ) {
				return false;
			}
		}
		
		return true;
	}
	
	/* Fun��o para verificar se detemrinado jogador j� marcou todas as posi��es em alguma das colunas.*/
	
	private boolean checkCols(Player player) {
		
		for (int j = 0; j < Constants.BOARD_SIZE; j++) {
		
			if(checkCol(j, player)) {
				return true;
			}
		}
		
		return false;
	}
	
	
	/*Fun��o que verifica se determinado jogador j� marcou todas as posi��es da coluna*/
	
	private boolean checkCol(int j, Player player) {
		
		char symbol = player.getSymbol();
		
		for( int i = 0 ; i < Constants.BOARD_SIZE; i++) {
			
			if(matrix[i][j] != symbol ) {
				return false;
			}
		}
		
		return true;
	}
	
	/*Fun��o que verifica se determinado jogador j� marcou todas as posi��es da diogonal*/
	
	private boolean checkDiagonal1(Player player) {
		
		char symbol = player.getSymbol();
		
		for (int i = 0; i < Constants.BOARD_SIZE; i++) {
			
			if( matrix[i][i] != symbol ) {
				return false;
			}
		}
		
		return true;
	}
	
	
	private boolean checkDiagonal2(Player player) {
		
		char symbol = player.getSymbol();
		int lastLine = Constants.BOARD_SIZE - 1;
		
		for (int i = lastLine, j = 0; i >= 0; i--, j++) {
			if(matrix[i][j] != symbol) {
				return false;
			}
			
		}
		
		return true;
	}
	
	

}
