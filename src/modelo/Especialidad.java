/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 *
 * @author potoc
 */
@Entity
@Table(name = "especialidad")
public class Especialidad {
    
    //Atributos propios de una Especialidad
    @Id
    @SequenceGenerator(name="seq_especialidad",initialValue=1,allocationSize = 1)  
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seq_especialidad")
    private int idEspecialidad;
    private String nombre;
    private String descripcion;
    @OneToMany(mappedBy = "especialidad") // mapeado por el atributo "especialidad" que se encuentra en la clase medico
    private Set<Medico> medicos; // Set no te guarda datos repetidos
    
    //Contructores

    public Especialidad() {
        this.medicos = new HashSet<>(); //Me crea un set de medicos vacio porque sino no responde
    }

    public Especialidad(String nombre, String descripcion) {
        this.medicos = new HashSet<>();
        this.nombre = nombre;
        this.descripcion = descripcion;
    }
    
    
    //Getters y Settter

    public int getIdEspecialidad() {
        return idEspecialidad;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Set<Medico> getMedicos() {
        return medicos;
    }

    public void setMedicos(Set<Medico> medicos) {
        this.medicos = medicos;
    }
    
    
    @Override
    public String toString (){
        return this.nombre ;
    }
    
    
    
}
