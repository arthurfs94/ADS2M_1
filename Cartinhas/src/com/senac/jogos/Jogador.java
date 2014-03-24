package com.senac.jogos;

public class Jogador {
	private int pontos;
	private int quantidade;
	
	public Jogador() {
		pontos = 0;
	}
	public int getPontos() {
		return pontos;
	}
	public void addPontos(int pontos) {
		this.pontos += pontos;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public void subtractPontos(int pontos) {
		this.pontos -= pontos;
	}
	
	
}
