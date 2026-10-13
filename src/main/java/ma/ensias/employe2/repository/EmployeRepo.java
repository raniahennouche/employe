package ma.ensias.employe2.repository;

import ma.ensias.employe2.entite.Employe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeRepo extends JpaRepository<Employe, Integer> {
}