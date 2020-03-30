package Interfaces;

import java.util.Collection;

import Models.Cour;

public interface CourInterface {

	public Collection<Cour> getAll();
	public Cour getId(Long id);
	public void Delete(Long id);
	public Cour Add(Cour c);
	//public Cour Edit(Cour c);
	
}
