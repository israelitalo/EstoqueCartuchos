/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas.Icones;

import Dao.ControlePaginasDao;
import controller.ControlePaginas;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author israe
 */
public class TelaControlPaginasRel extends javax.swing.JDialog {

    /**
     * Creates new form TelaControlPaginasRel
     */
    public TelaControlPaginasRel(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        carregarComboBoxImpressora();
        cleanTabelaVetoresErelatorioPeriodo();
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
        txtDataInicial = new javax.swing.JFormattedTextField();
        jLabel2 = new javax.swing.JLabel();
        txtDataFinal = new javax.swing.JFormattedTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        btnBusca = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jSeparator3 = new javax.swing.JSeparator();
        comboBoxImpressoras = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtPagImpressas = new javax.swing.JTextField();
        btnAdcRel = new javax.swing.JButton();
        btnImprimirRel = new javax.swing.JButton();
        radioBuscarTodos = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Relatórios de páginas impressas");
        setPreferredSize(new java.awt.Dimension(958, 745));

        jPanel1.setPreferredSize(new java.awt.Dimension(958, 745));

        jLabel1.setText("Data inicial:");

        try {
            txtDataInicial.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel2.setText("Data Final:");

        try {
            txtDataFinal.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        btnBusca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Telas/Icones/icones/magnifier.png"))); // NOI18N
        btnBusca.setText("Buscar");
        btnBusca.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscaActionPerformed(evt);
            }
        });

        jTable1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "IMPRESSORA", "DATA", "PAG. TOTAL"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        jScrollPane1.setViewportView(jTable1);

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);

        comboBoxImpressoras.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Impressoras" }));
        comboBoxImpressoras.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        comboBoxImpressoras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxImpressorasActionPerformed(evt);
            }
        });

        jLabel3.setText("Impressoras:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("TOTAL DE PÁGINAS IMPRESSAS NO PERÍODO:");

        txtPagImpressas.setEditable(false);
        txtPagImpressas.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        txtPagImpressas.setOpaque(false);
        txtPagImpressas.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtPagImpressasCaretUpdate(evt);
            }
        });

        btnAdcRel.setText("Adc. Impressora ao Relatório");
        btnAdcRel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAdcRel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdcRelActionPerformed(evt);
            }
        });

        btnImprimirRel.setText("Imprimir Relatório");
        btnImprimirRel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnImprimirRel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirRelActionPerformed(evt);
            }
        });

        radioBuscarTodos.setText("Buscar todos");
        radioBuscarTodos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(comboBoxImpressoras, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDataInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDataFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(radioBuscarTodos, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnImprimirRel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAdcRel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtPagImpressas))))
                .addGap(50, 50, 50))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(radioBuscarTodos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(comboBoxImpressoras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(txtDataInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtDataFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)
                        .addComponent(btnBusca)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtPagImpressas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAdcRel)
                .addGap(18, 18, 18)
                .addComponent(btnImprimirRel)
                .addContainerGap(182, Short.MAX_VALUE))
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

    public void cleanTabelaVetoresErelatorioPeriodo(){
        ControlePaginasDao cpd = new ControlePaginasDao();
        cpd.zerarIdTabelaReceberVetores();//Para o id da tabela recebervetores sempre iniciar em 1.
        cpd.deletarRelatorioVetores();//limpando a planilha de receber relatório.
        cpd.deletarRelatorioFinal();
    }
    private void btnBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscaActionPerformed

        //Quando o radio Buscar todos não está selecionado
        if(radioBuscarTodos.isSelected() == false){
            ControlePaginasDao cpd = new ControlePaginasDao();
        
            String impressora = (String) comboBoxImpressoras.getSelectedItem();
        
            int idImpressora = cpd.getIdJcomboBoxImpressora(impressora);
            
            
            String dataInicial = txtDataInicial.getText();
            String dataFinal = txtDataFinal.getText();
            //Caso os campos das datas sejam = "    -  -  ", deve-se, aqui, tratar tal excesao.
                
                //Verificação abaixo não funciona. É gerada uma Exceção no conolse, apenas.
                if(dataInicial != "  /  /    " && dataFinal != "  /  /    "){
                    dataInicial = dataToSql(dataInicial);
                    dataFinal = dataToSql(dataFinal);

                listarRelatorio(idImpressora, dataInicial, dataFinal);

                txtPagImpressas.setText(Integer.toString(getPagImpressas()));

                }
                else{
                    System.out.println("erro.");

                }

        }
        //Quando o radio Buscar todos está selecionado
        if(radioBuscarTodos.isSelected() == true){
            
            ControlePaginasDao cpd = new ControlePaginasDao();
            cpd.zerarIdTabelaReceberVetores();//Para o id da tabela recebervetores sempre iniciar em 1.
            cpd.deletarRelatorioVetores();//limpando a planilha de receber relatório.
            
            //Tentando inserir todos os dados de uma única vez, para impressão do relatório de forma otimizada.
            String[] vetorImpressoras = vetorImpressoras();
            //Convertendo datas para  formato do SQL
            String dataInicial = dataToSql(txtDataInicial.getText());
            //Convertendo datas para  formato do SQL
            String dataFinal = dataToSql(txtDataFinal.getText());
            String paginasTotal = txtPagImpressas.getText();// Rever esta linha!!!! Linha para adicioanr informação à tabela.

            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            Date data = new Date();
            String dataAtual = dataToSql(sdf.format(data));
            //pegando id das impressoras, através do vetorImpressoras;
        
            for(int i = 0; i<vetorImpressoras.length;i++){
                cpd.getIdJcomboBoxImpressora(vetorImpressoras[i]);
                //System.out.println(cpd.getIdJcomboBoxImpressora(vetorImpressoras[i]));
            
                List<ControlePaginas>lista = cpd.listar(cpd.getIdJcomboBoxImpressora(vetorImpressoras[i]), dataInicial, dataFinal);
            
                DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            
                model.setNumRows(0);
             
                for(ControlePaginas cp: cpd.listar(cpd.getIdJcomboBoxImpressora(vetorImpressoras[i]), dataInicial, dataFinal)){
                    model.addRow(new Object[]{
                    cp.getIdControle(),
                    cp.getImpressora(),
                    cp.getData(),
                    cp.getPaginaTotal()
                    });
                }    
            
            int linhas = jTable1.getRowCount();
            int vetor[] = new int[linhas];//Criando vetor com alocação do mesmo tamanho da quantidade de linhas.
                
                
                for(int j=0; j < vetor.length; j++){
                    System.out.println("Coletando linha da tabela.");
                    vetor [j] = (Integer) jTable1.getModel().getValueAt(j, 3);
            
                    // >>Teste<< Código para selecionar a última linha da tabela.
                    jTable1.changeSelection(jTable1.getRowCount()-1,jTable1.getRowCount(),false,false);

                    int linhaSelecionada = jTable1.getSelectedRow();
                                
                    int valorUltimaLinha = (int) jTable1.getModel().getValueAt(linhaSelecionada, 3);
            
                    this.soma = valorUltimaLinha - vetor[0];
            
                    //Condição caso só haja 1 linha.
                    if(this.soma == 0){
                        this.soma = vetor[0];
                    }
            
                }
            //Criando objeto para armazenar impressoras[i] para lançar no banco de dados.
            ControlePaginas cp = new ControlePaginas();
            cp.setImpressora(vetorImpressoras[i]);
            cp.setData(dataAtual);
            cp.setSoma(soma);
                if(cpd.salvarRelatorioVetores(cp) == true){
                    System.out.println(" Objeto " + cp.getImpressora() + " salvo com sucesso!");
                }
            setPagImpressas(soma);
            soma = 0;
            
            //txtPagImpressas.setText(Integer.toString(getPagImpressas()));
            }
        
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        
            model.removeRow(jTable1.getSelectedRow());
            
            listarVetores();
        }
        
    }//GEN-LAST:event_btnBuscaActionPerformed

    public void listarVetores(){
        
        int qtdPaginas = 0;
        
        ControlePaginasDao cpd = new ControlePaginasDao();
        List<ControlePaginas> lista = cpd.listarRelatorioVetores();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        
        model.setNumRows(0);
        
        for(ControlePaginas cp: cpd.listarRelatorioVetores()){
            model.addRow(new Object[]{
                cp.getIdReceberVetores(),
                cp.getImpressora(),
                cp.getData(),
                cp.getSoma()
            });
        }
        
        int linhas = jTable1.getRowCount();
        int vetor[] = new int[linhas];
        
        for(int i=0;i<vetor.length;i++){
            //Selecionar a primeira linha da tabela.
            jTable1.changeSelection(i, jTable1.getRowCount(), false, false);
            
            int linhaSelecionada = jTable1.getSelectedRow();
            
            vetor[i] = (int) jTable1.getModel().getValueAt(linhaSelecionada, 3);
            
            qtdPaginas += vetor[i];
            
        }
        System.out.println(qtdPaginas);
        txtPagImpressas.setText(Integer.toString(qtdPaginas));
    }
    
    private void txtPagImpressasCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtPagImpressasCaretUpdate
        //
    }//GEN-LAST:event_txtPagImpressasCaretUpdate

    int soma = 0;
    
    private void btnAdcRelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdcRelActionPerformed
        
        if(radioBuscarTodos.isSelected() == false){
            //Código funcionando, para adicionar itens na tabela relatorioperiodo, mas só adiciona uma impressora por vez, manualmente.
            String impressora = (String) comboBoxImpressoras.getSelectedItem();
                                 //Convertendo datas para  formato do SQL
            String dataInicial = dataToSql(txtDataInicial.getText());
                               //Convertendo datas para  formato do SQL
            String dataFinal = dataToSql(txtDataFinal.getText());
            String paginasTotal = txtPagImpressas.getText();
        
            //Converter paginasTotal para int
            int paginasTotalInt = Integer.parseInt(paginasTotal);

            //metodo para adicionar informações à tabela de relatório.
            ControlePaginas cp = new ControlePaginas();
            ControlePaginasDao cpd = new ControlePaginasDao();
        
            cp.setImpressora(impressora);
            cp.setDataInicial(dataInicial);
            cp.setDataFinal(dataFinal);
            cp.setPaginaTotal(paginasTotalInt);
        
            if(cpd.relatorioFinal(cp) == true){
                JOptionPane.showMessageDialog(null, "Impressora incluída com sucesso ao relatório.");
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Impressora já inclída no relatório.");
            }
        }
        
        if(radioBuscarTodos.isSelected() == true){
            JOptionPane.showMessageDialog(null, "Para adicionar apenas uma impressora ao relatório, \n" + "desmerque a opção Buscar todos.");
        }
    }//GEN-LAST:event_btnAdcRelActionPerformed

    private void btnImprimirRelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirRelActionPerformed
        
        if(radioBuscarTodos.isSelected() == false){
            TelaRelatorioPeriodoTable relatorioFinal = new TelaRelatorioPeriodoTable(null, rootPaneCheckingEnabled);
        
            MessageFormat header = new MessageFormat("Controle de impressões de " + txtDataInicial.getText() + " a " + txtDataFinal.getText());
            try {
                relatorioFinal.tableRelatorio.print(JTable.PrintMode.FIT_WIDTH, header, null);
                ControlePaginasDao cpd = new ControlePaginasDao();
                cpd.deletarRelatorioFinal();
            }catch (java.awt.print.PrinterException e) {
                System.err.format("Cannot print %s%n", e.getMessage());
            }
        }
        
        if(radioBuscarTodos.isSelected() == true){
            MessageFormat header = new MessageFormat("Controle de impressões de " + txtDataInicial.getText() + " a " + txtDataFinal.getText());
            try {
                jTable1.print(JTable.PrintMode.FIT_WIDTH, header, null);
                ControlePaginasDao cpd = new ControlePaginasDao();
                cpd.deletarRelatorioVetores();
                cpd.zerarIdTabelaReceberVetores();
            }catch (java.awt.print.PrinterException e) {
                System.err.format("Cannot print %s%n", e.getMessage());
            }
        }
        
    }//GEN-LAST:event_btnImprimirRelActionPerformed

    private void comboBoxImpressorasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxImpressorasActionPerformed
      //
    }//GEN-LAST:event_comboBoxImpressorasActionPerformed
              
    public void listarRelatorio(Integer idImpressora, String dataInicial, String dataFinal){
        
        ControlePaginasDao cpd = new ControlePaginasDao();
        //teste
        String impressora = (String) comboBoxImpressoras.getSelectedItem();
        
        idImpressora = cpd.getIdJcomboBoxImpressora(impressora);
        
        dataInicial = txtDataInicial.getText();
        dataFinal = txtDataFinal.getText();
        
        dataInicial = dataToSql(dataInicial);
        dataFinal = dataToSql(dataFinal);
        
        List<ControlePaginas>lista = cpd.listar(idImpressora, dataInicial, dataFinal);
        
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        
        model.setNumRows(0);
        
        for(ControlePaginas cp: cpd.listar(idImpressora, dataInicial, dataFinal)){
            
            model.addRow(new Object[]{
                cp.getIdControle(),
                cp.getImpressora(),
                cp.getData(),
                cp.getPaginaTotal()
            });
        }

        int linhas = jTable1.getRowCount();
        
        if(linhas>0){
            int vetor[] = new int[linhas];//Criando vetor com alocação do mesmo tamanho da quantidade de linhas.
            //int soma = 0;
            for(int i = 0; i < linhas; i++){
            vetor [i] = (Integer) jTable1.getModel().getValueAt(i, 3);
            
            // >>Teste<< Código para selecionar a última linha da tabela.
            jTable1.changeSelection(jTable1.getRowCount()-1,jTable1.getRowCount(),false,false);
            
            int linhaSelecionada = jTable1.getSelectedRow();
            
            int valorUltimaLinha = (int) jTable1.getModel().getValueAt(linhaSelecionada, 3);
            
            this.soma = valorUltimaLinha - vetor[0];
            
                //Condição caso só haja 1 linha.
                if(this.soma == 0){
                    this.soma = vetor[0];
                }
            }
            setPagImpressas(soma);
        }
        else
        {
            setPagImpressas(0);
        }
        
    }
    
    public String[] vetorImpressoras(){
        
        comboBoxImpressoras.removeItem("Impressoras");
        int qtdImpressoras = comboBoxImpressoras.getModel().getSize();
        String[] vetorImpressora = new String[qtdImpressoras];
        ControlePaginasDao cpd = new ControlePaginasDao();
        for(int i=0;i<vetorImpressora.length;i++){
            cpd.todasImpressoras(vetorImpressora);
            System.out.println("Vetor na posição [" + i + "]: " + vetorImpressora[i]);
        }
        
        return vetorImpressora;
    }
    
    private int pagImpressas = 0;
    
    public void setPagImpressas(int pagImpressas){
        this.pagImpressas = pagImpressas;
    }
    
    public int getPagImpressas(){
        return pagImpressas;
    }
    
    public void carregarComboBoxImpressora(){
        ControlePaginasDao cpd = new ControlePaginasDao();
        cpd.carregarComboBoxImpressora(comboBoxImpressoras);
    }
    
    public String dataToSql(String data){
        // 05-10-2019
        
        String dia = data.substring(0,2);
        String mes = data.substring(3,5);
        String ano = data.substring(6,10);
        
        data = ano + "-" + mes + "-" + dia;
        
        return data;
    }
    
    public String dataToJava(String data){
        // 2019-10-05
        String ano = data.substring(0,4);
        String mes = data.substring(5,7);
        String dia = data.substring(8,10);
        
        data = dia + "/" + mes + "/" + ano;
        
        return data;
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
            java.util.logging.Logger.getLogger(TelaControlPaginasRel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaControlPaginasRel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaControlPaginasRel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaControlPaginasRel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TelaControlPaginasRel dialog = new TelaControlPaginasRel(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnAdcRel;
    private javax.swing.JButton btnBusca;
    private javax.swing.JButton btnImprimirRel;
    private javax.swing.JComboBox<String> comboBoxImpressoras;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable jTable1;
    private javax.swing.JRadioButton radioBuscarTodos;
    private javax.swing.JFormattedTextField txtDataFinal;
    private javax.swing.JFormattedTextField txtDataInicial;
    private javax.swing.JTextField txtPagImpressas;
    // End of variables declaration//GEN-END:variables
}
