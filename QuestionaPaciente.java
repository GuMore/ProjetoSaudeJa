package br.com.generation.ProjetoSaudeJA;

public class QuestionaPaciente {

public static void main(String[] args) {
		
		Paciente p1 = new Paciente();
		int soma = 0;     //int cont;
		
		// issues:
		// 1) pergunta6() pergunta o nome -> não deveria ser pgta 0?
		// 2) pergunta7() - idade É realmente necessária?
		// Nota: Sugestão para fazer quando o código estiver zero:
		// 1 - Jogar os atributos desta classe na superclasse Paciente
		// 2 - colocar o código abaixo dentro de um método, e colocar esse método
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
		System.out.println("Você Tem Um dos Sintomas. Se cuide e fique em casa se possivel.");
	}
	if(soma<0) {
		System.out.println("Você não possui nenhum sintoma. ");
	}
		
  }
    
}
