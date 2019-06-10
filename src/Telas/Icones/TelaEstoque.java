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
 * @author Israel
 */
public class TelaEstoque extends javax.swing.JDialog {

    /**
     * Creates new form TelaEstoque
     */
    public TelaEstoque(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        zerarCamposIniciais();
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

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaCartuchos = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabelAdd = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabelVoltar = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabelEdit = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabelRemove = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabelMovEstoque = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtAddMovEstoque = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtRemoveMovEstoque = new javax.swing.JTextField();
        icone_add_estetica = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuAtualizar = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Controle de estoque");

        tabelaCartuchos.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204)));
        tabelaCartuchos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "CÓDIGO", "TIPO", "MODELO", "IMPRESSORA", "COR", "QUANTIDADE"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaCartuchos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tabelaCartuchos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaCartuchosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaCartuchos);

        jLabel1.setText("Adicionar Cartucho");

        jLabelAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Telas/Icones/icones/add.png"))); // NOI18N
        jLabelAdd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelAddMouseClicked(evt);
            }
        });

        jLabel3.setText("Voltar");

        jLabelVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Telas/Icones/icones/Logout_37127.png"))); // NOI18N
        jLabelVoltar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelVoltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelVoltarMouseClicked(evt);
            }
        });

        jLabel4.setText("Editar Cartucho");

        jLabelEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Telas/Icones/icones/1486504369-change-edit-options-pencil-settings-tools-write_81307.png"))); // NOI18N
        jLabelEdit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelEdit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelEditMouseClicked(evt);
            }
        });

        jLabel6.setText("Remover Cartucho");

        jLabelRemove.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Telas/Icones/icones/iconfinder-trash-4341321_120557_Remover.png"))); // NOI18N
        jLabelRemove.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelRemove.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelRemoveMouseClicked(evt);
            }
        });

        jLabel2.setText("Movimentar Estoque");

        jLabelMovEstoque.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Telas/Icones/icones/clipboardplan_117816_MudancaEstoque.png"))); // NOI18N
        jLabelMovEstoque.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelMovEstoque.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMovEstoqueMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jLabelAdd)
                        .addGap(93, 93, 93)
                        .addComponent(jLabelEdit)
                        .addGap(74, 74, 74))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addGap(59, 59, 59)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabelRemove)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabelMovEstoque)
                        .addGap(89, 89, 89)
                        .addComponent(jLabelVoltar))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(74, 74, 74)
                        .addComponent(jLabel3)))
                .addGap(50, 50, 50))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelAdd)
                    .addComponent(jLabelEdit)
                    .addComponent(jLabelVoltar)
                    .addComponent(jLabelRemove)
                    .addComponent(jLabelMovEstoque))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jLabel5.setText("Inserir itens ao estoque:");

        jLabel7.setText("Saída de Itens do estoque:");

        txtRemoveMovEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRemoveMovEstoqueActionPerformed(evt);
            }
        });

        icone_add_estetica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Telas/Icones/icones/add_pequeno.png"))); // NOI18N

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Telas/Icones/icones/remover_pequeno.png"))); // NOI18N

        jLabel9.setText("Lista dos Cartuchos, Toners e Tintas em estoque");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(icone_add_estetica)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtAddMovEstoque, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(txtRemoveMovEstoque))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(220, 220, 220))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(icone_add_estetica, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtAddMovEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(txtRemoveMovEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9)
                .addGap(7, 7, 7))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 724, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 375, Short.MAX_VALUE))
        );

        jMenu1.setText("Arquivos");

        jMenuItem1.setText("Adicionar Cartucho");
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Editar Cartucho");
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("Remover Cartucho");
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        jMenuAtualizar.setText("Atualizar Página");
        jMenuAtualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuAtualizarMouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenuAtualizar);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void listarCartuchos (){
        CartuchoDao cd = new CartuchoDao();
        
        List<Cartucho> listarCartucho = cd.selectCartucho();
        
        DefaultTableModel modelo = new DefaultTableModel();//instanciando modelo da tabela.
        
        modelo.addColumn("CÓDIGO");
        modelo.addColumn("TIPO");
        modelo.addColumn("MODELO");
        modelo.addColumn("IMPRESSORA");
        modelo.addColumn("COR");
        modelo.addColumn("QUANTIDADE");
        
        Object rowData[] = new Object[6]; //6 pois é a quantidade de colunas usadas na tabela tabelaCartucho.
        
        for(int i = 0; i<listarCartucho.size(); i++){
            rowData[0] = listarCartucho.get(i).getIdCartucho();
            rowData[1] = listarCartucho.get(i).getTipo();
            rowData[2] = listarCartucho.get(i).getModelo();
            rowData[3] = listarCartucho.get(i).getImpressora();
            rowData[4] = listarCartucho.get(i).getCor();
            rowData[5] = listarCartucho.get(i).getQuantidade();
            
            modelo.addRow(rowData);
        }
        
        tabelaCartuchos.setModel(modelo);//setanto o modelo criado à tabela.
        
    }
    
    public void zerarCamposIniciais(){
        txtAddMovEstoque.setText("0");
        txtRemoveMovEstoque.setText("0");
    }
    
    private void jLabelVoltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelVoltarMouseClicked
        dispose();
    }//GEN-LAST:event_jLabelVoltarMouseClicked

    private void jLabelAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelAddMouseClicked
        //AdicionarCartuchoJdialog addCartucho = new AdicionarCartuchoJdialog(new javax.swing.JFrame(), true);//Tentativa 1. Funcional!
        AdicionarCartuchoJdialog addCartucho = new AdicionarCartuchoJdialog(null, rootPaneCheckingEnabled);//Tentativa 2.
        
        //TelaCadastroProduto addCartucho = new TelaCadastroProduto();
        addCartucho.setVisible(true);
        //dispose();
    }//GEN-LAST:event_jLabelAddMouseClicked

    private void tabelaCartuchosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaCartuchosMouseClicked
        //não utilizado.
    }//GEN-LAST:event_tabelaCartuchosMouseClicked

    private void limparCampos(){
        txtAddMovEstoque.setText("");
        txtRemoveMovEstoque.setText("");
    }
    
    private void jLabelMovEstoqueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMovEstoqueMouseClicked
        
        int linha = tabelaCartuchos.getSelectedRow();
        
        if(linha <= -1){
            JOptionPane.showMessageDialog(null, "Selecione um item na tabela abaixo para prosseguir!");
        }
        //Pegando id da linha da tabela tabelaCartuchos.
        String id = tabelaCartuchos.getModel().getValueAt(linha, 0).toString();
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
        
    }//GEN-LAST:event_jLabelMovEstoqueMouseClicked

    private void txtRemoveMovEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRemoveMovEstoqueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRemoveMovEstoqueActionPerformed

    private void jMenuAtualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuAtualizarMouseClicked
        listarCartuchos();
    }//GEN-LAST:event_jMenuAtualizarMouseClicked

    private void jLabelEditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelEditMouseClicked
        TelaAlterarCartucho telaAlterar = new TelaAlterarCartucho(null, rootPaneCheckingEnabled);
        telaAlterar.setVisible(true);
        
    }//GEN-LAST:event_jLabelEditMouseClicked

    private void jLabelRemoveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelRemoveMouseClicked
        
        TelaLogin telaLogin = new TelaLogin(null, rootPaneCheckingEnabled);
        telaLogin.setVisible(true);
        
        int linha = tabelaCartuchos.getSelectedRow();
        
        if(linha <= -1){
            JOptionPane.showMessageDialog(null, "Selecione um item na tabela abaixo para prosseguir!");
        }
        
        String id = tabelaCartuchos.getModel().getValueAt(linha, 0).toString();
        
        int idInt = Integer.parseInt(id);
        
        Cartucho cartucho = new Cartucho();
        
        CartuchoDao cd = new CartuchoDao();
        
        cd.excluir(cartucho, idInt);
        
        listarCartuchos();
        
    }//GEN-LAST:event_jLabelRemoveMouseClicked

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
            java.util.logging.Logger.getLogger(TelaEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TelaEstoque dialog = new TelaEstoque(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel icone_add_estetica;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelAdd;
    private javax.swing.JLabel jLabelEdit;
    private javax.swing.JLabel jLabelMovEstoque;
    private javax.swing.JLabel jLabelRemove;
    private javax.swing.JLabel jLabelVoltar;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenuAtualizar;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaCartuchos;
    private javax.swing.JTextField txtAddMovEstoque;
    private javax.swing.JTextField txtRemoveMovEstoque;
    // End of variables declaration//GEN-END:variables
}
