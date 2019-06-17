/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Persistence;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author kachu
 */
@Entity
@Table(name = "pacientes")
public class Paciente {
    @Id
    private int dni ;
    private String nombre;
    private String apellido;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fechaNac;
    private int numTel;
    private String historialMedico ;
    @OneToOne
    private HistoriaClinica historiaClinica ;
    
    public Paciente(){
        
    }
    
    public Paciente(int Dni , String nombre,String apellido,Date fecha ,int numTel,String hisMed){
        this.dni = Dni ;
        this.nombre = nombre ;
        this.apellido = apellido ;
        this.fechaNac = fecha ;
        this.numTel = numTel ;
        this.historialMedico = hisMed ;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Date getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }

    public int getNumTel() {
        return numTel;
    }

    public void setNumTel(int numTel) {
        this.numTel = numTel;
    }

    public String getHistorialMedico() {
        return historialMedico;
    }

    public void setHistorialMedico(String historialMedico) {
        this.historialMedico = historialMedico;
    }

    public HistoriaClinica getHistoriaClinica() {
        return historiaClinica;
    }

    public void setHistoriaClinica(HistoriaClinica historiaClinica) {
        this.historiaClinica = historiaClinica;
    }

    @Override
    public String toString() {
        return this.apellido + " " + this.nombre ;
    }

    
    
    
    
}
