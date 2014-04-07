package com.senac.pessoa;

import java.util.Random;


public class Controller {
	
	static View v = new View();
	
	public static void main (String args[]){
	for (int i=0;i<=50;i++){
		mostraContato(criarContato());}
	}
	
		public static String Nomes(){
    		Random Nome = new Random();
    		String nomes[] = {"Gabriel","Eduardo","João","Gustavo","Rafael","Paulo","Giovane"};  
    		return nomes[Nome.nextInt(6)];
    	}
        public static String Sobrenomes(){
        	Random Sobrenome = new Random();
        	 String sobrenomes[] = {"Silveira","Oliveira","Vieira","Vivan","Fernandes","Barboza"};
        	 return sobrenomes[Sobrenome.nextInt(6)];
        }
        public static String Endereco(){
        	  Random Endereco = new Random();
        	  String endereco[] ={"Rua Clovis","Avenida Jari","Rua Demetrio","Avenida Borges","Alameda dos Anjos"};
        	  return endereco[Endereco.nextInt(5)];
        }
        public static Telefone Telefone(){
        	Random Telefone = new Random();
        	Telefone fone = new Telefone();
        	String telefone[] = {"32145698","89745632","32457854","98451825","96145585"};
        	fone.setNumero(telefone[Telefone.nextInt(5)]);
        	String tipo[] = {"Casa","Celular","Trabalho"};
        	fone.setTipo(tipo[Telefone.nextInt(3)]);
        	return fone;
      	  
        }
	
        public static Pessoa criarContato(){
        	Pessoa contato = new Pessoa();
        	contato.setNome(Nomes());
        	contato.setSobrenome(Sobrenomes());
        	contato.setEndereco(Endereco());
        	contato.setTelefone(Telefone());
        	return contato;
        }
        
        public static void mostraContato(Pessoa contato) {
        	v.imprimirContato(contato.getNome(), contato.getSobrenome(), contato.getEndereco(), Telefone().getNumero(), Telefone().getTipo());
        }
	}

