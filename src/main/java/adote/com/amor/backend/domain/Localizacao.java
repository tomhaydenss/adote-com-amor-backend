package adote.com.amor.backend.domain;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the localizacao database table.
 * 
 */
@Entity
@Table(name="localizacao")
@NamedQuery(name="Localizacao.findAll", query="SELECT l FROM Localizacao l")
public class Localizacao implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private String cep;

	private String endereco;

	private float latitude;

	private String longitude;

	@Column(name="ponto_referencia")
	private String pontoReferencia;

	public Localizacao() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
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

	public float getLatitude() {
		return this.latitude;
	}

	public void setLatitude(float latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return this.longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getPontoReferencia() {
		return this.pontoReferencia;
	}

	public void setPontoReferencia(String pontoReferencia) {
		this.pontoReferencia = pontoReferencia;
	}

}