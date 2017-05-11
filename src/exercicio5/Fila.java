package exercicio5;

/**
 *
 * @author Evandro
 */
public class Fila {
    
    private Pessoa fim;

    public Fila() {
        
        fim = null;
    }

    public boolean eVazia() {
        return fim == null;
    }

    //Enfileirar
    public void enfileirar(Pessoa obp) {
        obp.setProximo(null);
        if (eVazia()) {            
            fim = obp;
            fim.setProximo(obp);
        } else {
            obp.setProximo(fim.getProximo());
            fim.setProximo(obp);
            fim = obp;
        }
    }

    //Desifileirar
    public Pessoa desifileirar() {

        if (eVazia()) {
            return null;
        }
        
        Pessoa aux = fim.getProximo();
        fim = aux.getProximo();
        aux.setProximo(null);
        
        if (fim == null) {
            return null;
        }
        return aux;
    }
    
    //Consultar um elemento na fila
    public Pessoa consultaProx(){
        return fim;
    }
    
    //Mostrar a fila
    public void mostrarFila(){
        if (eVazia()) {
            System.out.println("Não Há elementos na fila");
        }else{
            System.out.println("Elementos na Fila");
            Pessoa aux = fim.getProximo();
                           
            while(aux != fim ){
                System.out.println(aux);
                aux = aux.getProximo();
            }
            System.out.println(fim);
        }
        
    }
}
