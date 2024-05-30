
package alvarez.santiago.contactosdbs;

/**
 *
 * @author ALVAREZ MARES SANTIAGO 6°A T/M
 */
public class Principal extends javax.swing.JFrame {
static final javax.swing.JLabel background = new javax.swing.JLabel( new javax.swing.ImageIcon(System.getProperty("user.dir") + "//images" + "//agregar.png"));    
    public Principal() {
        initComponents();
        setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JDPPrincipal = new javax.swing.JDesktopPane();
        JMBPrincipal = new javax.swing.JMenuBar();
        JMArchivo = new javax.swing.JMenu();
        JMIContactos = new javax.swing.JMenuItem();
        JMISalir = new javax.swing.JMenuItem();
        JMEditar = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout JDPPrincipalLayout = new javax.swing.GroupLayout(JDPPrincipal);
        JDPPrincipal.setLayout(JDPPrincipalLayout);
        JDPPrincipalLayout.setHorizontalGroup(
            JDPPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1192, Short.MAX_VALUE)
        );
        JDPPrincipalLayout.setVerticalGroup(
            JDPPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 652, Short.MAX_VALUE)
        );

        JMArchivo.setText("Archivo");

        JMIContactos.setText("Contactos");
        JMIContactos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMIContactosActionPerformed(evt);
            }
        });
        JMArchivo.add(JMIContactos);

        JMISalir.setText("Salir");
        JMISalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMISalirActionPerformed(evt);
            }
        });
        JMArchivo.add(JMISalir);

        JMBPrincipal.add(JMArchivo);

        JMEditar.setText("Editar");
        JMBPrincipal.add(JMEditar);

        setJMenuBar(JMBPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JDPPrincipal)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JDPPrincipal)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JMISalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMISalirActionPerformed
        
    }//GEN-LAST:event_JMISalirActionPerformed

    private void JMIContactosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMIContactosActionPerformed
       Contactos miVentana = new Contactos();
       JDPPrincipal.add(miVentana);
       miVentana.toFront();
       miVentana.setVisible(true);
       
    }//GEN-LAST:event_JMIContactosActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal();
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane JDPPrincipal;
    private javax.swing.JMenu JMArchivo;
    private javax.swing.JMenuBar JMBPrincipal;
    private javax.swing.JMenu JMEditar;
    private javax.swing.JMenuItem JMIContactos;
    private javax.swing.JMenuItem JMISalir;
    // End of variables declaration//GEN-END:variables
}
