package ar.edu.utn.frm.sysacad_api.controller;

import ar.edu.utn.frm.sysacad_api.entity.Student;
import ar.edu.utn.frm.sysacad_api.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*; // Importa todo para usar @PostMapping
import jakarta.validation.Valid; // <--- ESTE es el clave
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    @Autowired
    private StudentService studentService; // Inyectamos el Servicio

    @GetMapping
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    // ¡Nuevo Endpoint para crear alumnos!
    @PostMapping
    // ¡OJO! Agregamos @Valid aquí. Si falla, lanza una excepción automática.
    public Student createStudent(@RequestBody @Valid Student student) {
        return studentService.createStudent(student);
    }
}