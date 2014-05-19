package com.senac.listasimplesnaoordenada;
 
import java.util.Scanner;
 
public class ListaSimplesNaoOrdenada {
   
    //Definindo a classe que representar� cada elemento da lista
    private static class LISTA {
 
        public int num;
        public LISTA prox;
    }
 
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        // a lista est� vazia, logo, objeto inicio t�m o valor null, o objeto inicio conter� o endere�o do primeiro elemento da lista
        LISTA inicio = null;
        // o objeto fim conter� o endere�o do �ltimo elemento da lista
        LISTA fim = null;
        // o objeto aux � um objeto auxiliar
        LISTA aux;
        // o objeto anterior � um objeto auxiliar
        LISTA anterior;
        // apresenta o memnu de op��es
        int op, numero, achou;
        do {
            System.out.println("\nMENU DE OP��ES\n");
            System.out.println("1 - Inserir no in�cio da lista");
            System.out.println("2 - Inserir no final da lista");
            System.out.println("3 - Consultar toda a lista");
            System.out.println("4 - Remover da lista");
            System.out.println("5 - Esvaziar a lista");
            System.out.println("6 - Sair");
            System.out.print("Digite sua op��o: ");
            op = entrada.nextInt();
            if (op < 1 || op > 6) {
                System.out.println("Op��o inv�lida!!");
            } else {
                if (op == 1) {
                    System.out.println("Digite o n�mero a ser inserido no in�cio da lista");
                    LISTA novo = new LISTA();
                    novo.num = entrada.nextInt();
                    if (inicio == null) {
                        // a lista esta vazia e o elemento inserido ser� o primeiro e o �ltimo da lista
                        inicio = novo;
                        fim = inicio;
                        novo.prox = null;
                    } else {
                        // a lista j� cont[em elementos e o novo elemento ser� inserido no in�cio da lista
                        novo.prox = inicio;
                        inicio = novo;
                    }
                    System.out.println("N�mero inserido no in�cio da lista!!");
                }
                if (op == 2) {
                    System.out.println("Digite o n�mero a ser inserido no fim da lista: ");
                    LISTA novo = new LISTA();
                    novo.num = entrada.nextInt();
                    if (inicio == null) {
                        // a lista estava vazia e o elemento inserido ser� o primeiro e o �ltimo
                        inicio = novo;
                        fim = novo;
                        novo.prox = null;
                    } else {
                        // a lista j� cont�m elementos e o novo elemento ser� inserido no fim da lista
                        fim.prox = novo;
                        fim = novo;
                        fim.prox = null;
                    }
                    System.out.println("N�mero inserido no fim da lista!!");
                }
                if (op == 3) {
                    if (inicio == null) {
                        // a lista est� vazia
                        System.out.println("Lista vazia!!");
                    } else {
                        // a lista cont�m elementos e estes ser�o mostrados do in�cio ao fim
                        System.out.println("\nConsultando toda a lista\n");
                        aux = inicio;
                        while (aux != null) {
                            System.out.print(aux.num + " ");
                            aux = aux.prox;
                        }
                    }
                }
                if (op == 4) {
                    if (inicio == null) {
                        // a lista est� vazia
                        System.out.println("Lista vazia!!");
                    } else {
                        // a lista cont�m elementos e o elmento a ser removido deve ser digitado
                        System.out.print("\nDigite o elemento a ser removido: ");
                        numero = entrada.nextInt();
                        // todos as ocorr�ncias da lista, iguais ao n�mero digitado ser�o removidas
                        aux = inicio;
                        anterior = null;
                        achou = 0;
                        while (aux != null) {
                            if (aux.num == numero) {
                                // o n�mero digitado foi encontrado na lista e ser� removido
                                achou = achou + 1;
                                if (aux == inicio) {
                                    // o n�mero a ser removido � o primeiro da lista
                                    inicio = aux.prox;
                                    aux = inicio;
                                } else if (aux == fim) {
                                    // o n�mero a ser removido � o �ltimo da lista
                                    anterior.prox = null;
                                    fim = anterior;
                                    aux = null;
                                } else {
                                    // o n�mero a ser removido est� no meio da lista
                                    anterior.prox = aux.prox;
                                    aux = aux.prox;
                                }
                            } else {
                                anterior = aux;
                                aux = aux.prox;
                            }
                        }
                        if (achou == 0) {
                            System.out.println("N�mero n�o encontrado");
                        } else if (achou == 1) {
                            System.out.println("N�mero removido 1 vez");
                        } else {
                            System.out.println("Numero removido " + achou + " vezes");
                        }
                    }
                }
                if (op == 5) {
                    if (inicio == null) {
                        // a lista est� vazia
                        System.out.println("Lista vazia!!");
                    } else {
                        // a lista ser� esvaziada
                        inicio = null;
                        System.out.println("Lista esvaziada");
                    }
                }
 
            }
 
        } while (op != 6);
    }
}