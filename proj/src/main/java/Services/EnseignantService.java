package Services;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import Interfaces.EnseignantInterface;
import Models.Enseignant;
import Repositories.EnseignantRepository;

@Service
public class EnseignantService implements EnseignantInterface {
	@Autowired
	private EnseignantRepository ER;
	@Transactional
	@Override
	public Collection<Enseignant> getAll() {
		return ER.findAll();		
	}

	@Override
	public Enseignant getId(Long id) {
		// TODO Auto-generated method stub
		return ER.getOne(id);
	}

	@Override
	public void Delete(Long id) {
		ER.deleteById(id);
		
	}

	@Override
	public Enseignant Add(Enseignant c) {
		// TODO Auto-generated method stub
		return ER.save(c);
	}

}
