
package fila;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 *
 * @author Evandro
 */
public class TesteFila {
    public static void main(String[] args) {
        String arquivo = "E:\\LPMP\\PilhaListaFila\\src\\exercicio8\\produto.csv";
        Fila fila = new Fila();
        lerDados(fila, arquivo);
        Produto pd = new Produto();
        fila.mostrarFila();
        
        System.out.println("Proximo da fila:\n"+fila.consultaProx());
    }
    
    
    //##############################################################################
    //Ler os dados do produto
    public static void lerDados(Fila fila, String arq) {

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
                fila.enfileirar(objetoProduto);
            }

        } catch (Exception erro) {
            System.out.println("Erro ao abrir o arquivo.");
        }

    }
}
