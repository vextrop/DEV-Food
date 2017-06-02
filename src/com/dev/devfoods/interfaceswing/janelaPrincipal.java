package com.dev.devfoods.interfaceswing;


import com.devs.devfood.classesgerais.carregaLookAndFell;
import com.devs.devfood.classesgerais.gerenciadorJanelas;
import com.devs.devfood.classesobjetos.clnArquivos;
import com.devs.devfood.eventosbotoes.eventoJanelaPrincipal;
import java.awt.Dimension;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author comp8
 */
public class janelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form janelaPrincipal
     */
    //envio do objeto this para classe que trata os eventos dos botoes
    private eventoJanelaPrincipal principal = new eventoJanelaPrincipal(this);
    
    gerenciadorJanelas gerenciador;
    
    public janelaPrincipal() {
        
        
        carregaLookAndFell lookFell = new carregaLookAndFell();
        lookFell.carregaVisualSistema();
        initComponents();
        
        //coloca o desktop pane na pagina controladora de janelas
        //importante instancias o gerenciador depois de initComponents
        this.gerenciador = new gerenciadorJanelas(areaTrabalho);
        
        //instanciar evento dos botoes criados nesta tela
        btnCadastroFunc.addActionListener(principal);
        btnCadastroPedido.addActionListener(principal);
        btnCadastroFuncionarios.addActionListener(principal);
        btnAjuda.addActionListener(principal);
        btnAjudaSobre.addActionListener(principal);
        btnCadastroEstoque.addActionListener(principal);
        btnCadastroEst.addActionListener(principal);
        btnCadastroPed.addActionListener(principal);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        areaTrabalho = new javax.swing.JDesktopPane();
        jToolBar1 = new javax.swing.JToolBar();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        btnCadastroFunc = new javax.swing.JButton();
        btnCadastroEstoque = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        btnCadastroPedido = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JToolBar.Separator();
        btnAjuda = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        btnCadastroFuncionarios = new javax.swing.JMenuItem();
        btnCadastroEst = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        btnCadastroPed = new javax.swing.JMenuItem();
        btnAjudaBar = new javax.swing.JMenu();
        btnAjudaSobre = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("DEVfood");
        setMinimumSize(new java.awt.Dimension(1000, 600));

        areaTrabalho.setBackground(new java.awt.Color(254, 254, 254));

        jToolBar1.setBackground(new java.awt.Color(204, 204, 204));
        jToolBar1.setFloatable(false);
        jToolBar1.setRollover(true);

        jButton2.setBackground(new java.awt.Color(204, 204, 204));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/dev/devfood/icones/folder-open-information.png"))); // NOI18N
        jButton2.setFocusable(false);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jButton2);

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/dev/devfood/icones/ico.save.32.png"))); // NOI18N
        jButton1.setFocusable(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jButton1);
        jToolBar1.add(jSeparator1);

        btnCadastroFunc.setBackground(new java.awt.Color(204, 204, 204));
        btnCadastroFunc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/dev/devfood/icones/2375728.png"))); // NOI18N
        btnCadastroFunc.setFocusable(false);
        btnCadastroFunc.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCadastroFunc.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCadastroFunc.setActionCommand("cadastroFuncionarios");
        btnCadastroFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastroFuncActionPerformed(evt);
            }
        });
        jToolBar1.add(btnCadastroFunc);

        btnCadastroEstoque.setBackground(new java.awt.Color(204, 204, 204));
        btnCadastroEstoque.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/dev/devfood/icones/add-icone-4255-32.png"))); // NOI18N
        btnCadastroEstoque.setFocusable(false);
        btnCadastroEstoque.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCadastroEstoque.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCadastroEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastroEstoqueActionPerformed(evt);
            }
        });
        jToolBar1.add(btnCadastroEstoque);
        btnCadastroEstoque.setActionCommand("cadastroEstoque");
        jToolBar1.add(jSeparator2);

        btnCadastroPedido.setBackground(new java.awt.Color(204, 204, 204));
        btnCadastroPedido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/dev/devfood/icones/1426347119_shoppingcartdown.png"))); // NOI18N
        btnCadastroPedido.setFocusable(false);
        btnCadastroPedido.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCadastroPedido.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCadastroPedido.setActionCommand("cadastroPedidos");
        btnCadastroPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastroPedidoActionPerformed(evt);
            }
        });
        jToolBar1.add(btnCadastroPedido);
        jToolBar1.add(jSeparator3);

        btnAjuda.setBackground(new java.awt.Color(204, 204, 204));
        btnAjuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/dev/devfood/icones/health.png"))); // NOI18N
        btnAjuda.setFocusable(false);
        btnAjuda.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAjuda.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAjuda.setActionCommand("sobre");
        jToolBar1.add(btnAjuda);

        jMenu1.setText("Arquivo");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        jMenuItem1.setText("Abrir registro");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, 0));
        jMenuItem2.setText("Salvar alterações");
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu3.setText("Cadastros");

        btnCadastroFuncionarios.setText("Funcionários");
        btnCadastroFuncionarios.setActionCommand("cadastroFuncionarios");
        btnCadastroFuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastroFuncionariosActionPerformed(evt);
            }
        });
        jMenu3.add(btnCadastroFuncionarios);

        btnCadastroEst.setText("Estoque");
        btnCadastroEst.setActionCommand("cadastroEstoque");
        jMenu3.add(btnCadastroEst);

        jMenuBar1.add(jMenu3);

        jMenu2.setText("Pedidos");

        btnCadastroPed.setText("Realizar Pedido");
        btnCadastroPed.setActionCommand("cadastroPedidos");
        jMenu2.add(btnCadastroPed);

        jMenuBar1.add(jMenu2);

        btnAjudaBar.setText("Ajuda");

        btnAjudaSobre.setText("Sobre");
        btnAjudaSobre.setActionCommand("sobre");
        btnAjudaBar.add(btnAjudaSobre);

        jMenuBar1.add(btnAjudaBar);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 672, Short.MAX_VALUE)
                    .addComponent(areaTrabalho))
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(areaTrabalho, javax.swing.GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void btnCadastroPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastroPedidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCadastroPedidoActionPerformed

    private void btnCadastroFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastroFuncActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCadastroFuncActionPerformed

    private void btnCadastroEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastroEstoqueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCadastroEstoqueActionPerformed

    private void btnCadastroFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastroFuncionariosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCadastroFuncionariosActionPerformed
    
    
    
     
     
    public void abreJanelaSobre(){

        gerenciador.validaAbreJanelas(sobrePrograma.getInstancia());
        
    }
    public void abreJanelaCadastroPedidos(){
        
        gerenciador.validaAbreJanelas(cadastroPedido.getInstancia());
        
    }
    public void abreJanelaCadastroFuncionarios(){
        
        gerenciador.validaAbreJanelas(cadastroFuncionario.getInstancia());
        
    }
    public void abreJanelaEstoque(){
        
        gerenciador.validaAbreJanelas(cadastroEstoque.getInstancia());
        
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
            java.util.logging.Logger.getLogger(janelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(janelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(janelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(janelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new janelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane areaTrabalho;
    private javax.swing.JButton btnAjuda;
    private javax.swing.JMenu btnAjudaBar;
    private javax.swing.JMenuItem btnAjudaSobre;
    private javax.swing.JMenuItem btnCadastroEst;
    private javax.swing.JButton btnCadastroEstoque;
    private javax.swing.JButton btnCadastroFunc;
    private javax.swing.JMenuItem btnCadastroFuncionarios;
    private javax.swing.JMenuItem btnCadastroPed;
    private javax.swing.JButton btnCadastroPedido;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables
}
