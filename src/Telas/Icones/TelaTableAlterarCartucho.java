/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas.Icones;

import Dao.CartuchoDao;
import controller.Cartucho;
import java.awt.event.KeyEvent;
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

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setImpressora(String impressora) {
        this.impressora = impressora;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }
    
    /**
     * Creates new form TelaTableAlterarCartucho
     */
    public TelaTableAlterarCartucho(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        txtBuscar.requestFocus(true);
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
        txtBuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        radioBuscarTodos = new javax.swing.JRadioButton();
        labelVoltar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Lista de cartuchos");
        setResizable(false);

        jTableAlterarCartucho.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTableAlterarCartucho.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CODIGO", "MODELO", "TIPO", "IMPRESSORA", "COR"
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
        jTableAlterarCartucho.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTableAlterarCartucho.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableAlterarCartuchoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableAlterarCartucho);

        txtBuscar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtBuscar.setToolTipText("Digite aqui o item que deseja selecionar");
        txtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarActionPerformed(evt);
            }
        });

        btnBuscar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Telas/Icones/icones/magnifier.png"))); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.setToolTipText("Buscar");
        btnBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        btnBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnBuscarKeyPressed(evt);
            }
        });

        radioBuscarTodos.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        radioBuscarTodos.setSelected(true);
        radioBuscarTodos.setText("Buscar Todos");
        radioBuscarTodos.setToolTipText("Marque para buscar todos os cartuchos cadastrados");
        radioBuscarTodos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        radioBuscarTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioBuscarTodosActionPerformed(evt);
            }
        });

        labelVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Telas/Icones/icones/Logout_37127.png"))); // NOI18N
        labelVoltar.setToolTipText("Voltar");
        labelVoltar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelVoltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelVoltarMouseClicked(evt);
            }
        });
        labelVoltar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                labelVoltarKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 694, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(radioBuscarTodos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(12, 12, 12))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelVoltar)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(labelVoltar)
                .addGap(18, 18, 18)
                .addComponent(radioBuscarTodos)
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 390, Short.MAX_VALUE)
                .addContainerGap())
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
                c.getModelo(),
                c.getTipo(),
                c.getModeloImpressora(),
                c.getCor()
            });

        }
        
        jTableAlterarCartucho.setModel(modelo);
        
        jTableAlterarCartucho.getColumnModel().getColumn(0).setPreferredWidth(0);
        jTableAlterarCartucho.getColumnModel().getColumn(1).setPreferredWidth(120);
        jTableAlterarCartucho.getColumnModel().getColumn(2).setPreferredWidth(60);
        jTableAlterarCartucho.getColumnModel().getColumn(3).setPreferredWidth(230);
        jTableAlterarCartucho.getColumnModel().getColumn(4).setPreferredWidth(60);
    }
    
    private void jTableAlterarCartuchoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableAlterarCartuchoMouseClicked
        if(evt.getClickCount() == 2){
            int linha = jTableAlterarCartucho.getSelectedRow();
        
            if(linha != -1){
                this.idCartucho = jTableAlterarCartucho.getModel().getValueAt(linha, 0).toString();
                this.tipo = jTableAlterarCartucho.getModel().getValueAt(linha, 2).toString();
                this.modelo = jTableAlterarCartucho.getModel().getValueAt(linha, 1).toString();
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
    
    public void listarCartuchosComLike(String buscar){
        
        CartuchoDao cd = new CartuchoDao();
            
        List<Cartucho> listaCartucho = cd.listaCartuchoTelaTableComLike(buscar);

        DefaultTableModel modelo = (DefaultTableModel) jTableAlterarCartucho.getModel();

        modelo.setNumRows(0);

        for (Cartucho c : cd.listaCartuchoTelaTableComLike(buscar)) {

            modelo.addRow(new Object[]{
                c.getIdCartucho(),
                c.getModelo(),
                c.getTipo(),
                c.getModeloImpressora(),
                c.getCor()
            });

        }

        jTableAlterarCartucho.setModel(modelo);

        jTableAlterarCartucho.getColumnModel().getColumn(0).setPreferredWidth(0);
        jTableAlterarCartucho.getColumnModel().getColumn(1).setPreferredWidth(120);
        jTableAlterarCartucho.getColumnModel().getColumn(2).setPreferredWidth(60);
        jTableAlterarCartucho.getColumnModel().getColumn(3).setPreferredWidth(230);
        jTableAlterarCartucho.getColumnModel().getColumn(4).setPreferredWidth(60);
    }
    
    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        
        if(radioBuscarTodos.isSelected()==true){
            listarCartuchos();
            txtBuscar.requestFocus(true);
        }
        else{
            String buscar = txtBuscar.getText().toUpperCase();
        
            if(!buscar.equals("")){
                listarCartuchosComLike(buscar);
                txtBuscar.setText("");
                txtBuscar.requestFocus(true);
            }
            else{
                JOptionPane.showMessageDialog(null, "Digite um termo para pesquisa.");
                txtBuscar.requestFocus(true);
            }
        }
        
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void txtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarActionPerformed
        btnBuscar.requestFocus(true);
    }//GEN-LAST:event_txtBuscarActionPerformed
    
    public void eventoRadioBuscarTodos(){
        if(radioBuscarTodos.isSelected()==true){
            btnBuscar.requestFocus(true);
        }
        else{
            txtBuscar.requestFocus(true);
        }
    }
    
    private void btnBuscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnBuscarKeyPressed
        
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            if(radioBuscarTodos.isSelected()==true){
                listarCartuchos();
                txtBuscar.requestFocus(true);
            }
            else{
                String buscar = txtBuscar.getText().toUpperCase();
        
                if(!buscar.equals("")){
                    listarCartuchosComLike(buscar);
                    txtBuscar.setText("");
                    txtBuscar.requestFocus(true);
                }
                else{
                    JOptionPane.showMessageDialog(null, "Digite um termo para pesquisa.");
                    txtBuscar.requestFocus(true);
                }
            }
        }
        
    }//GEN-LAST:event_btnBuscarKeyPressed

    private void radioBuscarTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioBuscarTodosActionPerformed
        if(radioBuscarTodos.isSelected()==true){
            btnBuscar.requestFocus(true);
        }
        else{
            txtBuscar.requestFocus(true);
        }
    }//GEN-LAST:event_radioBuscarTodosActionPerformed

    private void labelVoltarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_labelVoltarKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ESCAPE){
            dispose();
        }
    }//GEN-LAST:event_labelVoltarKeyPressed

    private void labelVoltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelVoltarMouseClicked
        dispose();
    }//GEN-LAST:event_labelVoltarMouseClicked

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
    private javax.swing.JButton btnBuscar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableAlterarCartucho;
    private javax.swing.JLabel labelVoltar;
    private javax.swing.JRadioButton radioBuscarTodos;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
