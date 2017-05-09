package exercicio8;





public class Lista {

    private Produto primeiro;
    private Produto ultimo;

    //cria uma lista vazia
    Lista() {
        primeiro = null;
        ultimo = null;
    }

    //verifica se a lista esta vazia
    public boolean eVazia() {
        return primeiro == null;
    }

    //insere objeto Produto no inicio da lista
    public void addInicio(Produto ob) {
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
    public void addFim(Produto obj) {
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
    public void addOrdenado(Produto obj) {
        obj.setProximo(null);
        //insere no inicio
        if (eVazia()) {
            addInicio(obj);
            return;
        }
        
        Produto ant = null;        
        Produto atual =  primeiro;
        while (atual != null && atual.getCodigo()< obj.getCodigo()) {            
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

    //Pesquisa um elemento na lista
    public Produto pesquisar(int codigo){
        if (eVazia()) {
            return null;
        }
        
        Produto retorno = primeiro;
        
        while(retorno != null && retorno.getCodigo()!= codigo){
            retorno = retorno.getProximo();
        }
        Produto aux = new Produto();
        if (retorno == null) {
            return null;
        }
        aux.setCodigo(retorno.getCodigo());
        aux.setDescricao(retorno.getDescricao());
        aux.setPreco(retorno.getPreco());
        aux.setProximo(null);
        
        return aux;
        
    }
    
    //Alterar um elemento da lista
    public void alterar(Produto codigo){
        codigo.setProximo(null);
        
        if (eVazia()) {
            return;
        }
        
        Produto aux = primeiro;
        while(aux != null && aux.getCodigo() != codigo.getCodigo()){
            aux = aux.getProximo();
        }
        
        aux.setCodigo(codigo.getCodigo());
        aux.setDescricao(codigo.getDescricao());
        aux.setPreco(codigo.getPreco());
        
    }

    //Remove elementos da lista
    public Produto remove(int codigo){
        
        if (eVazia()) {
            return null;
        }
        Produto retorno = primeiro; 
        Produto atual = null;        
        
        while(retorno != null && retorno.getCodigo() != codigo){
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
            Produto aux = primeiro;
            primeiro = primeiro.getProximo();
        }
    }

    //Remove elemento no fim da lista
    public void removeFinal() {
        Produto aux = primeiro;
        Produto ant = primeiro;
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
        Produto aux = primeiro;
        while (aux != null) {
            System.out.println(aux);
            aux = aux.getProximo();
        }
    }
}
