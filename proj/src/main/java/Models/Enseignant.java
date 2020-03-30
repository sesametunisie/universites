
package Models;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.*;


@Entity
@Table(name="enseignants")
public class Enseignant implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long matricule_ENS;
	
	@Column(length=30)
	private String nom_ENS;
	
	@Column(length=30)
	private String prenom_ENS;
	
	@Column(length=30)
	private String adresse_ENS;

	@Column(length=30)
	private String diplome_ENS;
	
	@ManyToOne
	@JoinColumn(name="DEPT_ID")
	private Departement departement;
	
	
	public Long getMatricule_ENS() {
		return matricule_ENS;
	}


	public void setMatricule_ENS(Long matricule_ENS) {
		this.matricule_ENS = matricule_ENS;
	}


	public String getNom_ENS() {
		return nom_ENS;
	}


	public void setNom_ENS(String nom_ENS) {
		this.nom_ENS = nom_ENS;
	}


	public String getPrenom_ENS() {
		return prenom_ENS;
	}


	public void setPrenom_ENS(String prenom_ENS) {
		this.prenom_ENS = prenom_ENS;
	}


	public String getAdresse_ENS() {
		return adresse_ENS;
	}


	public void setAdresse_ENS(String adresse_ENS) {
		this.adresse_ENS = adresse_ENS;
	}


	public String getDiplome_ENS() {
		return diplome_ENS;
	}


	public void setDiplome_ENS(String diplome_ENS) {
		this.diplome_ENS = diplome_ENS;
	}


	public Departement getDepartement() {
		return departement;
	}


	public void setDepartement(Departement departement) {
		this.departement = departement;
	}


	public Collection<Etudiant> getEtudiants() {
		return etudiants;
	}


	public void setEtudiants(Collection<Etudiant> etudiants) {
		this.etudiants = etudiants;
	}


	public Collection<Cour> getCours() {
		return cours;
	}


	public void setCours(Collection<Cour> cours) {
		this.cours = cours;
	}


	@ManyToMany(mappedBy="enseignants")
	private Collection<Etudiant> etudiants;
	
	
	@OneToMany(mappedBy="enseignant",fetch=FetchType.LAZY,cascade=CascadeType.ALL)
	private Collection<Cour> cours; 	

}
