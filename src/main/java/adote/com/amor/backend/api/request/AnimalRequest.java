package adote.com.amor.backend.api.request;

public class AnimalRequest {

	private String nome;
	private String sexo;
	private String descricao;
	private String dataNascimento;
	private Integer idRaca;
	private String idProprietario;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public Integer getIdRaca() {
		return idRaca;
	}

	public void setIdRaca(Integer idRaca) {
		this.idRaca = idRaca;
	}

	public String getIdProprietario() {
		return idProprietario;
	}

	public void setIdProprietario(String idProprietario) {
		this.idProprietario = idProprietario;
	}

}
