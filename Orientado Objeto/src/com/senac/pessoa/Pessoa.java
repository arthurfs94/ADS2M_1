package com.senac.pessoa;

public class Pessoa {

		String nome, enderešo;
		Telefone telefone = new Telefone();
		
		
		public String getNome() {
			return nome;
		}


		public void setNome(String nome) {
			this.nome = nome;
		}


		public String getEnderešo() {
			return enderešo;
		}


		public void setEnderešo(String enderešo) {
			this.enderešo = enderešo;
		}


		public Telefone getTelefone() {
			return telefone;
		}


		public void setTelefone(Telefone telefone) {
			this.telefone = telefone;
		}


		public Pessoa(){
			
		}
		public Pessoa(String nome, String enderešo, Telefone telefone) {
			
			this.nome = nome;
			this.enderešo = enderešo;
			this.telefone = telefone;
			
			
		}
		
	}
	
	