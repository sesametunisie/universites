package Models;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.*;


@Entity
@Table(name="departements")

public class Departement implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long code_DEPT;
	
	@Column(length=30)
	private String nom_DEPT;
	
	public Long getCode_DEPT() {
		return code_DEPT;
	}

	public void setCode_DEPT(Long code_DEPT) {
		this.code_DEPT = code_DEPT;
	}

	public String getNom_DEPT() {
		return nom_DEPT;
	}

	public void setNom_DEPT(String nom_DEPT) {
		this.nom_DEPT = nom_DEPT;
	}

	public Universite getUNV() {
		return UNV;
	}

	public void setUNV(Universite uNV) {
		UNV = uNV;
	}

	/*public Collection<Enseignant> getEnseignants() {
		return enseignants;
	}

	public void setEnseignants(Collection<Enseignant> enseignants) {
		this.enseignants = enseignants;
	}*/

	@ManyToOne
	@JoinColumn(name="UNV_ID")
	private Universite UNV;
	/*
	@OneToMany(mappedBy="departement",fetch=FetchType.LAZY,cascade=CascadeType.ALL)
	private Collection<Enseignant> enseignants;*/

}
