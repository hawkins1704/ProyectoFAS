package com.example.clienteservice.entities;


import javax.persistence.*;
import java.util.Date;

@Entity
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length=50,nullable = false)
    private String nombres;

    @Column(length = 50,nullable = false)
    private String apellidos;

    @Column(name = "numero_documento",length = 8,nullable = false)
    private String numeroDocumento;

    @Column(length = 9,nullable = false)
    private String celular;

    @Column(length = 50,nullable = false)
    private String direccion;

    @Column(length = 30,nullable = false)
    private String correo;

    @Column(name="create_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createAt;

    @Column(length = 1,nullable = false)
    private String status;
}
