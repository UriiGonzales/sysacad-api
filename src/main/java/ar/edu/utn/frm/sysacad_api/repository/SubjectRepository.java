package ar.edu.utn.frm.sysacad_api.repository;

import ar.edu.utn.frm.sysacad_api.entity.Subject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubjectRepository extends JpaRepository<Subject, Integer> {
}