package Services;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import Interfaces.CourInterface;
import Models.Cour;
import Repositories.CourRepository;
@Service
public class CourService implements CourInterface{
	
	@Autowired
	private CourRepository CR;
	
	@Transactional
	
	@Override
	public Collection<Cour> getAll() {
		return CR.findAll();
	}

	@Override
	public Cour getId(Long id) {
		
		return CR.getOne(id);
	}

	@Override
	public void Delete(Long id) {
		CR.deleteById(id);
		
	}

	@Override
	public Cour Add(Cour c) {

		 return CR.save(c);
		
	}


	

}
