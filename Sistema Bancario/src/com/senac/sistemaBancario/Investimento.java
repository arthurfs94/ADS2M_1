package com.senac.sistemaBancario;


public class Investimento {
	
	double dataCriacao;
	double taxa = 0.43;
	
	
	public double getDataCriacao() {
		return dataCriacao;
	}
	public void setDataCriacao(int dataCriacao) {
		this.dataCriacao = dataCriacao;
	}
	public double getTaxa() {
		return taxa;
	}
	public void setTaxa(double taxa) {
		this.taxa = taxa;
	}
	
	
}
