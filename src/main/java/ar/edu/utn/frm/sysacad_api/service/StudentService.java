package ar.edu.utn.frm.sysacad_api.service;

import ar.edu.utn.frm.sysacad_api.entity.Student;
import java.util.List;

public interface StudentService {
    List<Student> getAllStudents();
    Student createStudent(Student student); // ¡Nuevo método!
}