package adote.com.amor.backend.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;
import java.util.UUID;

/**
 * The persistent class for the proprietario database table.
 * 
 */
@Entity
@Table(name = "proprietario")
@NamedQuery(name = "Proprietario.findAll", query = "SELECT p FROM Proprietario p")
public class Proprietario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String id = UUID.randomUUID().toString();

	private String email;

	private String nome;

	private String telefone;

	// bi-directional many-to-one association to Animal
	// @OneToMany(mappedBy = "proprietario")
	// private List<Animal> animais;

	// uni-directional many-to-one association to Localizacao
	@ManyToOne
	private Localizacao localizacao;

	public Proprietario() {
	}

	public Proprietario(String id) {
		super();
		this.id = id;
	}

	public Proprietario(String id, String email, String nome, String telefone, Localizacao localizacao) {
		super();
		this.id = id;
		this.email = email;
		this.nome = nome;
		this.telefone = telefone;
		this.localizacao = localizacao;
	}

	public Proprietario(String email, String nome, String telefone, Localizacao localizacao) {
		super();
		this.email = email;
		this.nome = nome;
		this.telefone = telefone;
		this.localizacao = localizacao;
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return this.telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	// public List<Animal> getAnimais() {
	// return this.animais;
	// }
	//
	// public void setAnimais(List<Animal> animais) {
	// this.animais = animais;
	// }
	//
	// public Animal addAnimais(Animal animais) {
	// getAnimais().add(animais);
	// animais.setProprietario(this);
	//
	// return animais;
	// }
	//
	// public Animal removeAnimais(Animal animais) {
	// getAnimais().remove(animais);
	// animais.setProprietario(null);
	//
	// return animais;
	// }

	public Localizacao getLocalizacao() {
		return this.localizacao;
	}

	public void setLocalizacao(Localizacao localizacao) {
		this.localizacao = localizacao;
	}

}