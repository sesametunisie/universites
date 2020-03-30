package Controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Interfaces.DepartementInterface;
import Interfaces.EnseignantInterface;
import Interfaces.UniversiteInterface;
import Models.Departement;
import Models.Enseignant;
import Models.Universite;
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/enseignant")

public class EnseignantController {
	@Autowired
	private  EnseignantInterface IF;
	@Autowired
	private DepartementInterface DF;
	
	

	
	  @PostMapping("/add/{id}")
	  Enseignant ajoutenseignant(@RequestBody Enseignant enseignant,@PathVariable String id) {
		    if ((enseignant != null )&&(id!=null)) {
		    	Departement d=DF.getId(Long.parseLong(id));
		    	enseignant.setDepartement(d);
		    	 Enseignant ee=IF.Add(enseignant);
		    	 Enseignant e=new Enseignant();
		    	 e.setMatricule_ENS(ee.getMatricule_ENS());
		    	 return e;
		    }
		    
		    return null;
	    }
	  @GetMapping("/get")
	  Collection<Enseignant> getall(){
		  return IF.getAll();
		  }
	  
	  @GetMapping("/get/{id}")
	  Enseignant getid(@PathVariable String id){
		  return IF.getId(Long.parseLong(id));
		  }
	  

	  @DeleteMapping("/delete/{id}")
	  Enseignant delete(@PathVariable String id) {
		  System.out.print(id);
		  Long myid=Long.parseLong(id);
		IF.Delete(myid);  
		return new Enseignant();
	  }
	
}
