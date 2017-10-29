import fatec.poo.model.Pessoa;
import fatec.poo.model.PessoaFisica;
import fatec.poo.model.PessoaJuridica;
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
        
        int opcao, opcao2, controle = 0, anoInscricao, anoAtual = 2017;
        String nome, cgc, cpf;
        double valCompra, base, txIncentivo;
        
        Pessoa[] CadPes = new Pessoa[3];
        
        System.out.println("1 - Cadastrar Pessoa Física");
        System.out.println("2 - Cadastrar Pessoa Jurídica");
        System.out.println("3 - Listar");
        System.out.println("4 - Sair");
        System.out.println("\nDigite a opção: ");
        
        opcao = entrada.nextInt();
        
        while(opcao != 4){
            if(opcao == 1){
                System.out.println("\n\nCadastro de Pessoa Física\n");
                System.out.println("Digite o  nome: ");
                nome = entrada.next();
                System.out.println("Digite o CPF: ");
                cpf = entrada.next();
                System.out.println("Digite o ano de inscrição: ");
                anoInscricao = entrada.nextInt();
                
                CadPes[controle] = new PessoaFisica(cpf, nome, anoInscricao);
                
                System.out.println("Digite o valor base: ");
                base = entrada.nextDouble();
                ((PessoaFisica)CadPes[controle]).setBase(base);
                System.out.println("Deseja inserir valores de compra? 1 - SIM 2 - NÃO");
                opcao2 = entrada.nextInt();
                while(opcao2 == 1){
                    System.out.println("Digite o valor da compra: ");
                    valCompra = entrada.nextDouble();
                    ((PessoaFisica)CadPes[controle]).addCompras(valCompra);
                    
                    System.out.println("Deseja inserir mais valores de compra? 1 - SIM 2 - NÃO");
                    opcao2 = entrada.nextInt();
                }
            } else{
                if(opcao == 2){
                    System.out.println("\n\nCadastro de Pessoa Jurídica\n");
                    System.out.println("Digite o  nome: ");
                    nome = entrada.next();
                    System.out.println("Digite o CGC: ");
                    cgc = entrada.next();
                    System.out.println("Digite o ano de inscrição: ");
                    anoInscricao = entrada.nextInt();
                    
                    CadPes[controle] = new PessoaJuridica(cgc, nome, anoInscricao);
                    
                    System.out.println("Digite a taxa incentivo: ");
                    txIncentivo = entrada.nextDouble();
                    ((PessoaJuridica)CadPes[controle]).setTaxaIncentivo(txIncentivo);
                    System.out.println("Deseja inserir valores de compra? 1 - SIM 2 - NÃO");
                    opcao2 = entrada.nextInt();
                    while(opcao2 == 1){
                        System.out.println("Digite o valor da compra: ");
                        valCompra = entrada.nextDouble();
                        ((PessoaJuridica)CadPes[controle]).addCompras(valCompra);

                        System.out.println("Deseja inserir mais valores de compra? 1 - SIM 2 - NÃO");
                        opcao2 = entrada.nextInt();
                    }
                } else{
                    if(opcao == 3){
                        if(controle > 0){
                            System.out.println("\n\nListar Cadastrados:\n");
                            System.out.println("Tipo     CPF/CGC     Nome        Ano Inscrição   Bonus");

                            for(int i = 0; i < controle; i++){
                                if(CadPes[i] instanceof PessoaFisica){
                                    System.out.println("Física   " + ((PessoaFisica)CadPes[i]).getCpf() + "      " + CadPes[i].getNome() + "       " + CadPes[i].getAnoInscricao() + "         " + df.format(((PessoaFisica)CadPes[i]).calcBonus(anoAtual)));
                                } else{
                                    System.out.println("Jurídica  " + ((PessoaJuridica)CadPes[i]).getCgc()+ "     " + CadPes[i].getNome() + "      " + CadPes[i].getAnoInscricao() + "          " + df.format(((PessoaJuridica)CadPes[i]).calcBonus(anoAtual)));
                                }
                            }
                        } else{
                            System.out.println("\nNenhum dado inserido!\n");
                        }
                    } else{
                        break;
                    }
                }
            }
            
            if(opcao != 3){
                controle++;
            }
            
            if(controle < 3){
                System.out.println("\n\n1 - Cadastrar Pessoa Física");
                System.out.println("2 - Cadastrar Pessoa Jurídica");
                System.out.println("3 - Listar");
                System.out.println("4 - Sair");
                System.out.println("\nDigite a opção: ");

                opcao = entrada.nextInt();
            } else{
                System.out.println("\nA matriz atingiu seu limite!\n");
                
                do{
                    System.out.println("\n3 - Listar");
                    System.out.println("4 - Sair");
                    System.out.println("\nDigite a opção: ");

                    opcao = entrada.nextInt();
                }while(opcao > 4 || opcao < 3);
            }
        }
    }
}