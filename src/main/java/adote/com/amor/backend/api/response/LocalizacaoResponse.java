package adote.com.amor.backend.api.response;

public class LocalizacaoResponse {

	private String id;
	private String cep;
	private String endereco;
	private String pontoReferencia;
	private Float latitude;
	private Float longitude;

	public LocalizacaoResponse(String id, String cep, String endereco, String pontoReferencia, Float latitude,
			Float longitude) {
		super();
		this.id = id;
		this.cep = cep;
		this.endereco = endereco;
		this.pontoReferencia = pontoReferencia;
		this.latitude = latitude;
		this.longitude = longitude;
	}

	public String getId() {
		return id;
	}

	public String getCep() {
		return cep;
	}

	public String getEndereco() {
		return endereco;
	}

	public String getPontoReferencia() {
		return pontoReferencia;
	}

	public Float getLatitude() {
		return latitude;
	}

	public Float getLongitude() {
		return longitude;
	}

}
