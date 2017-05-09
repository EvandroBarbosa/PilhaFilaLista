package execicio7;

/**
 *
 * @author Evandro
 */
public class Fila {

    private Paciente inicio;
    private Paciente fim;

    public Fila() {
        inicio = null;
        fim = null;
    }

    public boolean eVazia() {
        return inicio == null;
    }

    //Enfileirar
    public void enfileirar(Paciente obp) {
        obp.setProximo(null);
        if (eVazia()) {
            inicio = obp;
            fim = obp;
        } else {
            
            fim.setProximo(obp);
            fim = obp;
        }
        
    }
    //Chamar paciente
    public void chamarPaciente(){
        
    }
    //Desifileirar
    public Paciente desifileirar() {

        if (eVazia()) {
            return null;
        }
        
        Paciente aux = inicio;
        inicio = inicio.getProximo();
        aux.setProximo(null);
        
        if (inicio == null) {
            fim = null;
        }
        return aux;
    }
    
    //Consultar um elemento na fila
    public Paciente consultaProx(){
        return inicio;
    }
    
    //Mostrar a fila
    public void mostrarFila(){
        if (eVazia()) {
            System.out.println("Não Há elementos na fila");
        }else{
            System.out.println("Elementos na Fila");
            Paciente aux = inicio;
            
            while(aux != null){
                System.out.println(aux);
                aux = aux.getProximo();
            }
        }
        
    }
}
