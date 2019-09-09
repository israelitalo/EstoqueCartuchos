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
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

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
        //jLabelDataAtual.setText(getLocalDate() + ":");
        
    }

    /*private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    
    private Date dataAtual = new Date();
    
    public String getLocalDate(){
        return sdf.format(dataAtual);
    }*/
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
        jComboBoxData = new javax.swing.JComboBox<String>();
        jLabelData = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        comboBoxSetor = new javax.swing.JComboBox<String>();
        txtDataRelatorio = new javax.swing.JFormattedTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Controle de páginas impressas");
        setPreferredSize(new java.awt.Dimension(958, 745));
        setSize(new java.awt.Dimension(958, 745));

        jPanel2.setPreferredSize(new java.awt.Dimension(958, 745));

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
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                jComboBoxImpressoraInputMethodTextChanged(evt);
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

        jComboBoxData.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Último registro" }));

        jLabelData.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelData.setText("  /  /    ");

        jLabel8.setText("Setor:");

        comboBoxSetor.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Setor" }));

        try {
            txtDataRelatorio.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CÓDIGO", "IMPRESSORA", "DATA", "TOTAL DE PAG. IMPRESSAS"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelData, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtQtdFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDataRelatorio, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtQtdAtual, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                        .addGap(218, 218, 218))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator3)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxImpressora, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxData, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboBoxSetor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxImpressora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel7)
                    .addComponent(jComboBoxData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(comboBoxSetor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtQtdFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabelData, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtQtdAtual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDataRelatorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1)
                .addGap(18, 18, 18)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 754, Short.MAX_VALUE)
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
        
        String dataToDB = cpd.dataToSql(txtDataRelatorio.getText());
        
        int paginaTotal = (int) txtQtdAtual.getValue();
        
        ControlePaginas cp = new ControlePaginas();
        
        cp.setIdImpressora(idImpressora);
        cp.setData(dataToDB);
        cp.setPaginaTotal(paginaTotal);
        
        if(cpd.salvar(cp) == true){
            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
            limparCampos();
        }
        
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setNumRows(0);
        
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void jComboBoxImpressoraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBoxImpressoraMouseClicked

    }//GEN-LAST:event_jComboBoxImpressoraMouseClicked

    private void jComboBoxImpressoraInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_jComboBoxImpressoraInputMethodTextChanged

    }//GEN-LAST:event_jComboBoxImpressoraInputMethodTextChanged

    private void jComboBoxImpressoraComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jComboBoxImpressoraComponentShown

    }//GEN-LAST:event_jComboBoxImpressoraComponentShown

    public void listarControlePagians(){
        ControlePaginasDao cpd = new ControlePaginasDao();
        
        String impressora = (String)jComboBoxImpressora.getSelectedItem();
        
        if(impressora != "Impressora"){
            int idImpressora = cpd.getIdJcomboBoxImpressora(impressora);
        
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        
            model.setNumRows(0);

            //Lista de controle de paginas.
            List<ControlePaginas> lista = cpd.listarControlePaginas(idImpressora);

            model.setNumRows(0);

            for(ControlePaginas cp: cpd.listarControlePaginas(idImpressora)){

                model.addRow(new Object[]{
                cp.getIdControle(),
                cp.getImpressora(),
                cp.getData(),
                cp.getPaginaTotal()
                });
            }
        }
    }
    
    public void limparCampos(){
        qtdTotalGlobal = 0;
        txtQtdFinal.setValue(getQtdTotalGlobal());
        jComboBoxData.removeAllItems();
        jComboBoxData.addItem("Último registro");
        jComboBoxData.setSelectedItem("Último registro");
        jLabelData.setText("  /  /    ");
        jComboBoxImpressora.addItem("Impressora");
        jComboBoxImpressora.setSelectedItem("Impressora");
        comboBoxSetor.removeAllItems();
        comboBoxSetor.addItem("Setor");
        comboBoxSetor.setSelectedItem("Setor");
        txtQtdAtual.setValue(0);
        txtDataRelatorio.setText("");
    }
    
    private void jComboBoxImpressoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxImpressoraActionPerformed
        ControlePaginasDao cpd = new ControlePaginasDao();
        
        String impressora = (String)jComboBoxImpressora.getSelectedItem();
        
        listarControlePagians();
                
        if(impressora != "Impressora"){
            
            jComboBoxImpressora.removeItem("Impressora");
            
            int idImpressora = cpd.getIdJcomboBoxImpressora(impressora);
            
            String ultimaData = cpd.getLastDateOfImpressora(idImpressora);
            
            int idSetor = cpd.getIdSetor(impressora);
            
            String setor = cpd.getSetor(idSetor);

            if(setor != null){
                comboBoxSetor.removeAllItems();
                comboBoxSetor.addItem(setor);
            }
            
            if(ultimaData != "Não há registros."){
                jComboBoxData.removeAllItems();
        
                jComboBoxData.addItem(ultimaData);
        
                jComboBoxData.setSelectedItem(ultimaData);
        
                jLabelData.setText(ultimaData + ":");
        
                ultimaData = dataToSql(ultimaData);
        
                int qtdFinal = cpd.getQtdPaginas(idImpressora, ultimaData);
        
                qtdTotalGlobal = qtdFinal;
        
                txtQtdFinal.setValue(getQtdTotalGlobal());
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Não há histórico de datas para esta impressora!");
                limparCampos();
            }
        }
         
    }//GEN-LAST:event_jComboBoxImpressoraActionPerformed

    private void txtQtdFinalStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_txtQtdFinalStateChanged
        txtQtdFinal.setValue(getQtdTotalGlobal());
    }//GEN-LAST:event_txtQtdFinalStateChanged

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
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox<String> comboBoxSetor;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBoxData;
    private javax.swing.JComboBox jComboBoxImpressora;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelData;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTable jTable1;
    private javax.swing.JFormattedTextField txtDataRelatorio;
    private javax.swing.JSpinner txtQtdAtual;
    private javax.swing.JSpinner txtQtdFinal;
    // End of variables declaration//GEN-END:variables
}
