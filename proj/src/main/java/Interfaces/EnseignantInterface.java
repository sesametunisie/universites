package Interfaces;

import java.util.Collection;

import Models.Enseignant;

public interface EnseignantInterface {

	public Collection<Enseignant> getAll();
	public Enseignant getId(Long id);
	public void Delete(Long id);
	public Enseignant Add(Enseignant c);
	//public Enseignant Edit(Enseignant c);
}
