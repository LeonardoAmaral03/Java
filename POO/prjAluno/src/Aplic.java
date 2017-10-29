import fatec.poo.model.Aluno;
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
        Scanner entrada = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#0.00");
        
        int numRa, qtdApr = 0, qtdRepr = 0;
        String strNome, situacao;
        double valNota1, valNota2;
        
        Aluno[] MatAluno = new Aluno[10];
        
        for(int i=0; i < MatAluno.length; i++) {
            System.out.println("Digite o RA do aluno: ");
            numRa = entrada.nextInt();
            System.out.println("Digite o nome do aluno: ");
            strNome = entrada.next();
            System.out.println("Digite a 1a nota do aluno: ");
            valNota1 = entrada.nextDouble();
            System.out.println("Digite a 2a nota do aluno: ");
            valNota2 = entrada.nextDouble();
            
            MatAluno[i] = new Aluno(numRa, strNome);
            MatAluno[i].setNota1(valNota1);
            MatAluno[i].setNota2(valNota2);
        }
        System.out.println("Ra      Nome        Media       Situacao");
        for (int i=0; i < MatAluno.length; i++) {
            if(MatAluno[i].isAprovado()) {
                situacao = "Aprovado";
                qtdApr++;
            } else {
                situacao = "Reprovado";
                qtdRepr++;
            }
            System.out.println(MatAluno[i].getRa() + "  " + MatAluno[i].getNome() + "       " + 
                    df.format(MatAluno[i].CalcMedia()) + "      " + situacao);
        }
        System.out.println("\nQuantidade de aprovados: " + qtdApr);
        System.out.println("Quantidade de reprovados: " + qtdRepr);
    }
}
