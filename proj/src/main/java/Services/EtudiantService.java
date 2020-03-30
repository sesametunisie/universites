package Services;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import Interfaces.EtudiantInterface;
import Models.Etudiant;
import Repositories.EtudiantRepository;

@Service
public class EtudiantService implements EtudiantInterface {
	@Autowired
	private EtudiantRepository ER;
	@Transactional
	
	@Override
	public Collection<Etudiant> getAll() {
		return ER.findAll();
	}

	@Override
	public Etudiant getId(Long id) {
		return ER.getOne(id);
	}

	@Override
	public void Delete(Long id) {
		ER.deleteById(id);
		
	}

	@Override
	public Etudiant Add(Etudiant c) {
		return ER.save(c);
	}

}
