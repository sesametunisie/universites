package Interfaces;

import java.util.Collection;

import Models.Salle;

public interface SalleInterface {

	public Collection<Salle> getAll();
	public Salle getId(Long id);
	public void Delete(Long id);
	public Salle Add(Salle c);
	//public Salle Edit(Salle c);
}
