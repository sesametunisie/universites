package Models;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import javax.persistence.*;


@Entity
@Table(name="etudiants")
public class Etudiant implements Serializable{
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long num_inscription_ETD;
	
	public Long getNum_inscription_ETD() {
		return num_inscription_ETD;
	}


	public void setNum_inscription_ETD(Long num_inscription_ETD) {
		this.num_inscription_ETD = num_inscription_ETD;
	}


	public String getNom_ETD() {
		return nom_ETD;
	}


	public void setNom_ETD(String nom_ETD) {
		this.nom_ETD = nom_ETD;
	}


	public String getPrenom_ETD() {
		return prenom_ETD;
	}


	public void setPrenom_ETD(String prenom_ETD) {
		this.prenom_ETD = prenom_ETD;
	}


	public String getAdresse_ETD() {
		return adresse_ETD;
	}


	public void setAdresse_ETD(String adresse_ETD) {
		this.adresse_ETD = adresse_ETD;
	}


	public Date getDate_entre_ETD() {
		return date_entre_ETD;
	}


	public void setDate_entre_ETD(Date date_entre_ETD) {
		this.date_entre_ETD = date_entre_ETD;
	}


	public Collection<Enseignant> getEnseignants() {
		return enseignants;
	}


	public void setEnseignants(Collection<Enseignant> enseignants) {
		this.enseignants = enseignants;
	}


	public Collection<Cour> getCours() {
		return cours;
	}


	public void setCours(Collection<Cour> cours) {
		this.cours = cours;
	}


	@Column(length=30)
	private String nom_ETD;
	
	@Column(length=50)
	private String prenom_ETD;
	
	
	@Column(length=30)
	private String adresse_ETD;
	
	@Temporal(TemporalType.DATE)

	private Date date_entre_ETD;
	
	@ManyToMany
	@JoinTable(name="ETD_ENS",
    joinColumns=
    @JoinColumn(name="ETD_ID"),
inverseJoinColumns=
    @JoinColumn(name="ENS_ID")
)
	private Collection<Enseignant> enseignants;
	
	
	@ManyToMany
	@JoinTable(name="ETD_COUR",joinColumns=
	@JoinColumn(name="ETD_ID"),inverseJoinColumns=
	@JoinColumn(name="COUR_ID"))
	private Collection<Cour> cours;

}
