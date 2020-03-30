package Services;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import Interfaces.DepartementInterface;
import Models.Departement;
import Repositories.DepartementRepository;
@Service
public class DepartementService implements DepartementInterface {
	@Autowired
	private DepartementRepository DR;
	@Transactional
	@Override
	public Collection<Departement> getAll() {
		return DR.findAll();
	}

	@Override
	public Departement getId(Long id) {
		// TODO Auto-generated method stub
		return DR.getOne(id);
	}

	@Override
	public void Delete(Long id) {
		DR.deleteById(id);
	}

	@Override
	public Departement Add(Departement d) {
		
		return DR.save(d);
	}	

}
