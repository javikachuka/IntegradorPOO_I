/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Persistence;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author kachu
 */
@Entity
@Table(name = "historias_clinicas")
public class HistoriaClinica {
    @Id
    @SequenceGenerator(name="sec_hist",initialValue=1,allocationSize = 1)  
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="sec_hist")
    private int idHisCli ;
    private String descEnfer ;
    private String medicamentos ;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fecha ;
    @ManyToOne
    private Paciente paciente ;
    @ManyToOne
    private Medico medico;
    
    public HistoriaClinica (){
        this.fecha = new Date() ;
    }
    
    public HistoriaClinica(String descripcion , String medicamentos,Date fecha,Paciente p, Medico m){
        this.descEnfer = descripcion ;
        this.medicamentos = medicamentos ;
        this.fecha = fecha ;
        this.paciente = p ;
        this.medico = m ;
    }

    public int getIdHisCli() {
        return idHisCli;
    }

    public String getDescEnfer() {
        return descEnfer;
    }

    public void setDescEnfer(String descEnfer) {
        this.descEnfer = descEnfer;
    }

    public String getMedicamentos() {
        return medicamentos;
    }

    public void setMedicamentos(String medicamentos) {
        this.medicamentos = medicamentos;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }
    
    
    @Override
    public String toString(){
        return paciente.getDni() + ". Razon: " + this.medico.getEspecialidad().getNombre() ;
    }
    
    
}
