package br.com.generation.ProjetoSaudeJA;

public class QuestionaPaciente {

public static void main(String[] args) {
		
		Paciente p1 = new Paciente();
		int soma = 0;     //int cont;
		
		// issues:
		// 1) pergunta6() pergunta o nome -> n�o deveria ser pgta 0?
		// 2) pergunta7() - idade � realmente necess�ria?
		// Nota: Sugest�o para fazer quando o c�digo estiver zero:
		// 1 - Jogar os atributos desta classe na superclasse Paciente
		// 2 - colocar o c�digo abaixo dentro de um m�todo, e colocar esse m�todo
		// na superclasse Paciente, listando ele na interface
				
	int pgt1 = p1.pergunta1();
	int pgt2 = p1.pergunta2();
	int pgt3 = p1.pergunta3();
	int pgt4 = p1.pergunta4();
	int pgt5 = p1.pergunta5();
	//String pgt6 = p1.pergunta6();
	//int pgt7 = p1.pergunta7();
	
	soma = pgt1+pgt2+pgt3+pgt4+pgt5;
	
	if(soma>=2) {
		System.out.println("Va para um Hospital Urgentemente!!!");
	}
	if(soma==1) {
		System.out.println("Voc� Tem Um dos Sintomas. Se cuide e fique em casa se possivel.");
	}
	if(soma<0) {
		System.out.println("Voc� n�o possui nenhum sintoma. ");
	}
		
  }
    
}
