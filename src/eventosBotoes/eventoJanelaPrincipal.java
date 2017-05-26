
package eventosBotoes;

import classesObjetos.clnArquivos;
import interfaceSwing.janelaPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import interfaceSwing.janelaPrincipal;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class eventoJanelaPrincipal implements ActionListener{
    
    //instancia da view para aceesar os metodos
    janelaPrincipal janelaprincipal;
    
    //carrega classe que escreve em arquivos
    clnArquivos arquivos = new clnArquivos();
    
    //criamos um construtor
    public eventoJanelaPrincipal(janelaPrincipal jaPrincipal){
       this.janelaprincipal = jaPrincipal; 
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if("cadastroFuncionarios".equals(e.getActionCommand())){
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
