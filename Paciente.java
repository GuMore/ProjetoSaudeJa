package br.com.generation.ProjetoSaudeJA;
	
	import java.util.Scanner;

	public class Paciente implements InterfacePaciente {

		//Declaração de Variáveis
		
		private String nome;
		private int   idade;
		Scanner resposta = new Scanner(System.in);
		
		
		//Setters and Getters
		
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public int getIdade() {
			return idade;
		}
		public void setIdade(int idade) {
			this.idade = idade;
		}
		
		
		//Sobreescrita de métodos - interface
		
		@Override
		public int pergunta1() {
			int pgt1;
			System.out.println("Você está ou esteve com alteração do olfato ou paladar ? \n1 escolha 0 - NÃO | 1 - SIM");
			pgt1 = resposta.nextInt();
			return pgt1;
		}
		
		@Override
		public int pergunta2() {
			int  pgt2;	
			System.out.println("Você está ou esteve com dor de cabeça ? \n  escolha 0 - NÃO | 1 - SIM");
			pgt2 = resposta.nextInt();
			return pgt2;
			
		}
		@Override
		public int pergunta3() {
			int pgt3;
			System.out.println("Você está ou esteve com Febre ?  \n escolha 0 - NÃO | 1 - SIM");
			pgt3 = resposta.nextInt();
			return pgt3;
			
		}
		@Override
		public int pergunta4() {
	        int pgt4;
			System.out.println("Você está ou esteve com Tosse ? \n escolha 0 - NÃO | 1 - SIM");
			pgt4 = resposta.nextInt();
			return pgt4;
	    }	
		@Override
		public int pergunta5() {
			int pgt5;
			System.out.println("Você está ou esteve com Falta de ar ? \n escolha 0 - NÃO | 1 - SIM");
			pgt5 = resposta.nextInt();
			return pgt5;
		}
		@Override
		public String pergunta6() {
			String nome;
			System.out.println("Qual seu nome");
			nome = resposta.nextLine();
			return nome;
			
		}
		@Override
		public int pergunta7() {
			int idade;
			System.out.println("Qual sua idade");
			idade = resposta.nextInt();
			return idade;
			
		}
}
