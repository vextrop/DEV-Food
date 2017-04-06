/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventosBotoes;

import interfaceSwing.cadastroPedido;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/**
 *
 * @author victor
 */
public class eventoCadastroPedido implements ActionListener{
    
    cadastroPedido cadastropedido;

    public eventoCadastroPedido(cadastroPedido cadastroPed) {
    
        this.cadastropedido = cadastroPed;
    
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    if("adicionarPedido".equals(e.getActionCommand())){
            cadastropedido.addPedido();
        }
    if("removerPedido".equals(e.getActionCommand())){
            cadastropedido.removePedido();
        }
        
    
    }
    
}
