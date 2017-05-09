package execicio7;

import java.util.Scanner;

/**
 *
 * @author Evandro
 */
public class Teste7Fila {

    public static void main(String[] args) {
        Fila fila = new Fila();
        Paciente pc;
        Scanner ent = new Scanner(System.in);

        String n, cpf, tl, em;
        int op = 0;
        int cont=0;

        do {

            System.out.println("Escolha uma Opção \n"
                    + "1: Inserir Paciente na Fila\n"
                    + "2: Chamar Paciente\n"
                    + "3: Verificar Proximo da Fila\n"
                    + "4: Verificar quantidade de pacientes na fila \n"
                    + "5: Mostrar lista\n"
                    + "6: Sair(-1)");
            op = ent.nextInt();
            switch (op) {
                case 1:
                    System.out.println("Digite o nome do paciente:");
                    n = ent.next();
                    System.out.println("Digite o cpf do Paciente");
                    cpf = ent.next();
                    System.out.println("Digite o Telefone do Paciente");
                    tl = ent.next();
                    System.out.println("Digite o E-mail do Paciente");
                    em = ent.next();
                    pc = new Paciente(n, cpf, tl, em, null);
                    fila.enfileirar(pc);
                    cont++;
                    System.out.println();
                    break;
                case 2:
                    pc = fila.desifileirar();
                    if (pc == null) {
                        System.out.println("Não há mais Paciente");
                    }else{
                        System.out.println("O Paciente foi Chamado\n"+pc);                        
                        cont--;
                    }
                    System.out.println();
                    break;
                case 3:
                    pc = fila.consultaProx();
                    if (pc == null) {
                        System.out.println("Não há proximo Fila vaiza");
                    }else{
                        System.out.println("O Proximo paciente:\n"+pc);                        
                    }
                    System.out.println();
                    break;
                case 4:                    
                    System.out.println("Existem "+cont+" Pacientes na fila");
                    System.out.println();
                    break;
                case 5:
                    fila.mostrarFila();
                    break;
            }
        } while (op != -1);
        System.exit(0);

    }
}
