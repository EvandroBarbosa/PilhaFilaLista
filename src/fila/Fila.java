package fila;

/**
 *
 * @author Evandro
 */
public class Fila {

    private Produto inicio;
    private Produto fim;

    public Fila() {
        inicio = null;
        fim = null;
    }

    public boolean eVazia() {
        return inicio == null;
    }

    //Enfileirar
    public void enfileirar(Produto obp) {
        obp.setProximo(null);
        if (eVazia()) {
            inicio = obp;
            fim = obp;
        } else {
            fim.setProximo(obp);
            fim = obp;
        }
    }

    //Desifileirar
    public Produto desifileirar() {

        if (eVazia()) {
            return null;
        }
        
        Produto aux = inicio;
        inicio = inicio.getProximo();
        aux.setProximo(null);
        
        if (inicio == null) {
            fim = null;
        }
        return aux;
    }
    
    //Consultar um elemento na fila
    public Produto consultaProx(){
        return inicio;
    }
    
    //Mostrar a fila
    public void mostrarFila(){
        if (eVazia()) {
            System.out.println("Não Há elementos na fila");
        }else{
            System.out.println("Elementos na Fila");
            Produto aux = inicio;
            
            while(aux != null){
                System.out.println(aux);
                aux = aux.getProximo();
            }
        }
        
    }
}
