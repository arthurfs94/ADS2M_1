package com.senac.pessoa;

public class Pessoa {
	 private String nome;
	 private String endereco;
	 private String sobrenome;
	 private Telefone telefone = new Telefone();
	 
	 public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	 public String getNome() {
	  return nome;
	 }
	 public Telefone getTelefone() {
	  return telefone;
	 }
	 public void setTelefone(Telefone telefone) {
	  this.telefone = telefone;
	 }
	 public void setNome(String nome) {
	  this.nome = nome;
	 }
	 public String getEndereco() {
	  return endereco;
	 }
	 public void setEndereco(String endereco) {
	  this.endereco = endereco;
	 }

}
	
	