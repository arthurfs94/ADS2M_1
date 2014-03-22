package com.senac.jogos.apps.MatchingGame;

public class MatchingGame {

	public static void main(String[] args) {
		GameController game = new GameController();
			game.numJogadores();
			game.showMesa();
		while (! game.isOver()) {
			game.realizaJogada();
		}
			game.showResultado();
	}

}
