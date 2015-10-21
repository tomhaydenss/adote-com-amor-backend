package adote.com.amor.backend.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


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

	//bi-directional many-to-one association to Proprietario
	@OneToMany(mappedBy="localizacao")
	private List<Proprietario> proprietarios;

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

	public List<Proprietario> getProprietarios() {
		return this.proprietarios;
	}

	public void setProprietarios(List<Proprietario> proprietarios) {
		this.proprietarios = proprietarios;
	}

	public Proprietario addProprietario(Proprietario proprietario) {
		getProprietarios().add(proprietario);
		proprietario.setLocalizacao(this);

		return proprietario;
	}

	public Proprietario removeProprietario(Proprietario proprietario) {
		getProprietarios().remove(proprietario);
		proprietario.setLocalizacao(null);

		return proprietario;
	}

}