package br.edu.infnet.estudo.model.domain;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TAluno")

public class Aluno {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer id;	
	public String nome;
	public LocalDateTime dataNascimento;
	public String profissao;
	//public List<Trilha> trilhas; 
	
	public Aluno() {
		
	}
	
	public Aluno(String nome, String dataNascimento, String profissao) {
		this.nome = nome;
		this.dataNascimento = LocalDate.parse(dataNascimento, DateTimeFormatter.ofPattern("uuuu-MM-dd")).atStartOfDay();
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
	
	/*
	 public List<Trilha> getTrilhas() {
	 
		return trilhas;
	}
	
	public void setTrilhas(List<Trilha> trilhas) {
		this.trilhas = trilhas;
	}
	*/
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDateTime getDataNascimento() {
		return dataNascimento;
	}	
	
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = LocalDate.parse(dataNascimento, DateTimeFormatter.ofPattern("uuuu-MM-dd")).atStartOfDay();;
	}
	
	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

}
