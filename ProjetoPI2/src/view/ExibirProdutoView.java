/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import Controller.ProdutoController;
import Model.Produto;
import java.util.ArrayList;
import javax.swing.ButtonModel;
import javax.swing.JOptionPane;

/**
 *
 * @author matheus.dcosta2
 */
import javax.swing.table.DefaultTableModel;
public class ExibirProdutoView extends javax.swing.JFrame {
private int produtoID;
    /**
     * Creates new form CadProduto
     */
    public ExibirProdutoView() {
        initComponents();
    }
    
    public ExibirProdutoView(int id) {
        initComponents();
        produtoID=id;
        carregaProduto(produtoID);
    }
    
        public void carregaProduto(int id){
        ArrayList<Produto> listaP = new ArrayList<>();
        listaP = ProdutoController.carregarProdutos();
        for(Produto p:listaP){
            if(p.getIdProduto() ==id){
                txtNome.setText(String.valueOf(p.getNomeProduto()));
                txtModelo.setText(String.valueOf(p.getModeloProduto()));
                jFmQuantidade.setText(String.valueOf(p.getQuantidadeProduto()));
                jCbMarca.setSelectedItem(String.valueOf(p.getMarcaProduto()));
                jCbCategoria.setSelectedItem(String.valueOf(p.getCategoriaProduto()));
                jCbGenero.setSelectedItem(String.valueOf(p.getGeneroProduto()));
                jCbTamanho.setSelectedItem(String.valueOf(p.getTamanhoProduto()));
                txtPreco.setText(String.valueOf(p.getPrecoProduto()));
                txtDescricao.setText(String.valueOf(p.getDescricaoProduto()));
                        
                
                
            }
        }
    }
    
 
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoGenero = new javax.swing.ButtonGroup();
        grupoTamanho = new javax.swing.ButtonGroup();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jlbNome = new javax.swing.JLabel();
        jlbPreco1 = new javax.swing.JLabel();
        JlbQuantidade = new javax.swing.JLabel();
        jlbMarca = new javax.swing.JLabel();
        jlbCategoria = new javax.swing.JLabel();
        jlbTamanho = new javax.swing.JLabel();
        jlbPreco = new javax.swing.JLabel();
        jlbDescricao = new javax.swing.JLabel();
        txtModelo = new javax.swing.JTextField();
        txtDescricao = new javax.swing.JTextField();
        txtPreco = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JButton();
        jFmQuantidade = new javax.swing.JFormattedTextField();
        txtNome = new javax.swing.JTextField();
        jCbMarca = new javax.swing.JComboBox<>();
        jCbCategoria = new javax.swing.JComboBox<>();
        jblGenero = new javax.swing.JLabel();
        jCbTamanho = new javax.swing.JComboBox<>();
        jCbGenero = new javax.swing.JComboBox<>();
        jMenuBar1 = new javax.swing.JMenuBar();
        MenuExcutar = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();

        jMenu1.setText("File");
        jMenuBar2.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar2.add(jMenu2);

        jMenu3.setText("jMenu3");

        jMenuItem5.setText("jMenuItem5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Dados do Produto");
        setResizable(false);

        jlbNome.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jlbNome.setText("Nome:");

        jlbPreco1.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jlbPreco1.setText("Modelo:");

        JlbQuantidade.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        JlbQuantidade.setText("Quantidade:");

        jlbMarca.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jlbMarca.setText("Marca:");

        jlbCategoria.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jlbCategoria.setText("Categoria:");

        jlbTamanho.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jlbTamanho.setText("Tamanho:");

        jlbPreco.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jlbPreco.setText("Preço:");

        jlbDescricao.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jlbDescricao.setText("Descrição:");

        txtModelo.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N

        txtDescricao.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        txtDescricao.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtDescricao.setToolTipText("");
        txtDescricao.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        txtPreco.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        txtPreco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecoActionPerformed(evt);
            }
        });

        btnCancelar.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        btnCancelar.setText("Sair");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        jFmQuantidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFmQuantidadeActionPerformed(evt);
            }
        });

        txtNome.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N

        jCbMarca.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jCbMarca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--- ", "Adidas", "Nike" }));

        jCbCategoria.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jCbCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---", "Esportivo", "Casual", "Social" }));

        jblGenero.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jblGenero.setText("Genêro:");

        jCbTamanho.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "35 à 38", "39 à 42", "43 à 45" }));

        jCbGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Masculino", "Feminino" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jlbDescricao)
                            .addGap(18, 18, 18)
                            .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jlbPreco1)
                                .addComponent(jlbMarca)
                                .addComponent(jlbNome)
                                .addComponent(jlbTamanho)
                                .addComponent(jblGenero)
                                .addComponent(jlbPreco))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(21, 21, 21)
                                    .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(jCbMarca, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addGap(15, 15, 15)
                                                    .addComponent(jlbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jCbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                    .addComponent(JlbQuantidade)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(jFmQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addComponent(txtNome)
                                        .addComponent(jCbTamanho, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jCbGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlbNome)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlbPreco1)
                            .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JlbQuantidade)
                            .addComponent(jFmQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbCategoria)
                    .addComponent(jCbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCbMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jblGenero)
                    .addComponent(jCbGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbTamanho)
                    .addComponent(jCbTamanho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbPreco)
                    .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jlbDescricao)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(txtDescricao, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE))
                .addGap(30, 30, 30)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );

        MenuExcutar.setText("Executar");

        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pacote_imagens/Novo-18dp.png"))); // NOI18N
        jMenuItem4.setText("Novo");
        MenuExcutar.add(jMenuItem4);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pacote_imagens/Exit-18dp.png"))); // NOI18N
        jMenuItem3.setText("Sair");
        MenuExcutar.add(jMenuItem3);

        jMenuBar1.add(MenuExcutar);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPrecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecoActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        new telaProdutos().setVisible(true);
        this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void jFmQuantidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFmQuantidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFmQuantidadeActionPerformed

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
            java.util.logging.Logger.getLogger(ExibirProdutoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ExibirProdutoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ExibirProdutoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ExibirProdutoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ExibirProdutoView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JlbQuantidade;
    private javax.swing.JMenu MenuExcutar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.ButtonGroup grupoGenero;
    private javax.swing.ButtonGroup grupoTamanho;
    private javax.swing.JComboBox<String> jCbCategoria;
    private javax.swing.JComboBox<String> jCbGenero;
    private javax.swing.JComboBox<String> jCbMarca;
    private javax.swing.JComboBox<String> jCbTamanho;
    private javax.swing.JFormattedTextField jFmQuantidade;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jblGenero;
    private javax.swing.JLabel jlbCategoria;
    private javax.swing.JLabel jlbDescricao;
    private javax.swing.JLabel jlbMarca;
    private javax.swing.JLabel jlbNome;
    private javax.swing.JLabel jlbPreco;
    private javax.swing.JLabel jlbPreco1;
    private javax.swing.JLabel jlbTamanho;
    private javax.swing.JTextField txtDescricao;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtPreco;
    // End of variables declaration//GEN-END:variables
}
