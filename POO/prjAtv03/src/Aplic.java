
import fatec.poo.model.ContaCorrente;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author 0030481521022
 */
public class Aplic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#,##0.00");
        Scanner entrada = new Scanner(System.in);

        int numero, qtdElem = 3, opcao, controle = 0, num;
        double saldo, saque, deposito;
        boolean existe = false;

        ContaCorrente[] CadCon = new ContaCorrente[qtdElem];

        for (int i = 0; i < qtdElem; i++) {
            System.out.println("\n\nCadastrar conta");
            System.out.println("\nDigite o numero da conta: ");
            numero = entrada.nextInt();

            System.out.println("\nDigite o saldo da conta: ");
            saldo = entrada.nextDouble();

            CadCon[i] = new ContaCorrente(numero, saldo);
        }

        System.out.println("\n1 - Sacar");
        System.out.println("2 - Depositar");
        System.out.println("3 - Consultar Saldo");
        System.out.println("4 - Listar Contas");
        System.out.println("5 - Sair");
        System.out.println("\nDigite a opção: ");

        opcao = entrada.nextInt();

        while (opcao != 5) {
            if(opcao != 4){
                System.out.println("Insira o numero da conta: ");
                num = entrada.nextInt();
            

                for (int i = 0; i < qtdElem; i++) {
                    if (num == CadCon[i].getNumero()) {
                        controle = i;
                        existe = true;
                        break;
                    } else {
                        existe = false;
                    }
                }
            }
            
            if (existe) {
                if (opcao == 1) {
                    System.out.println("Insira quantidade de saque: ");
                    saque = entrada.nextDouble();

                    if (saque > CadCon[controle].getSaldo()) {
                        System.out.println("Quantia de saque superior ao saldo!");
                    } else {
                        CadCon[controle].sacar(saque);
                        System.out.println("\nSaque concluído!");
                    }
                } else {
                    if (opcao == 2) {
                        System.out.println("Insira a quantidade de depósito: ");
                        deposito = entrada.nextDouble();
                        CadCon[controle].depositar(deposito);
                        System.out.println("\nDepósito concluído!");
                    } else {
                        if (opcao == 3) {
                            System.out.println("Saldo: " + CadCon[controle].getSaldo());
                        } else {
                            if (opcao == 4) {
                                System.out.println("Contas:\n");
                                System.out.println("Número da Conta         Saldo");
                                for (int i = 0; i < qtdElem; i++) {
                                    System.out.println(CadCon[i].getNumero() + "                " + df.format(CadCon[i].getSaldo()));
                                }
                            } else {
                                break;
                            }
                        }
                    }
                }
            } else{
                System.out.println("Numero da conta não encontrado");
            }
            
            System.out.println("\n1 - Sacar");
            System.out.println("2 - Depositar");
            System.out.println("3 - Consultar Saldo");
            System.out.println("4 - Listar Contas");
            System.out.println("5 - Sair");
            System.out.println("\nDigite a opção: ");

            opcao = entrada.nextInt();
        }
    }

}
