package edu.utvt.alumnos.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "alumnos", indexes = {
    @Index(name = "idx_matricula", columnList = "matricula"),
    @Index(name = "idx_correo_electrónico", columnList = "correo_electrónico"),
    @Index(name = "idx_activo", columnList = "activo")
})
public class Alumno {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private Long id;

    @Column(length = 20, nullable = false, unique = true)
    private String matricula;

    @Column(length = 100, nullable = false)
    private String nombre;

    @Column(name = "apellido_paterno", length = 100, nullable = false)
    private String apellidoPaterno;

    @Column(name = "apellido_materno", length = 100)
    private String apellidoMaterno;
}