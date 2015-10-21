package adote.com.amor.backend.domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * The persistent class for the especie database table.
 * 
 */
@Entity
@Table(name = "especie")
@NamedQuery(name = "Especie.findAll", query = "SELECT e FROM Especie e")
public class Especie implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private String descricao;

	// bi-directional many-to-one association to Raca
	@JsonIgnore
	@OneToMany(mappedBy = "especie")
	private List<Raca> racas;

	public Especie() {
	}

	public Especie(String descricao) {
		this.descricao = descricao;
	}

	public Especie(int id, String descricao) {
		super();
		this.id = id;
		this.descricao = descricao;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public List<Raca> getRacas() {
		return this.racas;
	}

	public void setRacas(List<Raca> racas) {
		this.racas = racas;
	}

	public Raca addRaca(Raca raca) {
		getRacas().add(raca);
		raca.setEspecie(this);

		return raca;
	}

	public Raca removeRaca(Raca raca) {
		getRacas().remove(raca);
		raca.setEspecie(null);

		return raca;
	}

}