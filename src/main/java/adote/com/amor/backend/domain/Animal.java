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
@Table(name = "animal")
@NamedQuery(name = "Animal.findAll", query = "SELECT a FROM Animal a")
public class Animal implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private String nome;

	private String sexo;

	@Lob
	private String descricao;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "data_nascimento")
	private Date dataNascimento;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "data_cadastro")
	private Date dataCadastro = new Date();

	// uni-directional many-to-one association to Raca
	@ManyToOne
	private Raca raca;

	// bi-directional many-to-one association to Proprietario
	@ManyToOne
	private Proprietario proprietario;

	// bi-directional many-to-one association to FotoAnimal
	@OneToMany(mappedBy = "animal")
	private List<FotoAnimal> fotosAnimal;

	public Animal() {
	}

	public Animal(int id, String nome, String sexo, String descricao, Date dataNascimento, Raca raca,
			Proprietario proprietario) {
		super();
		this.id = id;
		this.nome = nome;
		this.sexo = sexo;
		this.descricao = descricao;
		this.dataNascimento = dataNascimento;
		this.raca = raca;
		this.proprietario = proprietario;
	}

	public Animal(String nome, String sexo, String descricao, Date dataNascimento, Raca raca,
			Proprietario proprietario) {
		super();
		this.nome = nome;
		this.sexo = sexo;
		this.descricao = descricao;
		this.dataNascimento = dataNascimento;
		this.raca = raca;
		this.proprietario = proprietario;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public Date getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public Raca getRaca() {
		return raca;
	}

	public void setRaca(Raca raca) {
		this.raca = raca;
	}

	public Proprietario getProprietario() {
		return proprietario;
	}

	public void setProprietario(Proprietario proprietario) {
		this.proprietario = proprietario;
	}

	public List<FotoAnimal> getFotosAnimal() {
		return this.fotosAnimal;
	}

	public void setFotosAnimal(List<FotoAnimal> fotosAnimal) {
		this.fotosAnimal = fotosAnimal;
	}

	public FotoAnimal addFotosAnimal(FotoAnimal fotosAnimal) {
		getFotosAnimal().add(fotosAnimal);
		fotosAnimal.setAnimal(this);

		return fotosAnimal;
	}

	public FotoAnimal removeFotosAnimal(FotoAnimal fotosAnimal) {
		getFotosAnimal().remove(fotosAnimal);
		fotosAnimal.setAnimal(null);

		return fotosAnimal;
	}

}