package com.senac.jogos.apps.MatchingGame;



import java.util.Scanner;

import com.senac.jogos.Jogador;
import com.senac.jogos.cartas.Baralho;
import com.senac.jogos.cartas.Carta;
import com.senac.jogos.rules.MatchingGame;

public class GameController {
	Scanner r = new Scanner(System.in);
	private MatchingGame game;
	private Baralho baralho;
	private Jogador jogador = new Jogador();
	private GameView view;
	private int numJogadores=0;
	
	public GameController() {
		
		baralho = new Baralho();
		game = new MatchingGame(baralho.drawCarta());
		view = new GameView();
		jogador = new Jogador();
		
	}
	public void numJogadores(){
		System.out.println("Digite o numero de jogadores");
		numJogadores=r.nextInt(jogador.getQuantidade());
	}
	
	public void realizaJogada() {
		int op;
		System.out.println("1:Uma Carta\n2:Duas Cartas\n3:Pular\n");
		op = r.nextInt();	
			
			switch(op){
			
			
				case 1:			
					Carta comprada = baralho.drawCarta();
					view.mostraCarta(comprada.getNumero(),comprada.getNaipe());;
			int score = game.umaCarta(comprada);
					jogador.addPontos(score);
					view.mostraJogador(jogador);
					game.setMesa(comprada);
				break;
				
			
				case 2:
					Carta comprada1 = baralho.drawCarta();
					Carta comprada2 = baralho.drawCarta();
			int score1 = game.duasCarta(comprada1);
					view.mostraCarta(comprada1.getNumero(),comprada1.getNaipe());
					view.mostraCarta(comprada2.getNumero(),comprada2.getNaipe());
					jogador.addPontos(score1);
					view.mostraJogador(jogador);
					game.setMesa(comprada2);
				break;
				
				
				case 3:
			int score2 = game.pulaJogada();
					jogador.subtractPontos(score2);
					view.mostraJogador(jogador);
				break;
				
			}
		}
	
	public boolean isOver() {
		return baralho.isEmpty();
	}

	public void showMesa() {
		view.mostraCarta(game.getMesa().getNumero(),game.getMesa().getNaipe());
		view.mostraJogador(jogador);
	}
	public void showResultado() {
		view.mostraJogador(jogador);
	}

	
}





