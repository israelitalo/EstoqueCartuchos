/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas.Icones;

import Dao.CartuchoDao;
import controller.Cartucho;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author israe
 */
public class TelaTableAlterarCartucho extends javax.swing.JDialog {

    private String idCartucho;
    private String tipo;
    private String modelo;
    private String impressora;
    private String cor;
    private Integer quantidade;
    
    /**
     * Creates new form TelaTableAlterarCartucho
     */
    public TelaTableAlterarCartucho(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        listarCartuchos();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableAlterarCartucho = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Lista de cartuchos");

        jTableAlterarCartucho.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTableAlterarCartucho.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CODIGO", "TIPO", "MODELO", "IMPRESSORA", "COR"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableAlterarCartucho.setToolTipText("Clique duas vezes em um item para selecioná-lo.");
        jTableAlterarCartucho.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableAlterarCartuchoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableAlterarCartucho);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 830, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    public void listarCartuchos(){
        
        CartuchoDao cd = new CartuchoDao();
        
        List<Cartucho> listarCartucho = cd.selectCartucho();
           
        DefaultTableModel modelo = (DefaultTableModel) jTableAlterarCartucho.getModel();
        
        modelo.setNumRows(0);
        
        for (Cartucho c : cd.selectCartucho()) {

            modelo.addRow(new Object[]{
                c.getIdCartucho(),
                c.getTipo(),
                c.getModelo(),
                c.getModeloImpressora(),
                c.getCor()
            });

        }
        
        jTableAlterarCartucho.setModel(modelo);
        
        jTableAlterarCartucho.getColumnModel().getColumn(0).setPreferredWidth(0);
        jTableAlterarCartucho.getColumnModel().getColumn(1).setPreferredWidth(0);
        jTableAlterarCartucho.getColumnModel().getColumn(2).setPreferredWidth(60);
        jTableAlterarCartucho.getColumnModel().getColumn(3).setPreferredWidth(230);
        jTableAlterarCartucho.getColumnModel().getColumn(4).setPreferredWidth(40);
    }
    
    public String getModelo(){
        return modelo;
    }
    
    public String getCor(){
        return cor;
    }
    
    public String getTipo(){
        return tipo;
    }
    
    public String getImpressora(){
        return impressora;
    }
    
    public String getIdCartucho(){
        return idCartucho;
    }
    
    public Integer getQuantidade(){
        return quantidade;
    }
    
    private void jTableAlterarCartuchoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableAlterarCartuchoMouseClicked
        if(evt.getClickCount() == 2){
            int linha = jTableAlterarCartucho.getSelectedRow();
        
            if(linha != -1){
                this.idCartucho = jTableAlterarCartucho.getModel().getValueAt(linha, 0).toString();
                this.tipo = jTableAlterarCartucho.getModel().getValueAt(linha, 1).toString();
                this.modelo = jTableAlterarCartucho.getModel().getValueAt(linha, 2).toString();
                this.impressora = jTableAlterarCartucho.getModel().getValueAt(linha, 3).toString();
                this.cor = jTableAlterarCartucho.getModel().getValueAt(linha, 4).toString();
                
                CartuchoDao cd = new CartuchoDao();
                this.quantidade = cd.getEstoque((Integer) jTableAlterarCartucho.getModel().getValueAt(linha, 0));
                
                this.dispose();
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Selecione um cartucho para prosseguir!");
            }
        }
        else if(evt.getButton() == 3){
            jTableAlterarCartucho.getSelectionModel().clearSelection();
        }
    }//GEN-LAST:event_jTableAlterarCartuchoMouseClicked

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
            java.util.logging.Logger.getLogger(TelaTableAlterarCartucho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaTableAlterarCartucho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaTableAlterarCartucho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaTableAlterarCartucho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TelaTableAlterarCartucho dialog = new TelaTableAlterarCartucho(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableAlterarCartucho;
    // End of variables declaration//GEN-END:variables
}
