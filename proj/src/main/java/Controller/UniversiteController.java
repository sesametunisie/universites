package Controller;

import java.util.Collection;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import Interfaces.UniversiteInterface;
import Models.Universite;
import Services.UniversiteService;
@CrossOrigin(origins = "*", allowedHeaders = "*")

@RestController
@RequestMapping("/universite")

public class UniversiteController {
		@Autowired
	  private  UniversiteInterface IF;
	  
	  @PostMapping("/add")
	  Universite ajoutuniversite(@RequestBody Universite universite) {
		    if (universite != null ) {
		    	
	    return IF.Add(universite);
		    }
		    
		    return null;
	    }

	  @GetMapping("/get")
	  Collection<Universite> getall(){
		  return IF.getAll();
		  }

	  
	  @DeleteMapping("/delete/{id}")
	  Universite delete(@PathVariable String id) {
		  System.out.print(id);
		  Long myid=Long.parseLong(id);
		IF.Delete(myid);  
		return new Universite() ;
	  }
	  

	  @GetMapping("/get/{id}")
	  Universite getid(@PathVariable String id){
		  return IF.getId(Long.parseLong(id));
		  }

	  
	  

}
