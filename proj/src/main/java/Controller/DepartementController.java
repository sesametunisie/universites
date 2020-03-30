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
import Interfaces.UniversiteInterface;
import Models.Departement;
import Models.Universite;
@CrossOrigin(origins = "*", allowedHeaders = "*")

@RestController
@RequestMapping("/departement")

public class DepartementController {
	@Autowired
	private DepartementInterface di;
	@Autowired
	private UniversiteInterface ud;

	
	
	  @PostMapping("/add/{id}")
	  Departement ajoutdepartement(@RequestBody Departement departement,@PathVariable String id) {
		    if ((departement != null )&&(id!=null)) {
		    	Universite uv=ud.getId(Long.parseLong(id));
		    	departement.setUNV(uv);
	     Departement k=di.Add(departement);
	     Departement i=new Departement();
	     i.setCode_DEPT(k.getCode_DEPT());
	     i.setNom_DEPT(k.getNom_DEPT());
	     return i;
		    }
		    
		    return null;
	    }
	  @GetMapping("/get")
	  Collection<Departement> getall(){
		  return di.getAll();
		  }
	  
	  @GetMapping("/get/{id}")
	  Departement getid(@PathVariable String id){
		  return di.getId(Long.parseLong(id));
		  }
	  

	  @DeleteMapping("/delete/{id}")
	  Departement delete(@PathVariable String id) {
		  System.out.print(id);
		  Long myid=Long.parseLong(id);
		di.Delete(myid);  
		return new Departement();
	  }

}
