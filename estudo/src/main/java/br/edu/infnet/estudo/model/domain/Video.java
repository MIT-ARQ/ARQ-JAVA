package br.edu.infnet.estudo.model.domain;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tVideo")
public class Video extends Conteudo{

	public Long duracao;
	public String formato;
	public Boolean permiteDownload;
	
	public Video() {}
	
	public Video(String nome, String link, String dataPublicacao) {
		super(nome, link, LocalDate.parse(dataPublicacao, DateTimeFormatter.ofPattern("uuuu-MM-dd")).atStartOfDay());
	}
	
	@Override
	public String obterLinkDownload() {
		return permiteDownload? super.getLink() + "/downloadMP4": super.getLink() + "/forbiden";
	}
	
	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		
		sb.append(super.toString());
		sb.append("Duração: " + duracao + " segundos");
		sb.append(";");
		sb.append("Extensão: " + formato);
		sb.append(";");
		sb.append(permiteDownload ? "Permite download": "Não permite download");
		sb.append(";");
		sb.append(obterLinkDownload());
		
		return sb.toString();
	}
	
	public Long getDuracao() {
		return duracao;
	}
	
	public void setDuracao(Long duracao) {
		this.duracao = duracao;
	}
	
	public String getFormato() {
		return formato;
	}
	
	public void setFormato(String formato) {
		this.formato = formato;
	}
	
	public Boolean getPermiteDownload() {
		return permiteDownload;
	}
	
	public void setPermiteDownload(Boolean permiteDownload) {
		this.permiteDownload = permiteDownload;
	}
	

}
