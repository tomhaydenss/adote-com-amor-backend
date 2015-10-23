package adote.com.amor.backend.api.response;

public class AnimalResponse {

	private String id;
	private String nome;
	private String sexo;
	private String descricao;
	private String dataNascimento;
	private String dataCadastro;
	private RacaResponse raca;
	private ProprietarioResponse proprietario;

	public AnimalResponse(String id, String nome, String sexo, String descricao, String dataNascimento,
			String dataCadastro, RacaResponse raca, ProprietarioResponse proprietario) {
		super();
		this.id = id;
		this.nome = nome;
		this.sexo = sexo;
		this.descricao = descricao;
		this.dataNascimento = dataNascimento;
		this.dataCadastro = dataCadastro;
		this.raca = raca;
		this.proprietario = proprietario;
	}

	public String getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public String getSexo() {
		return sexo;
	}

	public String getDescricao() {
		return descricao;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public String getDataCadastro() {
		return dataCadastro;
	}

	public RacaResponse getRaca() {
		return raca;
	}

	public ProprietarioResponse getProprietario() {
		return proprietario;
	}

}
