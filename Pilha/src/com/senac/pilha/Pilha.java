package com.senac.pilha;

public class Pilha {

	public Object[] vetor;
	public int ponteiro; // tamanho da pilha.
	
	public Pilha() {
		this.ponteiro=-1; //pilha vazia.
		this.vetor=new Object[100]; //100 posicoes
	}
	public static void main(String[] args) {
		//estanciar pilha e atribuir valores a ela.
		Pilha pilha = new Pilha();
		pilha.push("O");
		pilha.push("M");
		pilha.push("O");
		pilha.mostraPalindromo(verificarPalindromo(pilha));
		
		//enquanto a pilha nao estiver vazia.
		while(pilha.isEmpty()== false){
			System.out.println(pilha.pop());
			
		}
	}
	public void imprimePalindromo(boolean b){
		System.out.println("Tarefa 3:\n----------\n");
		if(b){
			System.out.println("è palindromo");
		}else{
			System.out.println("não é palindromo");
		}
		System.out.println("\n----------\n");
	}
	
	public void mostraPalindromo(boolean p){
		imprimePalindromo(p);		
		System.out.println("\n");
	}
	public static boolean verificarPalindromo(Pilha p) {
		boolean status=false;
		int indice=0;
		char[] vetorDesempilhados=new char[p.getPonteiro()+2];
		
		while(!p.isEmpty()){		
			vetorDesempilhados[indice]=p.pop().toString().toCharArray()[0];
			indice++;
		}
		
		int a=vetorDesempilhados.length-2;
		
		for(int i=0;i<vetorDesempilhados.length-1;i++){
			if(vetorDesempilhados[i]==vetorDesempilhados[a]){		;			
			status=true;
			}else{
				status=false;
				break;
			}
			a--;			
		}		
		
		return status;
	}
	
	
	public int getPonteiro() {
		return ponteiro;
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
