package adote.com.amor.backend.domain;

import java.io.Serializable;
import java.util.UUID;

import javax.persistence.*;

/**
 * The persistent class for the localizacao database table.
 * 
 */
@Entity
@Table(name = "localizacao")
@NamedQuery(name = "Localizacao.findAll", query = "SELECT l FROM Localizacao l")
public class Localizacao implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String id = UUID.randomUUID().toString();

	private String cep;

	private String endereco;

	@Column(name = "ponto_referencia")
	private String pontoReferencia;

	private Float latitude;

	private Float longitude;

	public Localizacao() {
	}

	public Localizacao(String id) {
		super();
		this.id = id;
	}

	public Localizacao(String id, String cep, String endereco, String pontoReferencia, Float latitude, Float longitude) {
		super();
		this.id = id;
		this.cep = cep;
		this.endereco = endereco;
		this.pontoReferencia = pontoReferencia;
		this.latitude = latitude;
		this.longitude = longitude;
	}

	public Localizacao(String cep, String endereco, String pontoReferencia, Float latitude, Float longitude) {
		super();
		this.cep = cep;
		this.endereco = endereco;
		this.pontoReferencia = pontoReferencia;
		this.latitude = latitude;
		this.longitude = longitude;
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCep() {
		return this.cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getEndereco() {
		return this.endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getPontoReferencia() {
		return this.pontoReferencia;
	}

	public void setPontoReferencia(String pontoReferencia) {
		this.pontoReferencia = pontoReferencia;
	}

	public Float getLatitude() {
		return this.latitude;
	}

	public void setLatitude(Float latitude) {
		this.latitude = latitude;
	}

	public Float getLongitude() {
		return this.longitude;
	}

	public void setLongitude(Float longitude) {
		this.longitude = longitude;
	}

}