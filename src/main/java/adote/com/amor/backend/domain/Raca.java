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
	private int id;

	private String nome;

	//uni-directional many-to-one association to Especie
	@ManyToOne
	private Especie especie;

	//uni-directional many-to-one association to Porte
	@ManyToOne
	private Porte porte;

	public Raca() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
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