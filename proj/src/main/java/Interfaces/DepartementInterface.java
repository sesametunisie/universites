package Interfaces;

import java.util.Collection;

import Models.Departement;

public interface DepartementInterface {

	public Collection<Departement> getAll();
	public Departement getId(Long id);
	public void Delete(Long id);
	public Departement Add(Departement d);
	//public Departement Edit(Departement d);
	
}
