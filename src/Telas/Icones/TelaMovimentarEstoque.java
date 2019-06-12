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
public class TelaMovimentarEstoque extends javax.swing.JDialog {

    /**
     * Creates new form TelaMovimentarEstoque
     */
    public TelaMovimentarEstoque(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        listarCartuchos();
        zerarCamposIniciais();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaMovEstoque = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtAddMovEstoque = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtRemoveMovEstoque = new javax.swing.JTextField();
        icone_add_estetica = new javax.swing.JLabel();
        btnMovEstoque = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Incluir/subtrair estoque");

        tabelaMovEstoque.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "CÓDIGO", "MODELO", "COR", "QUANTIDADE"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaMovEstoque.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaMovEstoqueMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaMovEstoque);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Telas/Icones/icones/remover_pequeno.png"))); // NOI18N

        jLabel5.setText("Inserir itens ao estoque:");

        jLabel7.setText("Saída de Itens do estoque:");

        txtRemoveMovEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRemoveMovEstoqueActionPerformed(evt);
            }
        });

        icone_add_estetica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Telas/Icones/icones/add_pequeno.png"))); // NOI18N

        btnMovEstoque.setBackground(new java.awt.Color(255, 255, 255));
        btnMovEstoque.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Telas/Icones/icones/ok.png"))); // NOI18N
        btnMovEstoque.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMovEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMovEstoqueActionPerformed(evt);
            }
        });

        jLabel1.setText("Movimentar estoque:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(icone_add_estetica)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAddMovEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtRemoveMovEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnMovEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 64, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(icone_add_estetica, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(txtAddMovEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(txtRemoveMovEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1))
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnMovEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );

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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtRemoveMovEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRemoveMovEstoqueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRemoveMovEstoqueActionPerformed

    public void listarCartuchos(){
        CartuchoDao cd = new CartuchoDao();
        
        List<Cartucho> listaCartuchos = cd.selectCartuchoMovEstoque();
        
        DefaultTableModel modelo = new DefaultTableModel();
        
        modelo.addColumn("CÓDIGO");
        modelo.addColumn("MODELO");
        modelo.addColumn("COR");
        modelo.addColumn("QUANTIDADE");
        
        Object rowData[] = new Object[4];
        
        for(int i=0; i<listaCartuchos.size(); i++){
            rowData[0] = listaCartuchos.get(i).getIdCartucho();
            rowData[1] = listaCartuchos.get(i).getModelo();
            rowData[2] = listaCartuchos.get(i).getCor();
            rowData[3] = listaCartuchos.get(i).getQuantidade();
            
            modelo.addRow(rowData);
        }
        tabelaMovEstoque.setModel(modelo);
    }
    
    private void limparCampos(){
        txtAddMovEstoque.setText("");
        txtRemoveMovEstoque.setText("");
    }
    
    public void zerarCamposIniciais(){
        txtAddMovEstoque.setText("0");
        txtRemoveMovEstoque.setText("0");
    }
    
    private void tabelaMovEstoqueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaMovEstoqueMouseClicked

    }//GEN-LAST:event_tabelaMovEstoqueMouseClicked

    private void btnMovEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMovEstoqueActionPerformed
        int linha = tabelaMovEstoque.getSelectedRow();
        
        if(linha <= -1){
            JOptionPane.showMessageDialog(null, "Selecione um item na tabela para prosseguir!");
        }
        //Pegando id da linha da tabela tabelaCartuchos.
        String id = tabelaMovEstoque.getModel().getValueAt(linha, 0).toString();
        //Convertendo o String id para int, atribuindo-o à variável idInt.
        int idInt = Integer.parseInt(id);
        
        CartuchoDao cd = new CartuchoDao();
        
        //quantidadeDB recebe o valor que o método getEstoque na classe (CartuchoDao) retorna.
        int quantidadeBD = cd.getEstoque(idInt);
            
            if(txtAddMovEstoque.getText() != "0" && txtRemoveMovEstoque.getText().equals("0")){
                //coletando a quantidade digitada pelo usuário no campo txtAddMovEstoque.
                int quantidade = Integer.parseInt(txtAddMovEstoque.getText());
        
                if(quantidade >= 0 && quantidade <= 6){
                    Cartucho cartucho = new Cartucho();
                    //quantidadeBD recebe o valor da soma das variáveis quantidadeDB + quantidade. Método somaQuantidade está na classe Cartucho.
                    quantidadeBD = cartucho.somaQuantidade(quantidadeBD, quantidade);
                    //Setando a quantidade a ser alterada, para ser recebida pelo banco de dados.
                    cartucho.setQuantidade(quantidadeBD);
                    //Método para receber a quantidadeDB e setá-la no banco de dados, no atributo quantidade, no id_cartucho selecionado.
                    cd.atualizarQuantidade(cartucho, idInt);
                    //atualizar a lista de cartuchos na tabela.
                    listarCartuchos();
                
                    if(quantidade > 0){
                        JOptionPane.showMessageDialog(null, "Quantidade inserida com sucesso!");
                        zerarCamposIniciais();
                    }
                }
                else if(quantidade > 6){
                    JOptionPane.showMessageDialog(null, "Você tentou inserir uma quantidade muito alta de cartuchos...\n"
                    + "Verifique a informação e tente novamente!");
                    zerarCamposIniciais();
                }
                else
                {
                JOptionPane.showMessageDialog(null, "Digite um número maior ou igual a 0 e menor que 7\n"
                    + "no campo de adicionar item ao estoque!");
                    zerarCamposIniciais();
                }
            }
            else if (txtRemoveMovEstoque.getText() != "0" && txtAddMovEstoque.getText().equals("0")){
            
                int diminuirQuantidade = Integer.parseInt(txtRemoveMovEstoque.getText());
            
                if(diminuirQuantidade >= 0 && diminuirQuantidade <= 6){
            
                    Cartucho cartucho = new Cartucho();
            
                    quantidadeBD = cartucho.subtrairQuantidade(quantidadeBD, diminuirQuantidade);
                
                    if(quantidadeBD >= 0){
                        cartucho.setQuantidade(quantidadeBD);
                
                        System.out.println(quantidadeBD);
            
                        cd.atualizarQuantidade(cartucho, idInt);
            
                        listarCartuchos();
                
                        if(diminuirQuantidade > 0){
                            JOptionPane.showMessageDialog(null, "Quantidade subtraída com sucesso!");
                            zerarCamposIniciais();
                        }
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null, "Operação não realizada. Estoque não possui a quantidade de itens"
                        + " solicitados.");
                    }
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Digite um número maior ou igual a 0 e menor que 7\n"
                    + "no campo de subtrair item do estoque!");
                    zerarCamposIniciais();
                }
            }   
            else
            {
                JOptionPane.showMessageDialog(null, "Faça uma movimentação do estoque por vez.");
                zerarCamposIniciais();
            }
    }//GEN-LAST:event_btnMovEstoqueActionPerformed

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
            java.util.logging.Logger.getLogger(TelaMovimentarEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaMovimentarEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaMovimentarEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaMovimentarEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TelaMovimentarEstoque dialog = new TelaMovimentarEstoque(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnMovEstoque;
    private javax.swing.JLabel icone_add_estetica;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaMovEstoque;
    private javax.swing.JTextField txtAddMovEstoque;
    private javax.swing.JTextField txtRemoveMovEstoque;
    // End of variables declaration//GEN-END:variables
}
