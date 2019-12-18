/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import civitas.Jugador;
import civitas.JugadorEspeculador;
import civitas.TituloPropiedad;
import java.util.ArrayList;
/**
 *
 * @author jesus
 */
class JugadorPanel extends javax.swing.JPanel {

    /**
     * Creates new form JugadorPanel
     */
    JugadorPanel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelNombre = new javax.swing.JLabel();
        jLabelSaldo = new javax.swing.JLabel();
        jLabelEncarcelado = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jTextFieldSaldo = new javax.swing.JTextField();
        jTextFieldEncarcelado = new javax.swing.JTextField();
        propiedades = new javax.swing.JPanel();
        jLabelJugadorActualTitulo = new javax.swing.JLabel();
        jLabelPropiedades = new javax.swing.JLabel();

        jLabelNombre.setFont(new java.awt.Font("Laksaman", 0, 15)); // NOI18N
        jLabelNombre.setText("Nombre");

        jLabelSaldo.setFont(new java.awt.Font("Laksaman", 0, 15)); // NOI18N
        jLabelSaldo.setText("Saldo");

        jLabelEncarcelado.setFont(new java.awt.Font("Laksaman", 0, 15)); // NOI18N
        jLabelEncarcelado.setText("Encarcelado");

        jTextFieldNombre.setFont(new java.awt.Font("Laksaman", 0, 15)); // NOI18N
        jTextFieldNombre.setText("Nombre");
        jTextFieldNombre.setEnabled(false);
        jTextFieldNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNombreActionPerformed(evt);
            }
        });

        jTextFieldSaldo.setFont(new java.awt.Font("Laksaman", 0, 15)); // NOI18N
        jTextFieldSaldo.setText("Saldo");
        jTextFieldSaldo.setEnabled(false);

        jTextFieldEncarcelado.setFont(new java.awt.Font("Laksaman", 0, 15)); // NOI18N
        jTextFieldEncarcelado.setText("Encarcelado");
        jTextFieldEncarcelado.setEnabled(false);
        jTextFieldEncarcelado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEncarceladoActionPerformed(evt);
            }
        });

        propiedades.setEnabled(false);

        jLabelJugadorActualTitulo.setFont(new java.awt.Font("Laksaman", 1, 15)); // NOI18N
        jLabelJugadorActualTitulo.setText("Jugador Actual");

        jLabelPropiedades.setFont(new java.awt.Font("Laksaman", 0, 15)); // NOI18N
        jLabelPropiedades.setText("Propiedades");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabelJugadorActualTitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelEncarcelado)
                    .addComponent(jLabelSaldo)
                    .addComponent(jLabelNombre))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jTextFieldEncarcelado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 4, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelPropiedades)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addComponent(propiedades, javax.swing.GroupLayout.PREFERRED_SIZE, 776, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelJugadorActualTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNombre))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelSaldo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldEncarcelado, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelEncarcelado))
                .addGap(137, 137, 137))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(78, Short.MAX_VALUE)
                .addComponent(jLabelPropiedades)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(propiedades, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldEncarceladoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEncarceladoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldEncarceladoActionPerformed

    private void jTextFieldNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNombreActionPerformed


    //Métodos
    void setJugador(Jugador jugador)
    {
        this.jugador = jugador;
        
        //Editar campos
        String encarcelado;
        encarcelado= (jugador.isEncarcelado())? "SI" : "NO";
        
        this.jTextFieldNombre.setText(jugador.getNombre());
        this.jTextFieldSaldo.setText(Float.toString(jugador.getSSaldo()));
        this.jTextFieldEncarcelado.setText(encarcelado);
        
        rellenaPropiedades(jugador.getPropiedades());
    }
    
    private void rellenaPropiedades (ArrayList<TituloPropiedad> lista) {
        
        // Se elimina la información antigua
        propiedades.removeAll();
        
        // Se recorre la lista de propiedades para ir
        //creando sus vistas individuales y añadirlas al panel
        for (TituloPropiedad t : lista) {
            PropiedadPanel vistaPropiedad = new PropiedadPanel();
            vistaPropiedad.setPropiedad(t);
            propiedades.add(vistaPropiedad);
            vistaPropiedad.setVisible(true);
        }
        // Se fuerza la actualización visual del panel propiedades y 
        //del panel del jugador
        repaint();
        revalidate();
    }
    
    
    //-----------------------------------------------------
    //Atributos
    private Jugador jugador;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelEncarcelado;
    javax.swing.JLabel jLabelJugadorActualTitulo;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelPropiedades;
    private javax.swing.JLabel jLabelSaldo;
    private javax.swing.JTextField jTextFieldEncarcelado;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldSaldo;
    private javax.swing.JPanel propiedades;
    // End of variables declaration//GEN-END:variables
}
