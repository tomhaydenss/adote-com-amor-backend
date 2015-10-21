package adote.com.amor.backend.domain;

import java.io.Serializable;
import javax.persistence.*;

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

	private String nome;

	public Especie() {
	}

	public Especie(int id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}

	public Especie(String nome) {
		super();
		this.nome = nome;
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

}