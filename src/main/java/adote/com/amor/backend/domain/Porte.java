package adote.com.amor.backend.domain;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the porte database table.
 * 
 */
@Entity
@Table(name="porte")
@NamedQuery(name="Porte.findAll", query="SELECT p FROM Porte p")
public class Porte implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private String descricao;

	private String nome;

	public Porte() {
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

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}