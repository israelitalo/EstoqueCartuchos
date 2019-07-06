/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas.Icones;

import Dao.CartuchoDao;
import controller.Cartucho;
import javax.swing.JOptionPane;

/**
 *
 * @author israe
 */
public class AdicionarCartuchoJdialog extends javax.swing.JDialog {

    /**
     * Creates new form AdicionarCartucho
     */
    public AdicionarCartuchoJdialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        txtQuantidade.setText("0");
        CartuchoDao cd = new CartuchoDao();
        cd.carregarJcomboBox(jComboBoxImpressora);
        
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
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtModelo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtQuantidade = new javax.swing.JTextField();
        jButtonSalvar = new javax.swing.JButton();
        jComboBoxTipo = new javax.swing.JComboBox<>();
        jComboBoxImpressora = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        jComboBoxCor = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Adicionar item");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setSize(new java.awt.Dimension(600, 600));

        jPanel1.setPreferredSize(new java.awt.Dimension(600, 600));

        jLabel1.setText("Tipo:");

        jLabel3.setText("Modelo:");

        jLabel4.setText("Cor:");

        jLabel5.setText("Quantidade:");

        jButtonSalvar.setText("Salvar");
        jButtonSalvar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonSalvar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonSalvarMouseClicked(evt);
            }
        });
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        jComboBoxTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Toner", "Cartucho", "Tinta" }));

        jComboBoxImpressora.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Impressora / Setor" }));
        jComboBoxImpressora.setName("Lista de Impressoras"); // NOI18N
        jComboBoxImpressora.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBoxImpressoraMouseClicked(evt);
            }
        });
        jComboBoxImpressora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxImpressoraActionPerformed(evt);
            }
        });

        jLabel6.setText("Impressora:");

        jComboBoxCor.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Cor", "Preto", "Amarelo", "Vermelho", "Azul" }));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Telas/Icones/icones/diskette_save_saveas_1514.png"))); // NOI18N
        jLabel2.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                jLabel2ComponentHidden(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBoxImpressora, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBoxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButtonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(93, 93, 93)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jComboBoxCor, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxImpressora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(76, 76, 76)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jComboBoxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jComboBoxCor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(83, 83, 83)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2))
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addComponent(jButtonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 569, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSalvarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonSalvarMouseClicked
     //   
    }//GEN-LAST:event_jButtonSalvarMouseClicked

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        String modeloImpressoraJComboBox = (String) jComboBoxImpressora.getSelectedItem();
        Integer idImpressora;
                
        CartuchoDao cd = new CartuchoDao();
        
        idImpressora = cd.getIdJcomboBoxImpressora(modeloImpressoraJComboBox);
        
        Cartucho cartucho = new Cartucho();
        
        cartucho.setTipo((String) jComboBoxTipo.getSelectedItem());
        cartucho.setModelo(txtModelo.getText());
        
        cartucho.setImpressora(idImpressora);
        //cartucho.setImpressora((String) jComboBoxImpressora.getSelectedItem()); Comentado por ter mudado idImpressora para Integer, na classe controller Cartucho.
        //cartucho.setImpressora(txtImpressora.getText()); Mudando para JComboBox, linha acima.
        cartucho.setCor((String) jComboBoxCor.getSelectedItem());
        cartucho.setQuantidade(Integer.parseInt(txtQuantidade.getText()));
        
        if(txtModelo.getText().equals("") || jComboBoxCor.getSelectedItem().equals("Cor") || txtQuantidade.getText().equals(null) || jComboBoxImpressora.getSelectedItem().equals("Impressora / Setor")){
            JOptionPane.showMessageDialog(null, "Preencha todos os campos!");
        }
        else
        {
            //CartuchoDao cd = new CartuchoDao();
            
            if(cd.salvar(cartucho) == true){
                JOptionPane.showMessageDialog(null, "Item salvo com sucesso!");
                limparCampos();
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Operação não realizada!");
                limparCampos();
            }
        } 
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jComboBoxImpressoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxImpressoraActionPerformed
        
    }//GEN-LAST:event_jComboBoxImpressoraActionPerformed

    private void jLabel2ComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jLabel2ComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel2ComponentHidden

    private void jComboBoxImpressoraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBoxImpressoraMouseClicked
        
    }//GEN-LAST:event_jComboBoxImpressoraMouseClicked

public void limparCampos(){
    jComboBoxCor.setSelectedItem("Cor");
    txtModelo.setText("");
    jComboBoxImpressora.setSelectedItem("Impressora / Setor");
    txtQuantidade.setText("0");
    jComboBoxTipo.setSelectedItem("Toner");
}    
    
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
            java.util.logging.Logger.getLogger(AdicionarCartuchoJdialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdicionarCartuchoJdialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdicionarCartuchoJdialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdicionarCartuchoJdialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AdicionarCartuchoJdialog dialog = new AdicionarCartuchoJdialog(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JComboBox jComboBoxCor;
    private javax.swing.JComboBox jComboBoxImpressora;
    private javax.swing.JComboBox<String> jComboBoxTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextField txtQuantidade;
    // End of variables declaration//GEN-END:variables
}
