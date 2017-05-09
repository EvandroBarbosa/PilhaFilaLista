

public class Lista {

    private Aluno primeiro;
    private Aluno ultimo;

    //cria uma lista vazia
    Lista() {
        primeiro = null;
        ultimo = null;
    }

    //verifica se a lista esta vazia
    public boolean eVazia() {
        return primeiro == null;
    }

    //insere objeto Aluno no inicio da lista
    public void addInicio(Aluno ob) {
        //é primeiro?
        ob.setProximo(null);
        if (eVazia()) {
            primeiro = ob;
            ultimo = ob;
        } else {
            ob.setProximo(primeiro);
            primeiro = ob;
        }
    }

    //Adiciona elementos no fim da lista
    public void addFim(Aluno obj) {
        obj.setProximo(null);
        if (eVazia()) {
            primeiro = obj;
            ultimo = obj;
        } else {
            ultimo.setProximo(obj);
            ultimo = obj;
        }

    }

    //Adiciona os elementos na ordem
    public void addOrdenado(Aluno obj) {
        obj.setProximo(null);
        //insere no inicio
        if (eVazia()) {
            addInicio(obj);
            return;
        }
        
        Aluno ant = null;        
        Aluno atual =  primeiro;
        while (atual != null && atual.getMat() < obj.getMat()) {            
            ant = atual;
            atual = atual.getProximo();
        }
        
        //Insere no inicio
        if (ant == null) {
            addInicio(obj);
            return;
        }
        
        //insere no final
        if (atual == null) {
            addFim(obj);
            return;
        }
        
        //insere no meio
        ant.setProximo(obj);
        obj.setProximo(atual);
        

    }

    //Remove elementos da lista
    public Aluno remove(int mat){
        
        if (eVazia()) {
            return null;
        }
        Aluno retorno = primeiro; 
        Aluno atual = null;        
        
        while(retorno != null && retorno.getMat() != mat){
            atual = retorno;
            retorno = retorno.getProximo();
        }
        
        if (retorno == null) {
            return null;
        }
        
        //Remove no inicio
        if (retorno == primeiro) {
            retorno = primeiro;
            primeiro = primeiro.getProximo();
            retorno.setProximo(null);
            if (primeiro == null) {
                ultimo = null;
            }
            return retorno;
        }
        
        atual.setProximo(retorno.getProximo());
        if (retorno == ultimo) {
            ultimo = atual;
        }
       retorno.setProximo(null);
        return retorno;
    }
    
    
    public void removeInicio() {

        if (eVazia()) {
            return;
        } else {
            Aluno aux = primeiro;
            primeiro = primeiro.getProximo();
        }
    }

    //Remove elemento no fim da lista
    public void removeFinal() {
        Aluno aux = primeiro;
        Aluno ant = primeiro;
        if (eVazia()) {
            return;
        } else {

            while (aux.getProximo() != null) {
                ant = aux;
                aux = aux.getProximo();
            }
            ant.setProximo(null);
            ultimo = ant;
        }
    }

    //Mostra o conteudo da lista
    public void mostraLista() {
        if (eVazia()) {
            System.out.println("Não existe elemento na lista");
            return;
        }
        System.out.println("Elementos da lista");
        System.out.println();
        Aluno aux = primeiro;
        while (aux != null) {
            System.out.println(aux);
            aux = aux.getProximo();
        }
    }
}
