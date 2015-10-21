package adote.com.amor.backend.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the proprietario database table.
 * 
 */
@Entity
@Table(name="proprietario")
@NamedQuery(name="Proprietario.findAll", query="SELECT p FROM Proprietario p")
public class Proprietario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private String email;

	private String nome;

	private String telefone;

	//bi-directional many-to-one association to Animal
	@OneToMany(mappedBy="proprietario")
	private List<Animal> animais;

	//uni-directional many-to-one association to Localizacao
	@ManyToOne
	private Localizacao localizacao;

	public Proprietario() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
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

	public List<Animal> getAnimais() {
		return this.animais;
	}

	public void setAnimais(List<Animal> animais) {
		this.animais = animais;
	}

	public Animal addAnimai(Animal animai) {
		getAnimais().add(animai);
		animai.setProprietario(this);

		return animai;
	}

	public Animal removeAnimai(Animal animai) {
		getAnimais().remove(animai);
		animai.setProprietario(null);

		return animai;
	}

	public Localizacao getLocalizacao() {
		return this.localizacao;
	}

	public void setLocalizacao(Localizacao localizacao) {
		this.localizacao = localizacao;
	}

}