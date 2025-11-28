package ar.edu.utn.frm.sysacad_api.service;

import ar.edu.utn.frm.sysacad_api.entity.Student;
import ar.edu.utn.frm.sysacad_api.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service // Importante: Esto le dice a Spring "Aquí hay lógica de negocio"
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student createStudent(Student student) {
        // Aquí podrías validar cosas antes de guardar.
        // Ej: if (student.getEmail().contains("gmail")) ...
        return studentRepository.save(student);
    }
}