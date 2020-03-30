package Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Models.Etudiant;
@Repository
public interface EtudiantRepository extends JpaRepository<Etudiant,Long> {

}
