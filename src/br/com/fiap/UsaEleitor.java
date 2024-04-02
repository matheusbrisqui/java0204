package br.com.fiap;


public class UsaEleitor {

	public static void main(String[] args) {
		
		// Identação de objetos
		Eleitor eleitor1 = new Eleitor();
		Eleitor eleitor2 = new Eleitor("Matheus", 2004, 132892, 10, 2);
		
		// Configurando do obj 1
		
		eleitor1.setNome("Guilherme");
		eleitor1.setAnoNascimento(2004);
		eleitor1.setNumTitulo(126443);
		eleitor1.setSecao(4);
		eleitor1.setZona(12);
		int idade = eleitor1.calculaIdade(2024);
		
		
		System.out.println("Nome: " + eleitor1.getNome());
		System.out.println("Idade: " + idade);
		System.out.println("Número do título: " + eleitor1.getNumTitulo());
		System.out.println("Seção: " + eleitor1.getSecao());
		System.out.println("Zona: " + eleitor1.getZona());
		
		
		System.out.println("\nNome: " + eleitor2.getNome());
		System.out.println("Idade: " + eleitor2.calculaIdade(2024));
		System.out.println("Número do título: " + eleitor2.getNumTitulo());
		System.out.println("Seção: " + eleitor2.getSecao());
		System.out.println("Zona: " + eleitor2.getZona());

	}

}
