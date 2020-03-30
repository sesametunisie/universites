package Interfaces;

import java.util.Collection;

import Models.Universite;

public interface UniversiteInterface {
	public Collection<Universite> getAll();
	public Universite getId(Long id);
	public void Delete(Long id);
	public Universite Add(Universite c);

	//public Universite Edit(Universite c);
}
