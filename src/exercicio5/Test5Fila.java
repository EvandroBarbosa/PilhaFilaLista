package exercicio5;

import java.util.Scanner;

/**
 *
 * @author Evandro
 */
public class Test5Fila {
    public static void main(String[] args) {
        Fila fila = new Fila();
        Pessoa ps;
        Scanner ent = new Scanner(System.in);
        
        String n, cpf, tl;
        
        for (int i = 0; i < 2; i++) {            
            System.out.println("Digite o nome da Pessoa");
            n = ent.next();
            System.out.println("Informe o CPF");
            cpf = ent.next();
            System.out.println("Informe o telefone");
            tl = ent.next();
            
            ps = new Pessoa(n,cpf,tl,null);
            
            fila.enfileirar(ps);
        }
        fila.mostrarFila();
    }
}
