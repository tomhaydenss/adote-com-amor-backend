package adote.com.amor.backend.domain;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the raca database table.
 * 
 */
@Entity
@Table(name="raca")
@NamedQuery(name="Raca.findAll", query="SELECT r FROM Raca r")
public class Raca implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="raca_id")
	private int racaId;

	private String descricao;

	//bi-directional many-to-one association to Especie
	@ManyToOne
	private Especie especie;

	//bi-directional many-to-one association to Porte
	@ManyToOne
	private Porte porte;

	public Raca() {
	}

	public int getRacaId() {
		return this.racaId;
	}

	public void setRacaId(int racaId) {
		this.racaId = racaId;
	}

	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Especie getEspecie() {
		return this.especie;
	}

	public void setEspecie(Especie especie) {
		this.especie = especie;
	}

	public Porte getPorte() {
		return this.porte;
	}

	public void setPorte(Porte porte) {
		this.porte = porte;
	}

}