package adote.com.amor.backend.domain;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the foto_animal database table.
 * 
 */
@Entity
@Table(name="foto_animal")
@NamedQuery(name="FotoAnimal.findAll", query="SELECT f FROM FotoAnimal f")
public class FotoAnimal implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Lob
	private byte[] foto;

	//bi-directional many-to-one association to Animal
	@ManyToOne
	private Animal animal;

	public FotoAnimal() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public byte[] getFoto() {
		return this.foto;
	}

	public void setFoto(byte[] foto) {
		this.foto = foto;
	}

	public Animal getAnimal() {
		return this.animal;
	}

	public void setAnimal(Animal animal) {
		this.animal = animal;
	}

}