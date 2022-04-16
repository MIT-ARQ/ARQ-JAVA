package br.edu.infnet.estudo.model.domain;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tQuestionario")
public class Questionario extends Conteudo{
	
	public int qtdQuestoes;
	public String nivel;
	public String tipo;
	
	public Questionario() {}
	
	public Questionario(String nome, String link, String dataPublicacao) {
		super(nome, link, LocalDate.parse(dataPublicacao, DateTimeFormatter.ofPattern("uuuu-MM-dd")).atStartOfDay());
	}
	
	@Override
	public String obterLinkDownload() {
		return nivel.toUpperCase() == "AVANÇADO"? super.getLink() + "/downloadPDF": super.getLink() + "/forbiden";
	}
	
	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		
		sb.append(super.toString());
		sb.append("Quantidade de questões: " + qtdQuestoes);
		sb.append(";");
		sb.append("Nivel: " + nivel);
		sb.append(";");
		sb.append("Tipo: " + tipo);
		sb.append(";");
		sb.append(obterLinkDownload());
		
		return sb.toString();
	}
	
	public int getQtdQuestoes() {
		return qtdQuestoes;
	}
	
	public void setQtdQuestoes(int qtdQuestoes) {
		this.qtdQuestoes = qtdQuestoes;
	}
	
	public String getNivel() {
		return nivel;
	}
	
	public void setNivel(String nivel) {
		this.nivel = nivel;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
}
