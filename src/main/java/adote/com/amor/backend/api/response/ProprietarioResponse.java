package adote.com.amor.backend.api.response;

public class ProprietarioResponse {

	private String id;
	private String nome;
	private String email;
	private String telefone;
	private LocalizacaoResponse localizacao;

	public ProprietarioResponse(String id, String nome, String email, String telefone,
			LocalizacaoResponse localizacao) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
		this.localizacao = localizacao;
	}

	public String getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public String getEmail() {
		return email;
	}

	public String getTelefone() {
		return telefone;
	}

	public LocalizacaoResponse getLocalizacao() {
		return localizacao;
	}

}
