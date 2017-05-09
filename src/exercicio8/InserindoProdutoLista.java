package exercicio8;

import com.sun.xml.internal.ws.client.ContentNegotiation;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;
import javax.swing.JOptionPane;

//Ler uma varios produto e inserir em uma lista
public class InserindoProdutoLista {

    public static void main(String[] args) {
        String arquivo = "F:\\LPMP\\PilhaListaFila\\src\\exercicio8\\produto.csv";
        Lista lista = new Lista();
        lerDados(lista, arquivo);
        Produto pd = new Produto();
        Scanner ent = new Scanner(System.in);
        int cod =0;
        String ds;
        float pc;
        lista.mostraLista();
        System.out.println();
        
//##############################################################################
        //Pesquisa um produto na lista
//        System.out.println("Digite o codigo do Produto a ser Pesquisado");
//        cod = ent.nextInt();
//        pd = lista.pesquisar(cod);
//        if (pd == null) {
//            System.out.println("Produto não existe");
//        }else{
//            System.out.println("Produto encontrado:\n"+pd);
//        }
//##############################################################################
//        //Mostra os elementos contidos na lista 
//        lista.mostraLista();
//        System.out.println();
        
//##############################################################################
        //Alterar um elemento da lista apartir do codigo       
        System.out.println("Digite o codigo do Produto a ser Alterado");
        cod = ent.nextInt();
        pd = lista.pesquisar(cod);
        if (cod == 0) {
            System.out.println("Produto não existe");
        }else{
            System.out.println("Produto encontrado:\n"+pd);
        }   
        System.out.println();
        System.out.println("codigo");
        cod = ent.nextInt();
        System.out.println("Descrição");
        ds = ent.next();
        System.out.println("Preço");
        pc = ent.nextFloat();
        
        pd = new Produto(cod,ds,pc,null);
        lista.alterar(pd);
        lista.mostraLista();
    }

//##############################################################################
    //Ler os dados do produto
    public static void lerDados(Lista list, String arq) {

        try {

            FileReader fr = new FileReader(arq);
            BufferedReader br = new BufferedReader(fr);
            String linha;
            while ((linha = br.readLine()) != null) {
                String[] dados;
                dados = linha.split(";");
                Produto objetoProduto = new Produto();
                objetoProduto.setCodigo(Integer.parseInt(dados[0]));
                objetoProduto.setDescricao(dados[1]);
                objetoProduto.setPreco(Float.parseFloat(dados[2]));
                list.addOrdenado(objetoProduto);
            }

        } catch (Exception erro) {
            System.out.println("Erro ao abrir o arquivo.");
        }

    }

}
