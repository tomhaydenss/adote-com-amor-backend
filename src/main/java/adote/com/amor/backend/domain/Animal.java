package adote.com.amor.backend.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the animal database table.
 * 
 */
@Entity
@Table(name="animal")
@NamedQuery(name="Animal.findAll", query="SELECT a FROM Animal a")
public class Animal implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Column(name="data_cadastro")
	private String dataCadastro;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="data_nascimento")
	private Date dataNascimento;

	@Lob
	private String descricao;

	private String nome;

	@ManyToOne
	private Raca raca;

	private String sexo;

	//bi-directional many-to-one association to Proprietario
	@ManyToOne
	private Proprietario proprietario;

	//bi-directional many-to-one association to FotoAnimal
	@OneToMany(mappedBy="animal")
	private List<FotoAnimal> fotoAnimals;

	public Animal() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDataCadastro() {
		return this.dataCadastro;
	}

	public void setDataCadastro(String dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public Date getDataNascimento() {
		return this.dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
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

	public Raca getRaca() {
		return raca;
	}

	public void setRaca(Raca raca) {
		this.raca = raca;
	}

	public String getSexo() {
		return this.sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public Proprietario getProprietario() {
		return this.proprietario;
	}

	public void setProprietario(Proprietario proprietario) {
		this.proprietario = proprietario;
	}

	public List<FotoAnimal> getFotoAnimals() {
		return this.fotoAnimals;
	}

	public void setFotoAnimals(List<FotoAnimal> fotoAnimals) {
		this.fotoAnimals = fotoAnimals;
	}

	public FotoAnimal addFotoAnimal(FotoAnimal fotoAnimal) {
		getFotoAnimals().add(fotoAnimal);
		fotoAnimal.setAnimal(this);

		return fotoAnimal;
	}

	public FotoAnimal removeFotoAnimal(FotoAnimal fotoAnimal) {
		getFotoAnimals().remove(fotoAnimal);
		fotoAnimal.setAnimal(null);

		return fotoAnimal;
	}

}