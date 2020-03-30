package Models;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.*;

@Entity
@Table(name="cours")
public class Cour implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long code_COUR;
	
	
	@Column(length=100)
	private String libelle_COUR;
	
	
	@ManyToOne
	@JoinColumn(name="ENS_ID")
	private Enseignant enseignant;
	
	public Long getCode_COUR() {
		return code_COUR;
	}

	public void setCode_COUR(Long code_COUR) {
		this.code_COUR = code_COUR;
	}

	public String getLibelle_COUR() {
		return libelle_COUR;
	}

	public void setLibelle_COUR(String libelle_COUR) {
		this.libelle_COUR = libelle_COUR;
	}

	public Enseignant getEnseignant() {
		return enseignant;
	}

	public void setEnseignant(Enseignant enseignant) {
		this.enseignant = enseignant;
	}

	public Collection<Etudiant> getEtudiants() {
		return etudiants;
	}

	public void setEtudiants(Collection<Etudiant> etudiants) {
		this.etudiants = etudiants;
	}

	public Salle getSalle() {
		return salle;
	}

	public void setSalle(Salle salle) {
		this.salle = salle;
	}

	@ManyToMany(mappedBy="cours")
	private Collection<Etudiant> etudiants;
	
	@OneToOne()
	@JoinColumn(name="salle_id")
	private Salle salle;
	
	

}
