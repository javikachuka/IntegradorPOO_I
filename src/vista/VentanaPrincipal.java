/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.Controlador;
import javax.swing.JFrame;

/**
 *
 * @author kachu
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    private final Controlador controlador;
    /**
     * Creates new form VentanaPrincipal
     */
    public VentanaPrincipal(Controlador c) {
        
        initComponents();
        this.controlador = c ;
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnPaciente = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnHisCli = new javax.swing.JButton();
        btnTur = new javax.swing.JButton();
        btnMed = new javax.swing.JButton();
        btnEspe = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnPaciente.setText("PACIENTES");
        btnPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPacienteActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel1.setText("VENTANA PRINCIPAL");

        btnHisCli.setText("HISTORIAS CLINICAS");
        btnHisCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHisCliActionPerformed(evt);
            }
        });

        btnTur.setText("TURNOS");
        btnTur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTurActionPerformed(evt);
            }
        });

        btnMed.setText("MEDICOS");
        btnMed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMedActionPerformed(evt);
            }
        });

        btnEspe.setText("ESPECIALIDADES");
        btnEspe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEspeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnHisCli, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEspe, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnTur, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)
                            .addComponent(btnMed, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnTur, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPaciente, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnMed, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnHisCli, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE))
                .addGap(28, 28, 28)
                .addComponent(btnEspe, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(105, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPacienteActionPerformed
        try {
            
            this.dispose();
            VistaPaciente vp = new VistaPaciente(controlador,this ) ;
           
        } catch (Exception e) {
            System.out.println("ERROR papa");
        }
        
        
    }//GEN-LAST:event_btnPacienteActionPerformed

    private void btnHisCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHisCliActionPerformed
        try {
            
            this.dispose();
            VistaHistoriaClinica vhc = new VistaHistoriaClinica(controlador,this) ;
           
        } catch (Exception e) {
            System.out.println("ERROR papa");
        }
    }//GEN-LAST:event_btnHisCliActionPerformed

    private void btnTurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTurActionPerformed
        this.dispose();
        VistaTurno vt = new VistaTurno(controlador, this) ;
    }//GEN-LAST:event_btnTurActionPerformed

    private void btnEspeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEspeActionPerformed
        try {
            
            this.dispose();
            VistaEspecialidad ve = new VistaEspecialidad(controlador,this) ;
           
        } catch (Exception e) {
            System.out.println("ERROR papa");
        }
    }//GEN-LAST:event_btnEspeActionPerformed

    private void btnMedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMedActionPerformed
        try {
            
            this.dispose();
            VistaMedico vm = new VistaMedico(controlador,this) ;
           
        } catch (Exception e) {
            System.out.println("ERROR papa");
        }
    }//GEN-LAST:event_btnMedActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEspe;
    private javax.swing.JButton btnHisCli;
    private javax.swing.JButton btnMed;
    private javax.swing.JButton btnPaciente;
    private javax.swing.JButton btnTur;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}