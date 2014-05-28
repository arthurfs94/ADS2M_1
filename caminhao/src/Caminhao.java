

import java.util.Scanner;

public class Caminhao {

	public static Scanner scan=new Scanner(System.in);	
	public int posicao=0;
	String aux;
	public int tanque=6;
	
	//uso o caminho para adicionar os combustiveis descarregados e tambem para cerregar.
	int[] caminho = new int[11];
	//rua recebe a posicao do caminhao no caminho.
	int[] rua = new int[11];
	
	//metodo para avancar as casas do array
	public void Avancar(){
		if(tanque>0){
		posicao++;
		tanque--;
		rua[posicao]++;
		System.out.println("Voce foi para posicao: "+posicao+"\n"+tanque+" de combustivel");
		}else{
			System.out.println("Acabou o combustivel fim de jogo.");
			System.exit(0);
		}
		
		if(caminho[posicao]>0){
			System.out.println("Nessa posicao existe "+caminho[posicao]+" de combustivel");
		}else{
			
		}
					
	}
	
	//metodo para voltar as casas do array.
	public void Voltar(){
		if((tanque>0)&&(posicao>0)){
		posicao--;		
		tanque--;
				
		rua[posicao+1]=0;
		System.out.println("Voce voltou para posicao: "+posicao+"\n"+tanque+" de combustivel");
		}else{
			if(tanque==0){
				System.out.println("acabou o combustivel fim de jogo.");
				System.exit(0);
			}else{
				
			}
			if(posicao==0){
				System.out.println("Nao pode voltar mais...");
			}else{
				
			}
			
		}
		
		if(caminho[posicao]>0){
			System.out.println("Nessa posicao existe "+caminho[posicao]+" de combustivel");
		}else{
			
		}
	}
	
	//metodo para descarregar o combustivel do tanque no caminho.
	public void Descarregar(){
		if(tanque>0){
		caminho[posicao]++;
		tanque--;
				
		System.out.println("Foi descarregado um combustivel na posicao: "+posicao);
		System.out.println("Posicao atual: "+posicao);
		
		}else{
			System.out.println("nao foi possivel descarregar o combustivel");
			System.out.println("Posicao atual: "+posicao);
		}
		
		
	}
	
	//metodo para carregar o tanque com o combustivel no caminho.
	public void Carregar(){
		if( ((caminho[posicao]>0)&&(tanque<6))||((posicao==0)&&(tanque<6)) ){
			if(posicao==0){
				tanque++;
				System.out.println("Foi carregado um combustivel da posicao: "+posicao);
			}else{
			tanque++;
			caminho[posicao]--;
			System.out.println("Foi carregado um combustivel da posicao: "+posicao);
			}
		}else{
			if(caminho[posicao]==0){
				System.out.println("Nao tem combustivel nesta posicao");
				System.out.println("Posicao atual: "+posicao);
			}else{
				if(tanque==6){
					System.out.println("Tanque cheio....");
					System.out.println("Posicao atual: "+posicao);
				}else{
					
				}
				
			}
			
		}
		
	}
	public static void main(String[] args) {
		Caminhao caminhao = new Caminhao();
		String menu="Menu\n Escreva um comando... avancar, voltar, carregar ou descarregar";
		
		while(true){
			
		System.out.println(menu);
		caminhao.aux=scan.nextLine();
		
		
		switch(caminhao.aux){
		case "avancar":caminhao.Avancar();
		if(caminhao.posicao==10){
			System.out.println("Parabens voce ganhou o jogo");
			System.exit(0);
		}else{
		
		}
		break;
		
		case "voltar": caminhao.Voltar();
		break;
		
		case "carregar": caminhao.Carregar();
		System.out.println("Total de combustivel: "+caminhao.tanque);
		break;
		
		case "descarregar": caminhao.Descarregar();
		System.out.println("Total de combustivel: "+caminhao.tanque);
		break;
		
				}
			}
		}
			
	}