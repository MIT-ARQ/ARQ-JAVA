package br.edu.infnet.estudo.model.domain;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class Trilha {
	
	public String nome;
	public String categoria;
	public String area;
	public Aluno aluno;
	public LocalDateTime dataLancamento;
	public List<Conteudo> conteudos;
	
	public Trilha() {
		this.nome = "Trilha em definição";
		this.dataLancamento = LocalDateTime.now();
	}
	
	@Override
	public String toString() {
		
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		return String.format("%s;%s;%s;%s;%d", 
				nome, 
				categoria,
				area,
				dataLancamento.format(formato),
				conteudos.size());
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCategoria() {
		return categoria;
	}
	
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	public String getArea() {
		return area;
	}
	
	public void setArea(String area) {
		this.area = area;
	}
	
	public Aluno getAluno() {
		return aluno;
	}
	
	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}
	
	public List<Conteudo> getConteudos() {
		return conteudos;
	}
	
	public void setConteudos(List<Conteudo> conteudos) {
		this.conteudos = conteudos;
	}
	
	public LocalDateTime getDataLancamento() {
		return dataLancamento;
	}

}
