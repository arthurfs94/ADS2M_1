package com.senac.jogo;

public class Comandos {

	public int posicao;
	String aux;
	public int tanque;
	
	int[] rua = new int[11];
	int[] caminho = new int[11];
	
	public void Posicao() {
		posicao = 0;
	}
	public void Tanque() {
		tanque = 6;
	}
	public boolean AndarUmaCasa() {
		posicao++;
		return false;
	}
	public boolean ReduzirUmaCasa() {
		posicao --;
		return false;
	}
	
	
}