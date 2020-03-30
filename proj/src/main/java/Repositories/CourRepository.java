package Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Models.Cour;

@Repository 
public interface CourRepository extends JpaRepository<Cour,Long>{

}
