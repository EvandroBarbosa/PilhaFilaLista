
import java.util.Scanner;

public class TesteLista {
    public static void main(String[] args) {
        //cria uma lista vazia
        Scanner entrada = new Scanner(System.in);
        Aluno a;
        int m = 0;
        String n;
        float me;
        Lista lista = new Lista();
        for (int i = 0; i < 6; i++) {
            System.out.println("Nome: ");
            n = entrada.next();
            System.out.println("Matricula: ");
            m = entrada.nextInt();
            System.out.println("Nota: ");
            me = entrada.nextFloat();
            a = new Aluno(n, m, me, null);
            lista.addOrdenado(a);
        }
        lista.mostraLista();
        System.out.println("Digite a matricula a ser removida");
        int mat = entrada.nextInt();
        a = lista.remove(mat);
        if(a == null){
            System.out.println("Aluno com matricula "+mat+" não existe na lista");
        }
        else{
            System.out.println("Dados do aluno removdo:" + a);
        }
        lista.mostraLista();
    }
}
