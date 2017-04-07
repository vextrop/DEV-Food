
package eventosBotoes;

import interfaceSwing.janelaPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import interfaceSwing.janelaPrincipal;

public class eventoJanelaPrincipal implements ActionListener{
    
    //instancia da view para aceesar os metodos
    janelaPrincipal janelaprincipal;
    
    //criamos um construtor
    public eventoJanelaPrincipal(janelaPrincipal jaPrincipal){
       this.janelaprincipal = jaPrincipal; 
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if("cadastroFuncionarios".equals(e.getActionCommand())){
            janelaprincipal.abreJanelaCadastroFuncionarios();
        }
        if("cadastroPedidos".equals(e.getActionCommand())){
            janelaprincipal.abreJanelaCadastroPedidos();
        }
        if("sobre".equals(e.getActionCommand())){
            janelaprincipal.abreJanelaSobre();
        }
        if("cadastroEstoque".equals(e.getActionCommand())){
            janelaprincipal.abreJanelaEstoque();
        }
    
        
    }
    
}
