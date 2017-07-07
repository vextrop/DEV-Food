
package com.devs.devfood.eventosbotoes;

import com.dev.devfoods.interfaceswing.cadastroFuncionario;
import com.devs.devfood.classesobjetos.clnArquivos;
import com.dev.devfoods.interfaceswing.janelaPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import com.dev.devfoods.interfaceswing.janelaPrincipal;
import com.devs.devfood.classesobjetos.clnCadastroFuncionarios;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class eventoJanelaPrincipal implements ActionListener{
    
    //instancia da view para aceesar os metodos
    janelaPrincipal janelaprincipal;
    
    //carrega classe que escreve em arquivos
    clnArquivos arquivos = new clnArquivos();
    
    //carrega janela de cadastro de funcionarios e preciso carregar lista
    cadastroFuncionario funcionario = new cadastroFuncionario();
    
    //criamos um construtor
    public eventoJanelaPrincipal(janelaPrincipal jaPrincipal){
       this.janelaprincipal = jaPrincipal; 
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if("cadastroFuncionarios".equals(e.getActionCommand())){
            funcionario.carregaListaFuncionarios();
            janelaprincipal.abreJanelaCadastroFuncionarios();
            try {
                arquivos.escreveLog("Janela de cadastro de funcionarios esta aberta");
            } catch (IOException ex) {
                Logger.getLogger(eventoJanelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if("cadastroPedidos".equals(e.getActionCommand())){
            janelaprincipal.abreJanelaCadastroPedidos();
            try {
                arquivos.escreveLog("Janela de cadastro de pedidos esta aberta");
            } catch (IOException ex) {
                Logger.getLogger(eventoJanelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if("sobre".equals(e.getActionCommand())){
            janelaprincipal.abreJanelaSobre();
            try {
                arquivos.escreveLog("Janela sobre software esta aberta");
            } catch (IOException ex) {
                Logger.getLogger(eventoJanelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if("cadastroEstoque".equals(e.getActionCommand())){
            janelaprincipal.abreJanelaEstoque();
            try {
                arquivos.escreveLog("Janela de cadastro de estoque esta aberta");
            } catch (IOException ex) {
                Logger.getLogger(eventoJanelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    
        
    }
    
}
