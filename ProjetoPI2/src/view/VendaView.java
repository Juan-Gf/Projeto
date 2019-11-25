/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;


import Controller.ClienteController;
import Controller.ProdutoController;
import Controller.PedidoController;
import Model.Cliente;
import Model.Produto;
import Model.Pedido;
import Utils.GerenciadorConexao;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Administrator
 */
public class VendaView extends javax.swing.JFrame {

    private String CPF;
    private String Modelo;
    private String Tamanho;
    private int quantidade;
    private double precoInicial;
    private double precoFinal;
    private double precoVenda;
    private String idPedido;
    
    public void atualizarTotal(){
      precoVenda = precoVenda + (Double)tblCarrinho.getValueAt(quantidade-1,3);
      txtValorTotal.setText(String.valueOf(precoVenda));
    }
    
    public void criaIDPedido(){
        
            idPedido = "Agora Vai";
        
    }

    public void carregaTenis(String Modelo, String Tamanho) {
        ArrayList<Produto> listaP = new ArrayList<>();
        listaP = ProdutoController.carregarProdutos();
        
        for (Produto p : listaP) {
            if (p.getModeloProduto().equals(Modelo) && p.getTamanhoProduto().equals(Tamanho)) {
                txtMarca.setText(String.valueOf(p.getMarcaProduto()));
                txtIDProdutos.setText(String.valueOf(p.getIdProduto()));
                txtGenero.setText(String.valueOf(p.getGeneroProduto()));
                txtPreco.setText(String.valueOf(p.getPrecoProduto()));
                precoInicial = p.getPrecoProduto();
            }
        }
    }
    
//    public static boolean salvarVenda() {
//        boolean retorno = false;
//        Connection conexao = null;
//        PreparedStatement instrucaoSQL = null;
//
//        try {
//
//            //Tenta estabeler a conexão com o SGBD e cria comando a ser executado conexão
//            //Obs: A classe GerenciadorConexao já carrega o Driver e define os parâmetros de conexão
//            conexao = GerenciadorConexao.abrirConexao();
//
//            instrucaoSQL = conexao.prepareStatement("INSERT INTO pedido (id_pedido,cliente_pedido,data_pedido,quantidade_pedido,)VALUES(?,?,?,?,?,?,?,?)"
//            ,Statement.RETURN_GENERATED_KEYS);
//            instrucaoSQL.setString(1, p.getModeloProduto());
//            instrucaoSQL.setInt(2, p.getQuantidadeProduto());
//            instrucaoSQL.setString(3, p.getMarcaProduto());
//            instrucaoSQL.setString(4, p.getCategoriaProduto());
//            instrucaoSQL.setString(5, p.getGeneroProduto());
//            instrucaoSQL.setString(6, p.getTamanhoProduto());
//            instrucaoSQL.setDouble(7, p.getPrecoProduto());
//            instrucaoSQL.setString(8, p.getDescricaoProduto());//Caso queira retornar o ID do cliente
//            
//            //Adiciono os parâmetros ao meu comando SQL
//
//            int linhasAfetadas = instrucaoSQL.executeUpdate();
//
//            if (linhasAfetadas > 0) {
//                retorno = true;
//
//                ResultSet generatedKeys = instrucaoSQL.getGeneratedKeys(); //Recupero o ID do cliente
//                if (generatedKeys.next()) {
//                    p.setIdProduto(generatedKeys.getInt(1));
//                } else {
//                    throw new SQLException("Falha ao obter o ID do produto");
//                }
//            } else {
//                retorno = false;
//            }
//
//        } catch (SQLException | ClassNotFoundException ex) {
//            System.out.println(ex.getMessage());
//            retorno = false;;
//        } finally {
//
//            //Libero os recursos da memória
//            try {
//                if (instrucaoSQL != null) {
//                    instrucaoSQL.close();
//                }
//
//                GerenciadorConexao.fecharConexao();
//
//            } catch (SQLException ex) {
//            }
//        }
//
//        return retorno;
//    }
    
    public void limparTenis() {
                txtModeloTenis.setText("");
                txtIDProdutos.setText("");
                txtGenero.setText("");
                cboxTamanho.setSelectedIndex(-1);
                txtMarca.setText("");
                SPquantidade.setValue(1);
                precoInicial = 0;
                txtPreco.setText("");
                
    }
    public void limparCliente() {
                txtCPF.setText("");
                txtNomeCliente.setText("");
                txtIDCliente.setText("");
    }
    


    public void carregaCliente(String CPF) {

        ArrayList<Cliente> lista = new ArrayList<>();
        lista = ClienteController.carregarClientes();
        boolean verificaCPF = false;
        for (Cliente c : lista) {
            if (c.getCPF().equals(CPF)) {
                txtIDCliente.setText(String.valueOf(c.getId()));
                txtNomeCliente.setText(String.valueOf(c.getNome()));
                verificaCPF = true;
            }
        }
        if (verificaCPF==false){
            JOptionPane.showMessageDialog(null, "CPF não vinculado a nenhum cliente.");
        }
    }

    public VendaView() {
        initComponents();

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
        jblLogo = new javax.swing.JLabel();
        jblIDCliente = new javax.swing.JLabel();
        jblNomeCliente = new javax.swing.JLabel();
        txtNomeCliente = new javax.swing.JTextField();
        jblPreço = new javax.swing.JLabel();
        txtPreco = new javax.swing.JTextField();
        jblCarrinho = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblCarrinho = new javax.swing.JTable();
        jblValorTotal = new javax.swing.JLabel();
        txtValorTotal = new javax.swing.JTextField();
        JbtnFinalizar = new javax.swing.JButton();
        JbtnCancelar = new javax.swing.JButton();
        jbtnCarrinho1 = new javax.swing.JButton();
        jlbPreco1 = new javax.swing.JLabel();
        JlbQuantidade = new javax.swing.JLabel();
        jlbMarca = new javax.swing.JLabel();
        jlbTamanho = new javax.swing.JLabel();
        jblGenero = new javax.swing.JLabel();
        cboxTamanho = new javax.swing.JComboBox<>();
        txtMarca = new javax.swing.JTextField();
        jblNomeCliente1 = new javax.swing.JLabel();
        txtIDCliente = new javax.swing.JTextField();
        txtGenero = new javax.swing.JTextField();
        txtModeloTenis = new javax.swing.JTextField();
        jblNomeCliente2 = new javax.swing.JLabel();
        txtIDProdutos = new javax.swing.JTextField();
        txtCPF = new javax.swing.JFormattedTextField();
        txtBuscarCPF = new javax.swing.JButton();
        txtBuscarModeloTenis = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        SPquantidade = new javax.swing.JSpinner();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Venda");
        setBackground(new java.awt.Color(204, 204, 204));
        setResizable(false);

        jPanel1.setToolTipText("Venda");

        jblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pacote_imagens/Camada 2.png"))); // NOI18N

        jblIDCliente.setText("CPF:");

        jblNomeCliente.setText("Nome Cliente:");

        txtNomeCliente.setEditable(false);

        jblPreço.setText("Preço");

        txtPreco.setEditable(false);
        txtPreco.setToolTipText("");
        txtPreco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecoActionPerformed(evt);
            }
        });

        jblCarrinho.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jblCarrinho.setText("CARRINHO DE COMPRAS");

        jScrollPane2.setBorder(javax.swing.BorderFactory.createTitledBorder("Detalhes da venda"));

        tblCarrinho.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "IDProduto", "Nome Produto", "Quantidade", "Valor Total  Item"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblCarrinho.setEnabled(false);
        jScrollPane2.setViewportView(tblCarrinho);
        if (tblCarrinho.getColumnModel().getColumnCount() > 0) {
            tblCarrinho.getColumnModel().getColumn(0).setResizable(false);
            tblCarrinho.getColumnModel().getColumn(1).setResizable(false);
            tblCarrinho.getColumnModel().getColumn(2).setResizable(false);
            tblCarrinho.getColumnModel().getColumn(3).setResizable(false);
        }

        jblValorTotal.setText("Valor Total:");

        txtValorTotal.setEditable(false);
        txtValorTotal.setToolTipText("");
        txtValorTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValorTotalActionPerformed(evt);
            }
        });

        JbtnFinalizar.setText("Finalizar");
        JbtnFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbtnFinalizarActionPerformed(evt);
            }
        });

        JbtnCancelar.setText("Cancelar");
        JbtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbtnCancelarActionPerformed(evt);
            }
        });

        jbtnCarrinho1.setText("Carrinho");
        jbtnCarrinho1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCarrinho1ActionPerformed(evt);
            }
        });

        jlbPreco1.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jlbPreco1.setText("*Nome Produto");

        JlbQuantidade.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        JlbQuantidade.setText("Quantidade:");

        jlbMarca.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jlbMarca.setText("Marca:");

        jlbTamanho.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jlbTamanho.setText("*Tamanho:");

        jblGenero.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jblGenero.setText("Genêro:");

        cboxTamanho.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "35 à 38", "39 à 42", "43 à 45" }));
        cboxTamanho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxTamanhoActionPerformed(evt);
            }
        });

        txtMarca.setEditable(false);
        txtMarca.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N

        jblNomeCliente1.setText("ID Cliente");

        txtIDCliente.setEditable(false);

        txtGenero.setEditable(false);
        txtGenero.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N

        jblNomeCliente2.setText("ID Produto:");
        jblNomeCliente2.setPreferredSize(new java.awt.Dimension(61, 16));

        txtIDProdutos.setEditable(false);
        txtIDProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDProdutosActionPerformed(evt);
            }
        });

        try {
            txtCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCPFActionPerformed(evt);
            }
        });
        txtCPF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCPFKeyTyped(evt);
            }
        });

        txtBuscarCPF.setText("Buscar");
        txtBuscarCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarCPFActionPerformed(evt);
            }
        });

        txtBuscarModeloTenis.setText("Buscar");
        txtBuscarModeloTenis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarModeloTenisActionPerformed(evt);
            }
        });

        jLabel1.setText("Itens com * são obrigatorios");

        jLabel2.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel2.setText("INFORMAÇÕES DO PRODUTO");

        jLabel3.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel3.setText("INFORMAÇÕES DO CLIENTE");

        SPquantidade.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        SPquantidade.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                SPquantidadeStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jblGenero)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jblNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jblIDCliente))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtIDCliente)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtBuscarCPF)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(txtNomeCliente)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jblNomeCliente1)
                                    .addComponent(jlbPreco1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtModeloTenis)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel1)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(jblNomeCliente2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(txtIDProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(txtGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(jlbTamanho)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(cboxTamanho, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                            .addGap(0, 8, Short.MAX_VALUE))))))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jlbMarca, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtBuscarModeloTenis, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(JlbQuantidade)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(SPquantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jblPreço, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(18, 18, 18)
                            .addComponent(jbtnCarrinho1))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(jblCarrinho, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(113, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(JbtnCancelar)
                                        .addGap(18, 18, 18)
                                        .addComponent(JbtnFinalizar))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jblValorTotal)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(49, 49, 49))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(249, 249, 249)
                .addComponent(jblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jblCarrinho))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jblValorTotal))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JbtnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JbtnFinalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jblIDCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtBuscarCPF))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jblNomeCliente))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jblNomeCliente1)
                            .addComponent(txtIDCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlbPreco1)
                            .addComponent(txtModeloTenis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlbMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jblNomeCliente2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtIDProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jblGenero)
                            .addComponent(txtGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlbTamanho)
                            .addComponent(cboxTamanho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtBuscarModeloTenis)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jblPreço)
                            .addComponent(JlbQuantidade)
                            .addComponent(jbtnCarrinho1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SPquantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPrecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecoActionPerformed
        
    }//GEN-LAST:event_txtPrecoActionPerformed

    private void JbtnFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbtnFinalizarActionPerformed
        int idProduto = Integer.parseInt(txtIDProdutos.getText());
        int idCliente = Integer.parseInt(txtIDCliente.getText());
        
        int quantidadeItens;
        int repetir=quantidade;
        double valorPedido;
        
        
        
            
        while(repetir!=0){
            quantidadeItens = (Integer)tblCarrinho.getValueAt(2,repetir-1);
            valorPedido = (Integer)tblCarrinho.getValueAt(3,repetir-1);
            
            
            
            if(PedidoController.salvar(idPedido, idProduto, idCliente, quantidadeItens, valorPedido))
                {
                    //Recarrego a tabela com os dados resgatados do banco de dados                   
                    
                    JOptionPane.showMessageDialog(null,"Produto cadastrado com sucesso!");
                    limparTabela();
            }else{
                    JOptionPane.showMessageDialog(null,"Falha ao cadastrar produto");
            }
            repetir--;
        }    
        
           
          
              
        
    
        this.dispose();

          // TODO add your handling code here:
    }//GEN-LAST:event_JbtnFinalizarActionPerformed
    
    public void limparTabela() {
	((DefaultTableModel) tblCarrinho.getModel()).setRowCount(0);
    }
    
    private void JbtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbtnCancelarActionPerformed
        limparTabela();         
    //  this.dispose();
    }//GEN-LAST:event_JbtnCancelarActionPerformed

    private void txtValorTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValorTotalActionPerformed
        
    }//GEN-LAST:event_txtValorTotalActionPerformed

    private void jbtnCarrinho1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCarrinho1ActionPerformed
         int idProduto = Integer.parseInt(txtIDProdutos.getText());
         int quantia = Integer.parseInt(SPquantidade.getValue().toString());
         double preco = Double.parseDouble(txtPreco.getText());
         
         DefaultTableModel dtmVenda = (DefaultTableModel)tblCarrinho.getModel();
         Object[] dados = {idProduto,txtModeloTenis.getText(),quantia,preco};
         dtmVenda.addRow(dados);
         quantidade++;
         atualizarTotal();
         criaIDPedido();
    }//GEN-LAST:event_jbtnCarrinho1ActionPerformed

    private void txtBuscarCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarCPFActionPerformed
        if (txtCPF.equals(null)) {
            System.out.println("Insira o CPF");
        } else {
            CPF = txtCPF.getText();
            carregaCliente(CPF);

        }
    }//GEN-LAST:event_txtBuscarCPFActionPerformed

    private void txtBuscarModeloTenisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarModeloTenisActionPerformed
        Modelo = txtModeloTenis.getText();
        Tamanho = String.valueOf(cboxTamanho.getSelectedItem());
        carregaTenis(Modelo, Tamanho);
    }//GEN-LAST:event_txtBuscarModeloTenisActionPerformed

    private void txtCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCPFActionPerformed

    }//GEN-LAST:event_txtCPFActionPerformed

    private void txtCPFKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCPFKeyTyped
        if (evt.getKeyChar() == '@') {

            evt.consume();
            JOptionPane.showMessageDialog(null, "Não é permitido essa tecla");
            return;
        }
        char c = evt.getKeyChar();
        if (((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE) && (c != '.')) {
            evt.consume();
            JOptionPane.showMessageDialog(this, "Não é permitido letras e caracteres!");
            return;
        }    // TODO add your handling code here:
    }//GEN-LAST:event_txtCPFKeyTyped

    private void txtIDProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDProdutosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDProdutosActionPerformed

    private void SPquantidadeStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_SPquantidadeStateChanged
        precoFinal = precoInicial*Double.parseDouble(SPquantidade.getValue().toString());
        txtPreco.setText(String.valueOf(precoFinal));  
    }//GEN-LAST:event_SPquantidadeStateChanged

    private void cboxTamanhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxTamanhoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboxTamanhoActionPerformed

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
            java.util.logging.Logger.getLogger(VendaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VendaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VendaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VendaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VendaView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JbtnCancelar;
    private javax.swing.JButton JbtnFinalizar;
    private javax.swing.JLabel JlbQuantidade;
    private javax.swing.JSpinner SPquantidade;
    private javax.swing.JComboBox<String> cboxTamanho;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel jblCarrinho;
    private javax.swing.JLabel jblGenero;
    private javax.swing.JLabel jblIDCliente;
    private javax.swing.JLabel jblLogo;
    private javax.swing.JLabel jblNomeCliente;
    private javax.swing.JLabel jblNomeCliente1;
    private javax.swing.JLabel jblNomeCliente2;
    private javax.swing.JLabel jblPreço;
    private javax.swing.JLabel jblValorTotal;
    private javax.swing.JButton jbtnCarrinho1;
    private javax.swing.JLabel jlbMarca;
    private javax.swing.JLabel jlbPreco1;
    private javax.swing.JLabel jlbTamanho;
    private javax.swing.JTable tblCarrinho;
    private javax.swing.JButton txtBuscarCPF;
    private javax.swing.JButton txtBuscarModeloTenis;
    private javax.swing.JFormattedTextField txtCPF;
    private javax.swing.JTextField txtGenero;
    private javax.swing.JTextField txtIDCliente;
    private javax.swing.JTextField txtIDProdutos;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtModeloTenis;
    private javax.swing.JTextField txtNomeCliente;
    private javax.swing.JTextField txtPreco;
    private javax.swing.JTextField txtValorTotal;
    // End of variables declaration//GEN-END:variables
}
