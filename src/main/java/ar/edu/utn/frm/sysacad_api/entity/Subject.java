package ar.edu.utn.frm.sysacad_api.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
@Entity
@Table(name = "subjects")
public class Subject {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id; // Integer porque no habrán millones de materias

    @NotBlank(message = "El nombre de la materia es obligatorio")
    @Column(nullable = false)
    private String name;

    @Column(name = "year_level", nullable = false)
    private Integer yearLevel; // 1, 2, 3...
}