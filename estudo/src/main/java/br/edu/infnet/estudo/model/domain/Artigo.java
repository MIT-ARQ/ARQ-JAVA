package br.edu.infnet.estudo.model.domain;

import java.time.LocalDateTime;

public class Artigo extends Conteudo{
	
	public String autor;
	public int qtdPaginas;
	public Boolean ehAcademico;
	
	public Artigo(String nome, String link, LocalDateTime dataPublicacao) {
		super(nome, link, dataPublicacao);
	}
	
	@Override
	public String obterLinkDownload() {
		return ehAcademico? super.getLink() + "/downloadPDF": super.getLink() + "/forbiden";
	}
	
	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		
		sb.append(super.toString());
		sb.append("Autor: " + autor);
		sb.append(";");
		sb.append("QtdPaginas: " + qtdPaginas);
		sb.append(";");
		sb.append(ehAcademico ? "Fonte acadêmica": "Fonte não verificada");
		sb.append(";");
		sb.append(obterLinkDownload());
		
		return sb.toString();
	}
	
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
