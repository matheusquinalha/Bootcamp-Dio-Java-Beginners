package edu.matheus.anatomia_das_classes;

public class MinhaClasse {

	public static void main(String[] args) {
		
		String primeiroNome = "Matheus";
		String segundoNome = "Henrique";
		String nomeCompleto;
				
		ClasseExemplo exemplos = new ClasseExemplo();		
		
		//Variavel
		final String pais = "Brasil";
		
		//Exibição
		System.out.println("Olá turma, sejam todos bem-vindos!");
		
		nomeCompleto = exemplos.nomeCompleto(primeiroNome, segundoNome);
		System.out.println("Resultado do Método: " + nomeCompleto);
		System.out.println(pais);
	}
}
