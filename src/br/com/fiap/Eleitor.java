package br.com.fiap;

import java.time.LocalDate;

public class Eleitor {

	// Atributos
	private String nome;
	private int anoNascimento;
	private int numTitulo;
	private int zona;
	private int secao;
	
	// Construtores (gcf / gcuf)
	public Eleitor() {
	}
	

	public Eleitor(String nome, int anoNascimento, int numTitulo, int zona, int secao) {
		this.nome = nome;
		this.anoNascimento = anoNascimento;
		this.numTitulo = numTitulo;
		this.zona = zona;
		this.secao = secao;
	}



	// Getters and setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	public int getAnoNascimento() {
		return anoNascimento;
	}
	public void setAnoNascimento(int anoNascimento) {
		LocalDate anoAtual = LocalDate.now();
		
		try {
			if((anoNascimento >= 1900) && (anoNascimento <= anoAtual.getYear() - 16)) {
				this.anoNascimento = anoNascimento;
			}
			else {
				throw new Exception("Valor inválido");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	
	
	public int getNumTitulo() {
		return numTitulo;
	}
	public void setNumTitulo(int numTitulo) {
		this.numTitulo = numTitulo;
	}
	
	
	
	public int getZona() {
		return zona;
	}
	public void setZona(int zona) {
		this.zona = zona;
	}
	
	
	
	public int getSecao() {
		return secao;
	}
	public void setSecao(int secao) {
		this.secao = secao;
	}
	
	
	// Funções
	public int calculaIdade(int anoAtual) {
		int idade = anoAtual - anoNascimento;
		return idade;
	}
	
	
}
