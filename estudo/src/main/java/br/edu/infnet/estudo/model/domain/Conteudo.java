package br.edu.infnet.estudo.model.domain;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public abstract class Conteudo {
	
	public String nome;
	public String link;
	public LocalDateTime dataPublicacao;
	
	public Conteudo(String nome, String link, LocalDateTime dataPublicacao) {
		this.nome = nome;
		this.link = link;
		this.dataPublicacao = dataPublicacao;
	}
	
	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		
		sb.append(nome);
		sb.append(";");
		sb.append(link);
		sb.append(";");
		sb.append(dataPublicacao.toString());
		sb.append(";");
		sb.append(obterLinkDownload());
		
		return sb.toString();
	}
	
	public abstract String obterLinkDownload();
	
	public LocalDateTime getDataPublicacao() {
		return dataPublicacao;
	}

	public String getNome() {
		return nome;
	}
	
	
	
	public String getLink() {
		return link;
	}
	
}
