package br.edu.infnet.estudo.model.domain;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tConteudo")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Conteudo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer id;
	public String nome;
	public String link;
	public LocalDateTime dataPublicacao;	
	@ManyToOne
	@JoinColumn(name = "idUsuario")
	private Usuario usuario;
	@ManyToMany(mappedBy = "conteudos")
	private List<Trilha> trilhas;
	
	public Conteudo() {}
	
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

	public Integer getId() {
		return id;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}


	public void setId(Integer id) {
		this.id = id;
	}

	public void setDataPublicacao(String dataPublicacao) {
		this.dataPublicacao = LocalDate.parse(dataPublicacao, DateTimeFormatter.ofPattern("uuuu-MM-dd")).atStartOfDay();
	}
	
	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	public List<Trilha> getTrilhas() {
		return trilhas;
	}

	public void setTrilhas(List<Trilha> trilhas) {
		this.trilhas = trilhas;
	}

	
}
