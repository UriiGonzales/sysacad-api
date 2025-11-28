package ar.edu.utn.frm.sysacad_api.repository;

import ar.edu.utn.frm.sysacad_api.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    // Gradle ya compiló esto, tienes acceso a findAll(), save(), etc.
}