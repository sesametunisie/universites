package Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Models.Salle;
@Repository
public interface SalleRepository extends JpaRepository<Salle,Long> {

}
