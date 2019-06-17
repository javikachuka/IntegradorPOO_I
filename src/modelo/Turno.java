/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
@Table(name="turnos")
public class Turno {
    @Id
    @SequenceGenerator(name="sec_tur",initialValue=1,allocationSize = 1)  
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="sec_tur")
    private int idTurno ;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fechaTurno ;
    private int horarioTurno ; // horario por ejemplo a las 8 hs
    private String recordatorio ;
    private boolean asistencia;
    @OneToOne
    private Paciente paciente ;
    @ManyToOne
    private Medico medico;
    
    public Turno(){
        
    }
    
    public Turno(Date fechaTurno, int horarioTurno,Paciente paciente, Medico medico){
        this.fechaTurno = fechaTurno ;
        this.horarioTurno = horarioTurno ;
        this.paciente = paciente ;
        this.medico = medico ;
    }

    public Turno(Date fechaTurno, int horarioTurno, String recordatorio, Paciente paciente, Medico medico) {
        this.fechaTurno = fechaTurno;
        this.horarioTurno = horarioTurno;
        this.recordatorio = recordatorio;
        this.paciente = paciente;
        this.medico = medico;
    }

    public int getIdTurno() {
        return idTurno;
    }

    public Date getFechaTurno() {
        return fechaTurno;
    }

    public void setFechaTurno(Date fechaTurno) {
        this.fechaTurno = fechaTurno;
    }

    public int getHorarioTurno() {
        return horarioTurno;
    }

    public void setHorarioTurno(int horarioTurno) {
        this.horarioTurno = horarioTurno;
    }

    public String getRecordatorio() {
        return recordatorio;
    }

    public void setRecordatorio(String recordatorio) {
        this.recordatorio = recordatorio;
    }

    public boolean isAsistencia() {
        return asistencia;
    }

    public void setAsistencia(boolean asistencia) {
        this.asistencia = asistencia;
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
    
    
    
    
    
}
