package Models;


import java.io.Serializable;
import java.util.Collection;

import javax.persistence.*;



@Entity
@Table(name="universites")
public class Universite implements Serializable {
	public Universite(String nom, String site) {
		this.nom_UNV=nom;
		this.adresse_site_UNV=site;
	}
	public Universite() {}

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long code_UNV;
	
	@Column(length=30)
	private String nom_UNV;
	
	
	@Column(length=30)
	private String adresse_site_UNV;
	
	public Long getCode_UNV() {
		return code_UNV;
	}
	public void setCode_UNV(Long code_UNV) {
		this.code_UNV = code_UNV;
	}
	public String getNom_UNV() {
		return nom_UNV;
	}
	public void setNom_UNV(String nom_UNV) {
		this.nom_UNV = nom_UNV;
	}
	public String getAdresse_site_UNV() {
		return adresse_site_UNV;
	}
	public void setAdresse_site_UNV(String adresse_site_UNV) {
		this.adresse_site_UNV = adresse_site_UNV;
	}
	/*public Collection<Departement> getDepartements() {
		return departements;
	}
	public void setDepartements(Collection<Departement> departements) {
		this.departements = departements;
	}*/

	//@OneToMany(mappedBy="UNV",fetch=FetchType.LAZY,cascade=CascadeType.ALL)
	//private Collection<Departement> departements;
	
	
	

}
