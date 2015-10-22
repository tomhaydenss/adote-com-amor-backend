package adote.com.amor.backend.api.response;

public class EspecieResponse {

	private Integer id;
	private String nome;

	public EspecieResponse(Integer id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}

	public Integer getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

}
