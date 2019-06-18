/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.Date;
import java.util.List;
import modelo.*;

/**
 *
 * @author kachu
 */
public class Controlador {
    Persistencia persistencia ;
    
    public Controlador(Persistencia p){
        this.persistencia = p ;
    }
    
    //METODOS DE PACIENTE
    public List listarPacientes(){
        //return persistencia.buscarTodos(Paciente.class);
        return persistencia.buscarTodosOrdenadosPor(Paciente.class, Paciente_.apellido) ;
    }
    
    public void altaPaciente(int dni , String nombre , String apellido, Date fecha, int tel , String hisMedic){
        this.persistencia.iniciarTransaccion();
        try {
            Paciente paciente = new Paciente (dni,nombre,apellido.toUpperCase(),fecha,tel,hisMedic) ;
            this.persistencia.insertar(paciente);
            this.persistencia.confirmarTransaccion();
        } catch (Exception e) {
            this.persistencia.descartarTransaccion();
            System.err.println("No se puede agregar el paciente!");
        }
    }
    
    public void modificacionPaciente(Paciente p  , String nombre, String apellido,Date fecha,int tel, String hisMedic){
        if (p != null){
            this.persistencia.iniciarTransaccion();
            p.setNombre(nombre);
            p.setApellido(apellido);
            p.setFechaNac(fecha);
            p.setNumTel(tel);
            p.setHistorialMedico(hisMedic);
            persistencia.modificar(p);
            persistencia.confirmarTransaccion();
        }
    }
    
    public void eliminarPaciente(Paciente p){
        if(p!=null){
            this.persistencia.iniciarTransaccion();
            this.persistencia.eliminar(p);
            this.persistencia.confirmarTransaccion();
        }
    }
    
    //METODOS DE HISTORIA CLINICA
    public List listarHistoriasClinicas(){
        return this.persistencia.buscarTodosOrdenadosPor(HistoriaClinica.class, HistoriaClinica_.paciente) ;
    }
    
    public void altaHistoriaClinica(String descEnfer , String medicamentos,Date fecha, Paciente pac){
        this.persistencia.iniciarTransaccion();
        try {
            
            HistoriaClinica hisCli = new HistoriaClinica(descEnfer,medicamentos , fecha);
            hisCli.setPaciente(pac);
            pac.setHistoriaClinica(hisCli);
            this.persistencia.modificar(pac);
            this.persistencia.insertar(hisCli);
            this.persistencia.confirmarTransaccion();
        } catch (Exception e) {
            this.persistencia.descartarTransaccion();
            System.err.println("No se puede agregar la historia clinica");
        }
    } 
    
    public void modificarHistoClinica(HistoriaClinica hc , Date fecha , String desEnfer , String Medicamentos){
        this.persistencia.iniciarTransaccion();
        if((hc != null)){
            hc.setFecha(fecha);
            hc.setDescEnfer(desEnfer);
            hc.setMedicamentos(Medicamentos);
            this.persistencia.modificar(hc);
            this.persistencia.confirmarTransaccion();
            
        }else{
            this.persistencia.descartarTransaccion();
        }
        
    }
    
    //METODOS DE MEDICO
     public List listarMedico() {
        return persistencia.buscarTodosOrdenadosPor(Medico.class, Medico_.apellido);
        //return persistencia.buscarTodos(Medico.class);
    }
    
    public void altaMedico (int nrMatricula, String nombre, String apellido, int nrTel, Especialidad espe){
        this.persistencia.iniciarTransaccion();
        try {
            Medico medico = new Medico (nrMatricula,nombre,apellido,nrTel,espe);
            this.persistencia.insertar(medico);
            this.persistencia.confirmarTransaccion();
        }
        catch (Exception e) {
            System.out.println("error"+e.getMessage());
            this.persistencia.descartarTransaccion();
        } 
    }
    
    public void modificarMedico (Medico medico, String nombre, String apellido, int nrTel, Especialidad espe){
        if (medico != null){
            this.persistencia.iniciarTransaccion();
           // medico.setNrMatricula(nrMatricula);
            medico.setNombre(nombre);
            medico.setApellido(apellido);
            medico.setNrTel(nrTel);
            medico.setEspecialidad(espe);
            this.persistencia.modificar(medico);
            this.persistencia.confirmarTransaccion();
            
        }
    }

    
    
    //METODOS DE ESPECIALIDAD
     public List listarEspecialidades() {
        return persistencia.buscarTodos(Especialidad.class);
    }
     
    

    public void altaEspecialidad(String nombre, String descripcion) {
        this.persistencia.iniciarTransaccion();
        try {
            Especialidad especialidad = new Especialidad (nombre.toUpperCase(), descripcion);
            this.persistencia.insertar(especialidad);
            this.persistencia.confirmarTransaccion();
        }
        catch (Exception e) {
            System.out.println("error"+e.getMessage());
            this.persistencia.descartarTransaccion();
        
        }
    }
    
    public void modificarEspecialidad(Especialidad especialidad, String nombre, String descripcion) {
        if (especialidad != null) {
            this.persistencia.iniciarTransaccion();
            especialidad.setNombre(nombre);
            especialidad.setDescripcion(descripcion);
            this.persistencia.modificar(especialidad);
            this.persistencia.confirmarTransaccion();
        }
    }
    
    //METODOS DE TURNOS
    
    public List listarTurnos(){
        return this.persistencia.buscarTodos(Turno.class) ;
    }
    
    public void altaTurno(Date fecha, int horarioTur , Paciente p , Medico m) {
        this.persistencia.iniciarTransaccion();
        try {
            Turno t = new Turno(fecha, horarioTur, p, m) ;
            this.persistencia.insertar(t);
            this.persistencia.confirmarTransaccion();
        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());
            this.persistencia.descartarTransaccion();
        }
    }
    
}
