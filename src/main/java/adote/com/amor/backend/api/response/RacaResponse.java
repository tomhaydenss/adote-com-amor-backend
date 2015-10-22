package adote.com.amor.backend.api.response;

public class RacaResponse {

	private Integer id;
	private String nome;
	private EspecieResponse especie;
	private PorteResponse porte;

	public RacaResponse(Integer id, String nome, EspecieResponse especie, PorteResponse porte) {
		super();
		this.id = id;
		this.nome = nome;
		this.especie = especie;
		this.porte = porte;
	}

	public Integer getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public EspecieResponse getEspecie() {
		return especie;
	}

	public PorteResponse getPorte() {
		return porte;
	}

}
