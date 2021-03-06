
package Vista;
import Controlador.*;


public class VPrincipal extends javax.swing.JFrame {
Conexion cn;
    
    public VPrincipal() {
        initComponents();
        cn=new Conexion();
        cn.AccederBD();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        men_archivo = new javax.swing.JMenu();
        men_creabase = new javax.swing.JMenuItem();
        men_ctes = new javax.swing.JMenu();
        men_altacte = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        men_archivo.setText("Archivo");

        men_creabase.setText("Crear Base de datos");
        men_creabase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                men_creabaseActionPerformed(evt);
            }
        });
        men_archivo.add(men_creabase);

        jMenuBar1.add(men_archivo);

        men_ctes.setText("Clientes");
        men_ctes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                men_ctesMouseClicked(evt);
            }
        });

        men_altacte.setText("Alta Clientes");
        men_altacte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                men_altacteActionPerformed(evt);
            }
        });
        men_ctes.add(men_altacte);

        jMenuBar1.add(men_ctes);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void men_creabaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_men_creabaseActionPerformed
        // TODO add your handling code here:
        cn.CrearBD();
    }//GEN-LAST:event_men_creabaseActionPerformed

    private void men_ctesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_men_ctesMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_men_ctesMouseClicked

    private void men_altacteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_men_altacteActionPerformed
        // TODO add your handling code here:
       L_Clientes cli=new L_Clientes(this,true);
        cli.setVisible(true);
    }//GEN-LAST:event_men_altacteActionPerformed

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
            java.util.logging.Logger.getLogger(VPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VPrincipal().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuItem men_altacte;
    private javax.swing.JMenu men_archivo;
    private javax.swing.JMenuItem men_creabase;
    private javax.swing.JMenu men_ctes;
    // End of variables declaration//GEN-END:variables
}
