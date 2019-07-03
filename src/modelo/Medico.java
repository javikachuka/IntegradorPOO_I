/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;


import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author potoc
 */
@Entity
@Table(name = "medicos")
public class Medico {
    
    //Atributos propios de un medico
    @Id
    private int nrMatricula;
    private String nombre;
    private String apellido;
    private int nrTel;
    
    private  int tiempoTurno;
    
    private final int hsComienzoM;
    
    private final int hsFinalM;
    
    private final int hsComienzoT;
   
    private final int hsFinalT;
    @ManyToOne
    private Especialidad especialidad;
    @OneToMany(mappedBy="medico")
    private List<Turno> turnos ;
    @OneToMany(mappedBy="medico")
    private List<HistoriaClinica> histoClinicas ;
    //Constructores

    public Medico() {
        this.hsComienzoM = 8 ;
        this.hsFinalM = 12;
        this.hsComienzoT = 16;
        this.hsFinalT = 20;
        turnos = new ArrayList<>();
        histoClinicas = new ArrayList<>();
    }

    public Medico(int nrMatricula, String nombre, String apellido, int nrTel,Especialidad espe) {
        this.nrMatricula = nrMatricula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.nrTel = nrTel;
        this.especialidad = espe ;
        this.hsComienzoM = 8 ;
        this.hsFinalM = 12;
        this.hsComienzoT = 16;
        this.hsFinalT = 20;
        histoClinicas = new ArrayList<>();
        turnos = new ArrayList<>();
        
    }
    
    //Getters y Setters

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }
    
    public int getNrMatricula() {
        return nrMatricula;
    }

    public void setNrMatricula(int nrMatricula) {
        this.nrMatricula = nrMatricula;
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

    public int getNrTel() {
        return nrTel;
    }

    public void setNrTel(int nrTel) {
        this.nrTel = nrTel;
    }

    public int getTiempoTurno() {
        return tiempoTurno;
    }

    public int getHsComienzoM() {
        return hsComienzoM;
    }

    public int getHsFinalM() {
        return hsFinalM;
    }

    public int getHsComienzoT() {
        return hsComienzoT;
    }

    public int getHsFinalT() {
        return hsFinalT;
    }

    public List<Turno> getTurnos() {
        return turnos;
    }

    public void setTurnos(List<Turno> turnos) {
        this.turnos = turnos;
    }

    public List<HistoriaClinica> getHistoClinicas() {
        return histoClinicas;
    }

    public void setHistoClinicas(List<HistoriaClinica> histoClinicas) {
        this.histoClinicas = histoClinicas;
    }

    public void addHistoriaClinica(HistoriaClinica hisCli){
        this.histoClinicas.add(hisCli) ;
    }
    
    public void addTurno(Turno t){
        this.turnos.add(t) ;
    }

    @Override
    public String toString() {
        return   nrMatricula + ", " + this.apellido + " " + this.nombre +" "+this.especialidad;
    }
    
    
    
}
