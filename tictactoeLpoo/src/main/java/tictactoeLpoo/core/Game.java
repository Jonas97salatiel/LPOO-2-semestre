package tictactoeLpoo.core;

/*Est� classe � respons�vel por controlar o jogo.*/

import tictactoeLpoo.Constants;
import tictactoeLpoo.ui.UI;

public class Game {
	
	
	
	private Board board = new Board();
	
	private Player[] players = new Player[Constants.SYMBOL_PLAYERS.length];
	
	
	private int currentPlayerIndex = -1; 
	
	
	public Board getBoard() {
		return board;
	}



	public void setBoard(Board board) {
		this.board = board;
	}



	public Player[] getPlayers() {
		return players;
	}



	public void setPlayers(Player[] players) {
		this.players = players;
	}

	
	/* Fun��o que inicia a partida */
	public void play() {
		
		UI.printGameTitle();
		
		/* Este trecho do c�digo recebe os jogadores da partida*/
		for (int i = 0; i < players.length; i++) {	
			
			players[i] = createPlayer(i);
			
		}
		
		/* Est� variavel � respons�vel por controlar o fim do jogo*/
		boolean gameEnded = false;
		/* Est� variavel � respons�vel por controlar o jogador que ir� marca uma posi��o no turno*/
		Player currentPlayer = nextPlayer();
		
		/* Est� variavel � respons�vel por controlar o jogador que venceu a partida*/
		Player winner = null;
		
		
		/* Este While controla os turnos do jogo*/
		
		while(!gameEnded) {
			
			board.print();
			
			boolean sequenceFound;
			
			/*Tratamento de exce��o para verificar se o movimento do jogador � valida.*/
			try {
				
				sequenceFound = currentPlayer.play();
				
				
			} catch (InvalidMoveException e) {
				
				UI.printText("Erro: " + e.getMessage());
				continue;
			}
			
			/*Verifica��o para finalizar o jogo, e atribuir o ganhador da partida*/
			if(sequenceFound) {
				
				gameEnded = true;
				winner = currentPlayer;
				
			}else if(board.isFull()){
				gameEnded = true;
				
			}else {
				
				currentPlayer = nextPlayer();
				
			}
			
			
		}
		
		if(winner == null) {
			UI.printText("O jogo terminou empatado!");
		}else {
			UI.printText("O jogador'" + winner.getName() + "' venceu o jogo!");
		}
		
		board.print();
		UI.printText("Fim do jogo!");
		
	}
	
	/*Fun��o que inst�ncia os jogadores da partida*/
	
	private Player createPlayer(int index) {
		
		String name = UI.readInput("Jogador"+ (index + 1) + "=>");
		
		Player player = new Player(name, board, Constants.SYMBOL_PLAYERS[index]);
		
		UI.printText("O jogador'" + name + "' vai usar o s�mbolo '" + Constants.SYMBOL_PLAYERS[index] + "'");
		
		return player;
	}
	
	
	/*Fun��o que controla o jogador que ir� marcar posi��o no turno*/
	private Player nextPlayer() {
		
		currentPlayerIndex++;
		
		if(currentPlayerIndex >= players.length) {
			
			currentPlayerIndex = 0;
		}
		
		return players[currentPlayerIndex];
		
	}
	
}
