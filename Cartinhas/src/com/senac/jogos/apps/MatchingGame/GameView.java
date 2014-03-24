package com.senac.jogos.apps.MatchingGame;

import java.util.Scanner;

import com.senac.jogos.Jogador;

import static java.lang.System.out;

public class GameView {

	private Scanner teclado = new Scanner(System.in);
	
	public String getUserInput()
	{
		return teclado.nextLine();
	}
	
	public void mostraCarta(String numero, char naipe) {
		out.println(String.format("Carta: %s%c",
				                  numero,
				                  naipe));
	}
	
	public void mostraJogador(Jogador jogador) {
		out.println(String.format("Pontos Jogador 1: %d",
				                  jogador.getPontos()));
	}
	
}
