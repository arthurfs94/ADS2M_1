package com.senac.pessoa;

public class Pessoa {

		String nome, endere�o;
		Telefone telefone = new Telefone();
		
		
		public String getNome() {
			return nome;
		}


		public void setNome(String nome) {
			this.nome = nome;
		}


		public String getEndere�o() {
			return endere�o;
		}


		public void setEndere�o(String endere�o) {
			this.endere�o = endere�o;
		}


		public Telefone getTelefone() {
			return telefone;
		}


		public void setTelefone(Telefone telefone) {
			this.telefone = telefone;
		}


		public Pessoa(){
			
		}
		public Pessoa(String nome, String endere�o, Telefone telefone) {
			
			this.nome = nome;
			this.endere�o = endere�o;
			this.telefone = telefone;
			
			
		}
		
	}
	
	