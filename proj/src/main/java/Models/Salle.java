package Models;


import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name="salles")
public class Salle implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long num_SALLE;
	
	@Column(length=30)
	private String nom_SALLE;
	
	
	private int capacite_SALLE;


	public Long getNum_SALLE() {
		return num_SALLE;
	}


	public void setNum_SALLE(Long num_SALLE) {
		this.num_SALLE = num_SALLE;
	}


	public String getNom_SALLE() {
		return nom_SALLE;
	}


	public void setNom_SALLE(String nom_SALLE) {
		this.nom_SALLE = nom_SALLE;
	}


	public int getCapacite_SALLE() {
		return capacite_SALLE;
	}


	public void setCapacite_SALLE(int capacite_SALLE) {
		this.capacite_SALLE = capacite_SALLE;
	}

}
