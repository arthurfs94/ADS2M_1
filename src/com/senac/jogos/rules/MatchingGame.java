package com.senac.jogos.rules;

import com.senac.jogos.cartas.Carta;

public class MatchingGame {

	private Carta mesa;
	
	public MatchingGame(Carta inicial) {
		mesa = inicial;
	}

	public void setMesa(Carta mesa)
	{
		this.mesa = mesa;
	}
	
	public Carta getMesa()
	{
		return mesa;
	}
	
	public int umaCarta(Carta comprada)
	{
		int score = -2;
		if (mesa.getNaipe()==comprada.getNaipe())
			score = 1;
		if (mesa.getNumero()==comprada.getNumero())
			score = 4;
		return score;
	}
	public int duasCarta(Carta comprada){
		int score1 = -4;
		if (mesa.getNaipe()==comprada.getNaipe())
			score1 = 2;
		if (mesa.getNumero()==comprada.getNumero())
			score1 = 8;
		return score1;
	}
	public int pulaJogada(){
		int score1 = 1;
		return score1;
	}
}
