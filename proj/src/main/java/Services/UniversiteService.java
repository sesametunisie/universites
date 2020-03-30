package Services;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import Interfaces.UniversiteInterface;
import Models.Universite;
import Repositories.UniversiteRepository;

@Service
public class UniversiteService implements UniversiteInterface {
	@Autowired
	private UniversiteRepository UR;
	@Transactional
	@Override
	public Collection<Universite> getAll() {
		// TODO Auto-generated method stub
		return UR.findAll();
	}

	@Override
	public Universite getId(Long id) {
		// TODO Auto-generated method stub
		return UR.getOne(id);
	}

	@Override
	public void Delete(Long id) {
		UR.deleteById(id);
	}
    @Override

	public Universite Add(Universite c) {
		
		return UR.save(c);
		  
	}
	

}
