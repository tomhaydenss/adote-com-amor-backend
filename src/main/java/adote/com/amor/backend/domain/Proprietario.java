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
	private List<Animal> animals;

	//bi-directional many-to-one association to Localizacao
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

	public List<Animal> getAnimals() {
		return this.animals;
	}

	public void setAnimals(List<Animal> animals) {
		this.animals = animals;
	}

	public Animal addAnimal(Animal animal) {
		getAnimals().add(animal);
		animal.setProprietario(this);

		return animal;
	}

	public Animal removeAnimal(Animal animal) {
		getAnimals().remove(animal);
		animal.setProprietario(null);

		return animal;
	}

	public Localizacao getLocalizacao() {
		return this.localizacao;
	}

	public void setLocalizacao(Localizacao localizacao) {
		this.localizacao = localizacao;
	}

}