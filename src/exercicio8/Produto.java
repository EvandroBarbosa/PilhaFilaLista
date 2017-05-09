package exercicio8;

public class Produto {
    private int codigo;
    private String descricao;
    private float preco;
    private Produto proximo;
    
    
    public Produto(int codigo, String descricao, float preco, Produto proximo) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.preco = preco;
        this.proximo = proximo;       
    }   
    public Produto(){
    }
    
    // toString
    public String toString(){
        return String.format("codigo = %d, nome = %s e preço = R$%.2f",codigo,descricao,preco);
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public Produto getProximo() {
        return proximo;
    }

    public void setProximo(Produto proximo) {
        this.proximo = proximo;
    }    
}
