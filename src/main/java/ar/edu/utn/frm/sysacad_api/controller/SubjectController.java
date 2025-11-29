package ar.edu.utn.frm.sysacad_api.controller;

import ar.edu.utn.frm.sysacad_api.entity.Subject;
import ar.edu.utn.frm.sysacad_api.repository.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import jakarta.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/subjects")
public class SubjectController {

    @Autowired
    private SubjectRepository subjectRepository;

    @GetMapping
    public List<Subject> getAll() {
        return subjectRepository.findAll();
    }

    @PostMapping
    public Subject create(@RequestBody @Valid Subject subject) {
        return subjectRepository.save(subject);
    }
}
