package com.devs.devfood.classesobjetos;

import com.dev.devfood.dao.estoqueControle;

import java.util.List;
/**
 *
 * @author dimitry
 */
public class clnCadastroEstoque {
    
     estoqueControle banco = new estoqueControle();
      
    private int Cod, Quantidade, Validade;
    private String NomeP, Fornecedor, Observacoes, Categoria;
    private float Custo;
  
    
    public String getnomeP(){
        return this.NomeP;
    }
    public String getFornecedor(){
        return this.Fornecedor;
    }    
    public String getObservacoes(){
        return this.Observacoes;
    }    
    public String getCategoria(){
        return this.Categoria;
    }    
    public int getCod(){
        return this.Cod;
    }        
    public int getQuantidade(){
        return this.Quantidade;
    }  
    public int getValidade(){
        return this.Validade;
    }  
    public float getCusto(){
        return this.Custo;
    }  
    public void setNomeP(String NomeP) {
        this.NomeP = NomeP;
    }
    public void setFornecedor(String Fornecedor) {
        this.Fornecedor = Fornecedor;
    }
    public void setObservacoes(String Observacoes) {
        this.Observacoes = Observacoes;
    }
    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }
    public void setCod(int Cod) {
        this.Cod = Cod;
    }
    public void setQuantidade(int Quantidade) {
        this.Quantidade = Quantidade;
    }
    public void setValidade(int Validade) {
        this.Validade = Validade;
    }
    public void setCusto(float Custo) {
        this.Custo = Custo;
    }
    
    public void imprimirEstoque(){
        
     System.out.println("Codigo: " + getCod());   
     System.out.println("Nome Produto: " + getnomeP());   
     System.out.println("Quantidade: " + getQuantidade());  
     System.out.println("Validade: " + getValidade());   
     System.out.println("Fornecedor: " + getFornecedor());   
     System.out.println("Categoria: " + getCategoria());   
     System.out.println("Custo: " + getCusto());   
     System.out.println("Observações: " + getObservacoes());   
    }
    public void salvarCadastro(){
        
        banco.insert(this);//verificar se funciona
        
    }
    
    public void deletarCadastro(){
        banco.delete(this);//verificar se funciona
    }
    
    public List<clnCadastroEstoque> consultaLista(){
        
        List<clnCadastroEstoque> lista = banco.selecionarLista();
        
        return lista;
    }
    
    public void consultaDetalhado(int cod){
        
     //   List<clnCadastroEstoque> lista = banco.selecionaDetalhado(cod);
        
      //  for (clnCadastroEstoque c : lista) {
            
        //    setNomeP(lista.get(0).toString());
            
       // }
        
        
    }
   
}
