/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classesObjetos;

/**
 *
 * @author victor
 */
public class clnCadastroPedido {
    
    String Lanche;
    
    
    
    public String getLanche(){
        
        return this.Lanche;
    }
    
    
    public void setLanche(String Lanche){
        
        this.Lanche = Lanche;
    }
    
    
    public void imprimirPedido(){
        
        System.out.println("nLanche:" + getLanche());
        
    }
    
}
