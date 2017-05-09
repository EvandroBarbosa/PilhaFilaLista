package execicio7;

import exercicio5.*;

/**
 *
 * @author Evandro
 */
public class Paciente {
    private String nome;
    private String cpf;
    private String telefone;
    private String email;

    private Paciente proximo;


    public Paciente() {
    }

    public Paciente(String nome, String cpf, String telefone, String email, Paciente prox) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.email = email;
        this.proximo=  prox;
    }

    public String toString(){
        return String.format("Nome %s, CPF %s, telefone %s, E-mail %s",nome,cpf,telefone,email);
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
    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public Paciente getProximo() {
        return proximo;
    }

    public void setProximo(Paciente proximo) {
        this.proximo = proximo;
    }
       
}
