package com.senac.pessoa;

public class Pessoa {

		String nome, endereço;
		Telefone telefone = new Telefone();
		
		
		public String getNome() {
			return nome;
		}


		public void setNome(String nome) {
			this.nome = nome;
		}


		public String getEndereço() {
			return endereço;
		}


		public void setEndereço(String endereço) {
			this.endereço = endereço;
		}


		public Telefone getTelefone() {
			return telefone;
		}


		public void setTelefone(Telefone telefone) {
			this.telefone = telefone;
		}


		public Pessoa(){
			
		}
		public Pessoa(String nome, String endereço, Telefone telefone) {
			
			this.nome = nome;
			this.endereço = endereço;
			this.telefone = telefone;
			
			
		}
		
	}
	
	