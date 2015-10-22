package adote.com.amor.backend.api.response;

public class PorteResponse {

	private Integer id;
	private String nome;
	private String descricao;

	public PorteResponse(Integer id, String nome, String descricao) {
		super();
		this.id = id;
		this.nome = nome;
		this.descricao = descricao;
	}

	public Integer getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public String getDescricao() {
		return descricao;
	}

}
