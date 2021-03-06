/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import civitas.TituloPropiedad;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.DefaultListModel;
import civitas.GestionesInmobiliarias;

/**
 *
 * @author jesus
 */
public class GestionDialog extends javax.swing.JDialog {

    /**
     * Creates new form GestionDialog
     */
    private GestionDialog(java.awt.Frame parent) {
        //Inicializo
        super(parent, true);
        initComponents();
        reiniciarOpciones();
        setGestiones();
        
        //Relativo a interfaz
        this.setBounds(0,0,354, 360);
        this.setLocationRelativeTo(null);
        
        this.setVisible(false);
        this.setResizable(false);
    }

    private void reiniciarOpciones(){
        propiedadElegida = -1;
        gestionElegida = 5;
    }
    
    static void createInstance (java.awt.Frame parent) {
        if (instancia == null)
          instancia = new GestionDialog (parent);
    }
    
    static GestionDialog getInstance() {
      return instancia;
    }
    
    private void setGestiones(){
        DefaultListModel gestiones = new DefaultListModel<>();
        ArrayList<String> opciones = new ArrayList<>(Arrays.asList(
            "Vender","Hipotecar","Cancelar Hipoteca","Construir casa",
            "Construir hotel", "Terminar"));
        
        posTerminar = opciones.indexOf("Terminar");
        opciones.forEach((s) -> {
            gestiones.addElement(s);
        });
        
        listaGestiones.setModel(gestiones);
    }
    
    private void setPropiedades(ArrayList<String> opciones){
        
        //Actualizo
        listaPropiedades.repaint();
        listaPropiedades.revalidate();
        
        DefaultListModel propiedades = new DefaultListModel<>();
        opciones.forEach((s) -> {
            propiedades.addElement(s);
        });
        
        listaPropiedades.setModel(propiedades);
    }
    
    void gestionar(ArrayList<String> propiedades){
        //Actualizo
        reiniciarOpciones();
        setPropiedades(propiedades);
        
        //Interfaz
        this.setVisible(true);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelTitulo = new javax.swing.JLabel();
        jLabelGestiones = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaGestiones = new javax.swing.JList<>();
        jLabelPropiedades = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaPropiedades = new javax.swing.JList<>();
        jButtonRealizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabelTitulo.setFont(new java.awt.Font("Laksaman", 0, 15)); // NOI18N
        jLabelTitulo.setText("Gestion Inmobiliaria");
        jLabelTitulo.setEnabled(false);
        getContentPane().add(jLabelTitulo);
        jLabelTitulo.setBounds(23, 12, 134, 31);

        jLabelGestiones.setFont(new java.awt.Font("Laksaman", 0, 15)); // NOI18N
        jLabelGestiones.setText("Gestiones");
        jLabelGestiones.setEnabled(false);
        getContentPane().add(jLabelGestiones);
        jLabelGestiones.setBounds(70, 70, 64, 31);

        listaGestiones.setFont(new java.awt.Font("Ubuntu", 0, 15)); // NOI18N
        listaGestiones.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        listaGestiones.setToolTipText("");
        listaGestiones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listaGestionesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(listaGestiones);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(40, 110, 120, 200);

        jLabelPropiedades.setFont(new java.awt.Font("Laksaman", 0, 15)); // NOI18N
        jLabelPropiedades.setText("Propiedades");
        jLabelPropiedades.setEnabled(false);
        getContentPane().add(jLabelPropiedades);
        jLabelPropiedades.setBounds(210, 70, 83, 31);

        listaPropiedades.setFont(new java.awt.Font("Ubuntu", 0, 15)); // NOI18N
        listaPropiedades.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listaPropiedadesMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(listaPropiedades);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(210, 110, 110, 200);

        jButtonRealizar.setFont(new java.awt.Font("Laksaman", 0, 15)); // NOI18N
        jButtonRealizar.setText("Realizar");
        jButtonRealizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRealizarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonRealizar);
        jButtonRealizar.setBounds(210, 10, 110, 41);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonRealizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRealizarActionPerformed
        Boolean puedoSalir = false;
        if (GestionesInmobiliarias.values()[gestionElegida] 
                            == GestionesInmobiliarias.TERMINAR)
            puedoSalir = true;
        else if (propiedadElegida != -1 && gestionElegida!=-1){
            puedoSalir = true;
        }
        
        if (puedoSalir){
            dispose();
        }
    }//GEN-LAST:event_jButtonRealizarActionPerformed

    private void listaGestionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaGestionesMouseClicked
        gestionElegida = listaGestiones.getSelectedIndex();
    }//GEN-LAST:event_listaGestionesMouseClicked

    private void listaPropiedadesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaPropiedadesMouseClicked
        propiedadElegida = listaPropiedades.getSelectedIndex();
    }//GEN-LAST:event_listaPropiedadesMouseClicked

    int getGestion(){
        return gestionElegida;
    }
    
    int getPropiedad(){
        return propiedadElegida;
    }
    /**
     * @param args the command line arguments
//     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(GestionDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(GestionDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(GestionDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(GestionDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the dialog */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                GestionDialog dialog = new GestionDialog(new javax.swing.JFrame());
//                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
//                    @Override
//                    public void windowClosing(java.awt.event.WindowEvent e) {
//                        System.exit(0);
//                    }
//                });
//                dialog.setVisible(true);
//            }
//        });
//    }
    
    //----------------------------------------------------------
    private static int posTerminar = -1;
    private int propiedadElegida;
    private int gestionElegida;
    private static GestionDialog instancia = null;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonRealizar;
    private javax.swing.JLabel jLabelGestiones;
    private javax.swing.JLabel jLabelPropiedades;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> listaGestiones;
    private javax.swing.JList<String> listaPropiedades;
    // End of variables declaration//GEN-END:variables
}
