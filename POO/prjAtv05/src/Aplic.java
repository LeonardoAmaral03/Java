
import fatec.poo.model.Cliente;
import fatec.poo.model.Lancamento;
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
        Scanner entrada = new Scanner(System.in);
        Cliente[] clientes = new Cliente[5];
        int opcao, identificacao, codigo, contCli = 0, j;
        String cpf, tipo;
        double saldo, valor;
        
        System.out.println("1 - Cadastrar Cliente");
        System.out.println("2 - Apontar Lançamentos do Cliente");
        System.out.println("3 - Exibir Lançamentos do Cliente");
        System.out.println("4 - Sair");
        
        opcao = entrada.nextInt();
        
        while (opcao != 4) {
            j = 0;
            if (opcao == 1) {
                if (contCli > 4) {
                    System.out.println("Limite de clientes alcançado!");
                } else {
                    System.out.println("Digite a Identificação: ");
                    identificacao = entrada.nextInt();
                    System.out.println("Digite o CPF: ");
                    cpf = entrada.next();
                    System.out.println("Digite o Saldo: ");
                    saldo = entrada.nextDouble();

                    clientes[contCli] = new Cliente(identificacao, cpf, saldo);
                    contCli++;
                }
            } else {
                if (opcao == 2) {
                    System.out.println("Digite a Identificação do Cliente: ");
                    identificacao = entrada.nextInt();
                    
                    if (identificacao == 0) {
                        break;
                    }
                    for (int i = 0; i < contCli; i++) {
                        if (clientes[i].getIdentificacao() == identificacao) {
                            System.out.println("Digite o Código do Lançamento: ");
                            codigo = entrada.nextInt();
                            System.out.println("Digite o Tipo de Lançamento: C - Crédito   D - Débito");
                            tipo = entrada.next();
                            System.out.println("Digite o Valor do lançamento: ");
                            valor = entrada.nextDouble();
                            
                            Lancamento lancli = new Lancamento(codigo, tipo, valor);
                            
                            lancli.setCliente(clientes[i]);
                            clientes[i].addLancamento(lancli);
                            
                            j = 1;
                            break;
                        }
                    }
                    if (j == 0) {
                        System.out.println("Cliente não Cadastrado!");
                    }
                } else {
                    if (opcao == 3) {
                        System.out.println("Digite a Identificação do Cliente: ");
                        identificacao = entrada.nextInt();

                        if (identificacao == 0) {
                            break;
                        }
                        for (int i = 0; i < contCli; i++) {
                            if (clientes[i].getIdentificacao() == identificacao) {
                                clientes[i].exibirLancamentos();
                                break;
                            }
                        }
                    } else {
                        if (opcao == 4) {
                            break;
                        }
                    }
                }
            }
            
            System.out.println("\n\n1 - Cadastrar Cliente");
            System.out.println("2 - Apontar Lançamentos do Cliente");
            System.out.println("3 - Exibir Lançamentos do Cliente");
            System.out.println("4 - Sair");

            opcao = entrada.nextInt();
        }
    }
}
