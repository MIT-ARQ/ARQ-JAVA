package br.edu.infnet.estudo.model.domain;

public class Artigo extends Conteudo{
	
	public String autor;
	public int qtdPaginas;
	public Boolean ehAcademico;
	
	public String getAutor() {
		return autor;
	}
	
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	public int getQtdPaginas() {
		return qtdPaginas;
	}
	
	public void setQtdPaginas(int qtdPaginas) {
		this.qtdPaginas = qtdPaginas;
	}
	
	public Boolean getEhAcademico() {
		return ehAcademico;
	}
	
	public void setEhAcademico(Boolean ehAcademico) {
		this.ehAcademico = ehAcademico;
	}

}
