/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
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
    @OneToMany(mappedBy="paciente")
    private List<HistoriaClinica> historiasClinicas ;
    @OneToOne
    private Turno turno ;
    
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

    public List<HistoriaClinica> getHistoriasClinicas() {
        return historiasClinicas;
    }

    public void setHistoriasClinicas(List<HistoriaClinica> historiasClinicas) {
        this.historiasClinicas = historiasClinicas;
    }

    public void addHistoriaClinica(HistoriaClinica historiaClinica){
        this.historiasClinicas.add(historiaClinica) ;
    }

    public Turno getTurno() {
        return turno;
    }

    public void setTurno(Turno turno) {
        this.turno = turno;
    }

    
    @Override
    public String toString() {
        return this.apellido + " " + this.nombre ;
    }

    
    
    
    
}
