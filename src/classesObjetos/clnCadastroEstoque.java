package classesObjetos;

/**
 *
 * @author dimitry
 */
public class clnCadastroEstoque {
    
    int Cod, Quantidade, Validade;
    String NomeP, Fornecedor, Observacoes, Categoria;
    float Custo;
    
    
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
    public void setNomeP(String nomeP) {
        this.NomeP = NomeP;
    }
    public void setFornecedor(String Fornecedor) {
        this.Fornecedor = Fornecedor;
    }
    public void setObservacoes(String Observacoes) {
        this.Observacoes = Observacoes;
    }
    public void setCategoria(String Categoria) {
        this.Observacoes = Observacoes;
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
    
    
    
    
    
}
