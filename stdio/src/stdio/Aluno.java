package stdio;

import java.util.Date;
import java.util.List;

public class Aluno {
	
	public String nome;
	public Date dataNascimento;
	public String profissao;
	public List<Trilha> trilhas; 
	
	public List<Trilha> getTrilhas() {
		return trilhas;
	}

	public void setTrilhas(List<Trilha> trilhas) {
		this.trilhas = trilhas;
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Date getDataNascimento() {
		return dataNascimento;
	}
	
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	public String getProfissao() {
		return profissao;
	}
	
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
	
	

}
