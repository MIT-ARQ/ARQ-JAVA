package br.edu.infnet.estudo.model.domain;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "TTrilha")
public class Trilha {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer id;
	public String nome;
	public String categoria;
	public String area;
	public LocalDateTime dataLancamento;
	@OneToOne(cascade = CascadeType.DETACH)
	@JoinColumn(name = "idAluno")
	public Aluno aluno;
	@ManyToMany(cascade = CascadeType.DETACH)
	public List<Conteudo> conteudos;
	@ManyToOne
	@JoinColumn(name = "idUsuario")
	private Usuario usuario;
	
	public Trilha() {
		
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
	
	public void setDataLancamento(String dataLancamento) {
		this.dataLancamento = LocalDate.parse(dataLancamento, DateTimeFormatter.ofPattern("uuuu-MM-dd")).atStartOfDay();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}
