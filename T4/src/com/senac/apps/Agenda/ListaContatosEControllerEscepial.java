package com.senac.apps.Agenda;

import java.util.Scanner;

import javax.swing.JOptionPane;

import com.senac.model.Conta.Conta;
import com.senac.model.Conta.Investimento;
import com.senac.view.Conta.View;
import static java.lang.System.*;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

import com.senac.model.Agenda.Pessoa;
import com.senac.model.Agenda.Telefone;
import com.senac.view.Agenda.ConsoleView;

public class ListaContatosEControllerEscepial {
	
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
	
	private static ConsoleView view = new ConsoleView();
	private static Random randomNumberGenerator = new Random();
	
	static Pessoa pessoa = new Pessoa();
	static ListaContatosEControllerEscepial s = new ListaContatosEControllerEscepial();
	static Conta c = new Conta();
	static Investimento inv = new Investimento();
	static View vi = new View();
	
	private static int getRandomNumber(int min, int max) {
		int rand = randomNumberGenerator.nextInt(max - min);
		return min + rand;
	}
	
	private static int getRandomNumber(int max) {
		return getRandomNumber(0, max);
	}
	
	public static void main(String[] args) throws IOException {
		
		for (int i = 0; i < 50; ++i) {
 			// Cria e configura objeto pessoa
 			Pessoa pessoa = criarPessoa();
 			// Cria e configura objeto telefone
 			Telefone telefone = criarTelefone();
 			// Associar telefone a pessoa.
 			pessoa.setTelefone(telefone);
 			// Envia objeto "contato" para a "view"
 			imprimirContato(pessoa);
 			guardarContatos();
 			guardarContas();
		}
		
			do{
			String msg = "MENU\n 1-Digite sua Conta \n 2-Realizar Deposito \n 3-Verificar Saldo \n 4-Saque \n 5-Investimento \n 6-Finalizar";
			msg += "\n---------------------------------------------------------------------------------------\n";
			msg += "< Escolha umas das Op�›es Acima > ";
			Scanner e = new Scanner(System.in);
			while (true){
				System.out.println(msg);
				char op = e.nextLine().charAt(0);
				if (op == '1') {
					//vi.digiteConta();
					c.setConta(vi.digiteConta());
					vi.imprimirConta(c.conta);
				}
				if (op == '2') {
					c.setReaDeposito(vi.realizaDeposito());
					c.setDepositar(vi.contaRealizaDeposito());
					vi.imprimirDeposito(c.depositar,c.reaDeposito);
				}
				if (op == '3') {
					vi.SaldoDisponivel(c.saldo);
				}
				if (op == '4') {
					c.setConta(vi.digiteConta());
					vi.recebeValorCaixaEletronico2();
					
					int i=0;
					if (s.verificaLimiteMax() && s.verificaLimiteMin()){
						for (i=0;i<15;i=i+3)
							JOptionPane.showMessageDialog(null, "Quantidade de notas de "+
									s.Notas.substring(i,i+3)+ "= "+s.calcGeral(i));	
						vi.NotasDigitadas(s.QT);
					}
					
			}
				if (op == '5') {
					inv.setDataCriacao(vi.dataInvestimento());
					View.imprimiFaturamentoMensal(inv.taxa,inv.dataCriacao);
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

	/**
	 * 
	 */
	private static String createNome()
	{
		String[] nomes = {"Andre", "Abel", "Rodrigo", "Rafael", "Tiago",
				          "Thiago", "Marcel", "Marcelo", "Tais", "Patricia",
				          "Ana", "Maria"};
		
		return nomes[getRandomNumber(nomes.length)];
	}
	
	/**
	 * 
	 */
	private static String createSobrenome()
	{
		String[] nomes = {"Silva", "da Silva", "Santos", "dos Santos",
				          "Bruno", "Schneider", "Cristiano", "Metz", "Sonnen" };
		
		return nomes[getRandomNumber(nomes.length)];
	}

	/**
	 * 
	 */
	private static String createEndereco()
	{
		String[] tipo = { "Rua", "Av.", "Trav.", "Al." };
		String endereco = String.format("%s %s %s, %d",
										tipo[getRandomNumber(tipo.length)],
										createNome(),
										createSobrenome(),
										getRandomNumber(10000) + 1
										);
		return endereco;
	}
	
	/**
	 * Cria um objeto Pessoa com nome e endereco. Nao preenche o atributo
	 * "telefone".
	 * @return o objeto Pessoa criado.
	 */
	public static Pessoa criarPessoa() {
		pessoa.setNome(createNome());
		pessoa.setSobrenome(createSobrenome());
		pessoa.setEndereco(createEndereco());
		return pessoa;
	}

	/**
	 * 
	 * @return
	 * @throws IOException 
	 */
	public static void guardarContatos() throws IOException {
		File arquivo=new File("arquivo1.txt");
		FileWriter entra = new FileWriter(arquivo);
		BufferedWriter guardar = new BufferedWriter(entra);
		
		for(int i=0; i<50; i++){
		guardar.write(pessoa.getNome());
		guardar.write(pessoa.getSobrenome());
		guardar.write(pessoa.getEndereco());
		guardar.write(pessoa.getNomeCompleto());
		//guardar.write(pessoa.getTelefone());
		}
		guardar.flush();  
		guardar.close(); 
	}
	public static void guardarContas() throws IOException {
		File arquivo=new File("arquivo2.txt");
		FileWriter entra = new FileWriter(arquivo);
		BufferedWriter guardar = new BufferedWriter(entra);
		
		for(int i=0; i<50; i++){
		//guardar.write();
		//guardar.write(c.get);
		//guardar.write(c.);
		//guardar.write(c.getNumConta());
		//guardar.write(pessoa.getTelefone());
		}
		guardar.flush();  
		guardar.close(); 
	}
	private static String createNumeroTelefone()
	{
		int prefixo = getRandomNumber(100,1000); 
		int sufixo  = getRandomNumber(10000);
		
		return String.format("%d-%04d", prefixo, sufixo);
	}
	
	/**
	 * 
	 */
	private static String createTipoTelefone()
	{
		String[] tipos = {"casa", "trabalho", "celular"};
		int indice = getRandomNumber(tipos.length);
		return tipos[indice];
	}
	
	/**
	 * Cria um objeto Telefone com numero, codigo de area e tipo.
	 * @return objeto da classe Telefone.
	 */
	private static Telefone criarTelefone()
	{
		
		Telefone telefone = new Telefone(
									createNumeroTelefone(),
									createTipoTelefone());
		telefone.setCodArea(getRandomNumber(10,100));
		return telefone;
	}

	private static void imprimirContato(Pessoa contato)
	{	
		view.showMessage(
				contato.getNomeCompleto() + "\n" + contato.getEndereco()
		);
		
		Telefone telefone = contato.getTelefone();
		
		view.showMessage(
				String.format("(%d) %s [%s]",
								  telefone.getCodArea(),
								  telefone.getNumero(),
								  telefone.getTipo())
		);
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










