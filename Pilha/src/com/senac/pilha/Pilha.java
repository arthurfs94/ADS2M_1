package com.senac.pilha;

public class Pilha {

	public Object[] vetor;
	public int ponteiro; // tamanho da pilha.
	
	public pilha() {
		this.ponteiro=-1; //pilha vazia.
		this.vetor=new Object[100]; //100 posicoes
	}
	public static void main(String[] args) {
		//estanciar pilha e atribuir valores a ela.
		Pilha pilha = new Pilha();
		pilha.push("P");
		pilha.push("A");
		pilha.push("L");
		pilha.push("ê");
		pilha.push("N");
		pilha.push("D");
		pilha.push("R");
		pilha.push("O");
		pilha.push("M");
		pilha.push("O");
		
		//enquanto a pilha nao estiver vazia.
		while(pilha.isEmpty()== false){
			System.out.println(pilha.pop());
			
		}
	}
	
	public boolean isEmpty() { //verifica pilha esta vazia.
		if(this.ponteiro==-1){
			return true;
		}
		return false;
	}
	
	public int size() { //retorna o valor da pilha.
		if(this.isEmpty()){
			return 0;
		}
		return this.ponteiro+1;
	}
	
	public Object pop() { // desempilhar.
		if(this.isEmpty()){
			return null;
		}
		return this.vetor[this.ponteiro--];
	}
	public void push(Object valor) { // empilhar.
		if(this.ponteiro < this.vetor.length-1){
			
			this.vetor[++ponteiro]=valor;
		}
	}
	public Object top() { // visualizar itens empilhados.
		if(this.isEmpty()){
			return null;
		}
		return this.vetor[this.ponteiro];
	}
}
