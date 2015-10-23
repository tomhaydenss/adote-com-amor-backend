package adote.com.amor.backend.api.request;

public class ProprietarioRequest {

	private String nome;
	private String email;
	private String telefone;
	private String idLocalizacao;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getIdLocalizacao() {
		return idLocalizacao;
	}

	public void setIdLocalizacao(String idLocalizacao) {
		this.idLocalizacao = idLocalizacao;
	}

}
