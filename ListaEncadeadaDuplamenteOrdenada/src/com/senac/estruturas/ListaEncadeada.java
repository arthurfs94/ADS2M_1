package com.senac.estruturas;

public class ListaEncadeada<T extends Comparable <T>> {
	
	private Nodo<T> head;
	private Nodo<T> tail;
	
	
	public void remove(T valor){
		Nodo <T> nodo = procura (valor);
		nodo.remove();
		if(nodo==head){
			head = head.getNext();
		}
		
		
	}
	
	public void insere(Nodo<T> novo){
		if(head == null){
			head=novo;
			tail=novo;
		}else{
			Nodo<T> nodo = procuraProx(novo.getValue);
			if(nodo!=null){
				Nodo<T> ant = nodo.getPrevious();
				Nodo<T> prox = nodo;
				ant=nodo.getPrevious();
				prox=nodo;
				
				novo.setNext(prox);
				novo.setPrevious(ant);
				if(ant!=null){
					ant.setNext(novo);					
				}else{
					head=novo;
					prox.setPrevious(novo);
				}
				
				nodo.setPrevious(novo);
			}else{
				Nodo<T> ant = tail;
				Nodo<T> prox = null;
				tail.setNext(novo);
				tail=novo;
			}
			
			
		}
	}
	
	public Nodo<T> procura(T valor){
		Nodo<T> iter = head;
		
		while(iter!=null){
			//visitacao
			int cmp =valor.compareTO(iter.getValue());
			if(cmp<0){
				return iter;			
			}		
			//iteracao
			iter = iter.getNext();
		}
	}
	
	

}
