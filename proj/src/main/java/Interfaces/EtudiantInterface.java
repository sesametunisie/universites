package Interfaces;

import java.util.Collection;

import Models.Etudiant;

public interface EtudiantInterface {

	public Collection<Etudiant> getAll();
	public Etudiant getId(Long id);
	public void Delete(Long id);
	public Etudiant Add(Etudiant c);
	//public Etudiant Edit(Etudiant c);
}
