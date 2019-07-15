/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas.Icones;

import Dao.ControlePaginasDao;
import controller.ControlePaginas;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author israe
 */
public class TelaControlePaginas extends javax.swing.JDialog {

    /**
     * Creates new form TelaControlePaginas
     */
    public TelaControlePaginas(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        carregarComboBoxImpressora();
        jLabelDataAtual.setText(getLocalDate() + ":");
    }

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    
    private Date dataAtual = new Date();
    
    public  String getLocalDate(){
        return sdf.format(dataAtual);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jComboBoxImpressora = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtQtdFinal = new javax.swing.JSpinner();
        jLabel5 = new javax.swing.JLabel();
        btnSalvar = new javax.swing.JButton();
        txtQtdAtual = new javax.swing.JSpinner();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jComboBoxData = new javax.swing.JComboBox<>();
        jLabelData = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabelDataAtual = new javax.swing.JLabel();
        txtQtdTotal = new javax.swing.JSpinner();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        btnCalcular = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Controle de páginas impressas");
        setPreferredSize(new java.awt.Dimension(900, 700));
        setSize(new java.awt.Dimension(900, 700));

        jPanel2.setPreferredSize(new java.awt.Dimension(900, 700));

        jComboBoxImpressora.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Impressora" }));
        jComboBoxImpressora.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBoxImpressoraMouseClicked(evt);
            }
        });
        jComboBoxImpressora.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jComboBoxImpressoraComponentShown(evt);
            }
        });
        jComboBoxImpressora.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                jComboBoxImpressoraInputMethodTextChanged(evt);
            }
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
        });
        jComboBoxImpressora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxImpressoraActionPerformed(evt);
            }
        });

        jLabel1.setText("Impressora:");

        jLabel4.setText("Pág. impressas em");

        txtQtdFinal.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                txtQtdFinalStateChanged(evt);
            }
        });

        jLabel5.setText("Páginas Impressas em");

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        txtQtdAtual.setEditor(new javax.swing.JSpinner.NumberEditor(txtQtdAtual, ""));
        txtQtdAtual.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                txtQtdAtualStateChanged(evt);
            }
        });

        jLabel7.setText("Último registro da impressora:");

        jButton1.setText("Alterar");

        jButton2.setText("Excluir");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Telas/Icones/icones/relatorio.png"))); // NOI18N
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jComboBoxData.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Último registro" }));

        jLabelData.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelData.setText("  /  /    ");

        jLabel6.setText("Pág. impressas após última verificação:");

        jLabelDataAtual.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelDataAtual.setText("  /  /   ");

        txtQtdTotal.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                txtQtdTotalStateChanged(evt);
            }
        });

        btnCalcular.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Telas/Icones/icones/f5.png"))); // NOI18N
        btnCalcular.setText("Calcular Pág.");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        jLabel3.setText("Relatórios");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(jLabel4)
                .addGap(20, 20, 20)
                .addComponent(jLabelData, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(143, 143, 143)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelDataAtual)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1)
                            .addComponent(jSeparator2)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator4))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtQtdFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(264, 264, 264)
                .addComponent(txtQtdAtual, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBoxImpressora, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(jLabel7)
                                .addGap(57, 57, 57)
                                .addComponent(jComboBoxData, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtQtdTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(btnCalcular))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))))
                .addContainerGap(93, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(74, 74, 74)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtQtdFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(jLabelData, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelDataAtual)
                            .addComponent(txtQtdAtual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtQtdTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCalcular))
                        .addGap(34, 34, 34)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSalvar)
                            .addComponent(jButton1)
                            .addComponent(jButton2)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBoxImpressora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel7)
                            .addComponent(jComboBoxData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(225, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    private int qtdTotalGlobal;
    
    public Integer getQtdTotalGlobal(){
        return this.qtdTotalGlobal;
    }
    
    private int qtdToDB;
    
    public void setQtdToDB(int qtdToDB){
        this.qtdToDB = qtdToDB;
    }
    
    public Integer getQtdToDB(){
        return qtdToDB;
    }
    
    public String dataToSql(String data){
        
        String dia = data.substring(0,2);
        String mes = data.substring(3,5);
        String ano = data.substring(6,10);
        
        data = ano + "-" + mes + "-" + dia;
        
        return data;
    }
    
    public String dataToJava(String data){
        // 2019-11-05
        String ano = data.substring(0,4);
        String mes = data.substring(5,7);
        String dia = data.substring(8,10);
        
        data = dia + "/" + mes + "/" + ano;
        
        return data;
    }
    
    private void txtQtdAtualStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_txtQtdAtualStateChanged
        
    }//GEN-LAST:event_txtQtdAtualStateChanged

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        
        ControlePaginasDao cpd = new ControlePaginasDao();
        
        String impressora = (String) jComboBoxImpressora.getSelectedItem();
        
        int idImpressora = cpd.getIdJcomboBoxImpressora(impressora);
        
        String dataToDB = cpd.dataToSql(getLocalDate());
        
        int paginaTotal = (int) txtQtdAtual.getValue();
        
        ControlePaginas cp = new ControlePaginas();
        
        cp.setIdImpressora(idImpressora);
        cp.setData(dataToDB);
        cp.setPaginaTotal(paginaTotal);
        
        if(cpd.salvar(cp) == true){
            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
        }
        
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void jComboBoxImpressoraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBoxImpressoraMouseClicked

    }//GEN-LAST:event_jComboBoxImpressoraMouseClicked

    private void jComboBoxImpressoraInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_jComboBoxImpressoraInputMethodTextChanged

    }//GEN-LAST:event_jComboBoxImpressoraInputMethodTextChanged

    private void jComboBoxImpressoraComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jComboBoxImpressoraComponentShown

    }//GEN-LAST:event_jComboBoxImpressoraComponentShown

    private void jComboBoxImpressoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxImpressoraActionPerformed
        ControlePaginasDao cpd = new ControlePaginasDao();
        
        String impressora = (String)jComboBoxImpressora.getSelectedItem();
        
        if(impressora != "Impressora"){
            int idImpressora = cpd.getIdJcomboBoxImpressora(impressora);
        
            String ultimaData = cpd.getLastDateOfImpressora(idImpressora);
            
            if(ultimaData != "Não há registros."){
                jComboBoxData.removeAllItems();
        
                jComboBoxData.addItem(ultimaData);
        
                jComboBoxData.setSelectedItem(ultimaData);
        
                jLabelData.setText(ultimaData + ":");
        
                //jComboBoxData.setEnabled(false);
        
                ultimaData = dataToSql(ultimaData);
        
                int qtdFinal = cpd.getQtdPaginas(idImpressora, ultimaData);
        
                qtdTotalGlobal = qtdFinal;
        
                txtQtdFinal.setValue(getQtdTotalGlobal());
                
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Não há histórico de datas para esta impressora!");
                qtdTotalGlobal = 0;
                txtQtdFinal.setValue(getQtdTotalGlobal());
                jComboBoxData.removeAllItems();
                jComboBoxData.addItem("Último registro");
                jComboBoxData.setSelectedItem("Último registro");
                jLabelData.setText("  /  /    ");
            }
        }

    }//GEN-LAST:event_jComboBoxImpressoraActionPerformed

    private void txtQtdFinalStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_txtQtdFinalStateChanged
        txtQtdFinal.setValue(getQtdTotalGlobal());
    }//GEN-LAST:event_txtQtdFinalStateChanged

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        
        if((int) txtQtdAtual.getValue() > (int) txtQtdFinal.getValue()){
            
            int qtdAtual = (int) txtQtdAtual.getValue();
                
            ControlePaginas cp = new ControlePaginas();
                
            setQtdToDB(cp.diminuirPaginas(getQtdTotalGlobal(), qtdAtual));
        
            txtQtdTotal.setValue(getQtdToDB());
        }
        else
        {
            JOptionPane.showMessageDialog(null, "A quantidade em " + getLocalDate() + " deve ser maior que a quantidade anterior!");
        }
        
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void txtQtdTotalStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_txtQtdTotalStateChanged
        txtQtdTotal.setValue(getQtdToDB());
    }//GEN-LAST:event_txtQtdTotalStateChanged

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        TelaControlPaginasRel relatorios = new TelaControlPaginasRel(null, rootPaneCheckingEnabled);
        relatorios.setVisible(true);
        
    }//GEN-LAST:event_jLabel2MouseClicked

    public void carregarComboBoxImpressora(){
        ControlePaginasDao cpd = new ControlePaginasDao();
        cpd.carregarComboBoxImpressora(jComboBoxImpressora);
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
            java.util.logging.Logger.getLogger(TelaControlePaginas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaControlePaginas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaControlePaginas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaControlePaginas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TelaControlePaginas dialog = new TelaControlePaginas(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBoxData;
    private javax.swing.JComboBox jComboBoxImpressora;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelData;
    private javax.swing.JLabel jLabelDataAtual;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSpinner txtQtdAtual;
    private javax.swing.JSpinner txtQtdFinal;
    private javax.swing.JSpinner txtQtdTotal;
    // End of variables declaration//GEN-END:variables
}
