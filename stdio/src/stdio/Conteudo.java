package stdio;
import java.util.Date;

public abstract class Conteudo {
	
	public String nome;
	public String link;
	public Date DataPublicacao;
	
	public Date getDataPublicacao() {
		return DataPublicacao;
	}

	public void setDataPublicacao(Date dataPublicacao) {
		DataPublicacao = dataPublicacao;
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getLink() {
		return link;
	}
	
	public void setLink(String link) {
		this.link = link;
	}
	
}
