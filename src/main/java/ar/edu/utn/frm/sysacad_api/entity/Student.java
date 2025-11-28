package ar.edu.utn.frm.sysacad_api.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
@Entity
@Table(name = "students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "El legajo es obligatorio") // No puede ser null ni vacío ""
    @Column(name = "file_number", nullable = false, unique = true)
    private String fileNumber;

    @NotBlank(message = "El nombre es obligatorio")
    @Column(name = "first_name", nullable = false)
    private String firstName;

    @NotBlank(message = "El apellido es obligatorio")
    @Column(name = "last_name", nullable = false)
    private String lastName;

    @NotBlank(message = "El email es obligatorio")
    @Email(message = "El formato del email es inválido") // Valida que tenga @ y .com
    @Column(nullable = false, unique = true)
    private String email;
}