package exercicio5;

/**
 *
 * @author Evandro
 */
public class Pessoa {
    private String nome;
    private String cpf;
    private String telefone;
    private Pessoa proximo;



    public Pessoa(String nome, String cpf, String telefone, Pessoa proximo) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.proximo = proximo;
    }
    public Pessoa() {
    }

    public String toString(){
        return String.format("Nome %s, cpf %s, telefone %s",nome,cpf,telefone);
        
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public Pessoa getProximo() {
        return proximo;
    }

    public void setProximo(Pessoa proximo) {
        this.proximo = proximo;
    }
       
}
