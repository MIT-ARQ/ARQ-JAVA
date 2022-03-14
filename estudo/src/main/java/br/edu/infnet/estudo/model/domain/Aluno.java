package br.edu.infnet.estudo.model.domain;

import java.time.LocalDateTime;
import java.util.List;

public class Aluno {
	
	public String nome;
	public LocalDateTime dataNascimento;
	public String profissao;
	public List<Trilha> trilhas; 
	
	public Aluno(String nome, LocalDateTime dataNascimento, String profissao) {
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.profissao = profissao;
	}
	
	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		
		sb.append(nome);
		sb.append(";");
		sb.append(dataNascimento.toString());
		sb.append(";");
		sb.append(profissao);
		
		return sb.toString();
	}
	
	public List<Trilha> getTrilhas() {
		return trilhas;
	}

	public String getNome() {
		return nome;
	}
	
	public LocalDateTime getDataNascimento() {
		return dataNascimento;
	}
	
	public String getProfissao() {
		return profissao;
	}
}
