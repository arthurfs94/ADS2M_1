package com.senac.sistemaBancario;

public class Conta {

	int conta;
	double saldo = 500;
	int numConta;
	int numVerificacao;
	int depositar;
	int sacar;
	int reaDeposito;

	public int getDepositar() {
		return depositar;
	}

	public void setDepositar(int depositar) {
		this.depositar = depositar;
	}

	public int getReaDeposito() {
		return reaDeposito;
	}

	public void setReaDeposito(int reaDeposito) {
		this.reaDeposito = reaDeposito;
	}

	public int getConta() {
		return conta;
	}

	public void setConta(int conta) {
		this.conta = conta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public int getNumVerificacao() {
		return numVerificacao;
	}

	public void setNumVerificacao(int numVerificacao) {
		this.numVerificacao = numVerificacao;
	}

	public int getSacar() {
		return sacar;
	}

	public void setSacar(int sacar) {
		this.sacar = sacar;
	}
	
}
