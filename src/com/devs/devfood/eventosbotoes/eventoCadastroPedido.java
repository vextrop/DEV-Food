/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.devs.devfood.eventosbotoes;

import com.dev.devfoods.interfaceswing.cadastroPedido;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


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
        try {
            cadastropedido.addPedido();
        } catch (IOException ex) {
            Logger.getLogger(eventoCadastroPedido.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    if("removerPedido".equals(e.getActionCommand())){
        try {
            cadastropedido.removePedido();
        } catch (IOException ex) {
            Logger.getLogger(eventoCadastroPedido.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        
    
    }
    
}
