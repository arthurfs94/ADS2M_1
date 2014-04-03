package com.senac.sistemaBancario;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class ControllerEspecial {
	
	
	int QtI100=10;
	int QtI50=10;
	int QtI10=10;
	int QtI5=10;
	int QtI1=10;
	
	double limite;
	int limiteMaximo = 500;
	int limiteMinimo = 5;
	
	int quantia100;
	int quantia50;
	int quantia10;
	int quantia5;
	int quantiamoeda;
	String Notas = "100050010005001";
	String QT;
	
	
	public static void main(String[] args) {
		
	
	ControllerEspecial s = new ControllerEspecial();
	Conta c = new Conta();
	Investimento inv = new Investimento();
	View vi = new View();
	
		do{
		String msg = "MENU\n 1-Digite sua Conta \n 2-Realizar Deposito \n 3-Verificar Saldo \n 4-Saque \n 5-Investimento \n 6-Finalizar";
		msg += "\n---------------------------------------------------------------------------------------\n";
		msg += "< Escolha umas das Op�›es Acima > ";
		Scanner e = new Scanner(System.in);
		while (true){
			System.out.println(msg);
			char op = e.nextLine().charAt(0);
			if (op == '1') {
				vi.digiteConta();vi.imprimirConta(c.conta);
			}
			if (op == '2') {
				vi.realizaDeposito();vi.contaRealizaDeposito();vi.imprimirDeposito(c.depositar,c.reaDeposito);
			}
			if (op == '3') {
				vi.SaldoDisponivel(c.saldo);
			}
			if (op == '4') {
				vi.digiteConta();vi.recebeValorCaixaEletronico2();
				
				int i=0;
				if (s.verificaLimiteMax() && s.verificaLimiteMin()){
					for (i=0;i<15;i=i+3)
						JOptionPane.showMessageDialog(null, "Quantidade de notas de "+
								s.Notas.substring(i,i+3)+ "= "+s.calcGeral(i));	
					vi.NotasDigitadas(s.QT);
				}
				
		}
			if (op == '5') {
				vi.dataInvestimento();View.imprimiFaturamentoMensal(inv.taxa,inv.dataCriacao);
			}
			if (op == '6') {
				System.exit(op);
			}
			
			
			//JOptionPane.showMessageDialog(null,"Voce Sacou: " );
					
			
			}
		}while(true);
	}

		public double calcGeral (int i){
			double QT = limite / Integer.parseInt(Notas.substring(i, i+3));
			calcVlrFalta(Integer.parseInt(Notas.substring(i,i+3)));
					return QT;
			
		}
		
		public boolean verificaLimiteMax(){
			if (limite>limiteMaximo)
				return false; 
			return true;
		}
		
		public boolean verificaLimiteMin(){
			if (limite<limiteMinimo)
				return false;
			return true;
		}
		
		public double calcQt100(){
			double QT = limite / 100;
			calcVlrFalta(100);	
			return QT;
		}
		
		public double calcQt50(){
			double QT = limite / 50;
			calcVlrFalta(50);
			return QT;
		}

		public double calcQt10(){
			double QT = limite / 10;
			calcVlrFalta(10);
			return QT;
		}
		
		public double calcQt5(){
			double QT = limite / 5;
			calcVlrFalta(5);
			return QT;
		}
		
		public void calcVlrFalta(int moeda){
			limite = limite%moeda;
		}
		
	}
			



