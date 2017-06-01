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
    
    private String Lanche, Quant1, Bebida, Quant2, Mesa;
    
    
    
    public String getLanche(){
        
        return this.Lanche;
    }
    
    public String getQuant1(){
        
        return this.Quant1;
    }
    
    public String getBebida(){
        
        return this.Bebida;
    }
    
    public String getQuant2(){
        
        return this.Quant2;
    }
    
    public String getMesa(){
        
        return this.Mesa;
    }
    
    public void setLanche(String Lanche){
        
        this.Lanche = Lanche;
    }
    
        public void setQuant1(String Quant1){
        
        this.Quant1 = Quant1;
    }
        
        public void setBebida(String Bebida){
        
        this.Bebida = Bebida;
    }    
 
        
        public void setQuant2(String Quant2){
        
        this.Quant2 = Quant2;
    }
        
        public void setMesa(String Mesa){
        
        this.Mesa = Mesa;
    }
    
    public void imprimirPedido(){
        
        System.out.println("Lanche:" + getLanche());
        System.out.println("Quantidade:" + getQuant1());
        System.out.println("Bebida:" + getBebida());
        System.out.println("Quantidade:" + getQuant2());
        System.out.println("Mesa:" + getMesa());
        
    }
    
}
