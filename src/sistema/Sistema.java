/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema;

import controlador.Controlador;
import controlador.Persistencia;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JFrame;
import vista.VentanaPrincipal;
import vista.VistaHistoriaClinica;
import vista.VistaPaciente;

/**
 *
 * @author kachu
 */
public class Sistema {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("IntegradorPU") ;
        Persistencia p = new Persistencia(emf) ;
        Controlador c = new Controlador(p);
        VentanaPrincipal vp = new VentanaPrincipal(c);
        
        vp.setLocationRelativeTo(null) ;
        
        //vp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       // vp.setResizable(false);
        //vp.setLocationRelativeTo(null) ;
        //vp.setVisible(true);
        
        //VistaHistoriaClinica vHisCli = new VistaHistoriaClinica(c) ;
        //vHisCli.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //vHisCli.setResizable(false);
        //vHisCli.setVisible(true);
        
        
    }
}
