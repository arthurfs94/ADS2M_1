package com.senac.sistemaBancario;

import java.util.Scanner;

import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

public class View {
	
	Scanner ent = new Scanner(System.in);
	
		public static void imprimiFaturamentoMensal(double taxa, double dataCriacao){
		System.out.println("Seu investimento é de 0,43% ao mes, dentro de 30 dias: "+taxa*dataCriacao);
	}
			public void imprimirDeposito(int deposito, int reaDeposito){
				System.out.println("Conta de deposito: "+deposito+" Valor de deposito: "+reaDeposito);
		
	}
			public int dataInvestimento(){
				System.out.println("Informe quanto quer investir: ");
				int dataCriacao = ent.nextInt();
				return dataCriacao;
	}
			public int recebeValorCaixaEletronico2(){
				System.out.println("Qual valor para Saque: ");
				int limite = ent.nextInt();
				return limite;
				
	}
			public int digiteConta(){
				System.out.println("Digite sua conta: ");
				int conta = ent.nextInt();
				return conta;
		}

		public void SaldoDisponivel(double saldo){
			System.out.println("saldo de:" +saldo);
			//JOptionPane.showMessageDialog(null,"Saldo de: "+saldo);
		}	
		
		public int realizaDeposito(){
			System.out.println("Digite a conta para realizar deposito: ");
			int depositar = ent.nextInt();
			return depositar;
		}
		public int contaRealizaDeposito(){
			System.out.println("Informe o valor para deposito: ");
			int reaDeposito = ent.nextInt();
			return reaDeposito;
		}
		public void NotasDigitadas(String QT){
			System.out.println("Atualmente existem: "+QT+"Notas de 100");
			//JOptionPane.showMessageDialog(null, "Atualmente existem: "+ QT + "Notas de 100");
		}
		public void imprimirConta(int conta){
			System.out.println("Conta: "+conta);
		}
}

