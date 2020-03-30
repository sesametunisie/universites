package Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Models.Departement;
@Repository
public interface DepartementRepository extends JpaRepository<Departement,Long> {

}
