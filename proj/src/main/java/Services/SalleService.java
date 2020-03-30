package Services;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import Interfaces.SalleInterface;
import Models.Salle;
import Repositories.SalleRepository;

@Service
public class SalleService implements SalleInterface {
	@Autowired
	private SalleRepository SR;
	@Transactional
	
	@Override
	public Collection<Salle> getAll() {
		// TODO Auto-generated method stub
		return SR.findAll();
	}

	@Override
	public Salle getId(Long id) {
		// TODO Auto-generated method stub
		return SR.getOne(id);
		}

	@Override
	public void Delete(Long id) {
		SR.deleteById(id);
		
	}

	@Override
	public Salle Add(Salle c) {
		// TODO Auto-generated method stub
		return SR.save(c);
	}

}
