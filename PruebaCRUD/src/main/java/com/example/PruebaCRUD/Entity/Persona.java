package com.example.PruebaCRUD.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="Humano")
public class Persona {

    @Id
    @GeneratedValue
    private int id;
    private String nombre;
    private String apellido;
    private String email;
    private int edad;
    private String sexo;
    private int clave;

}
