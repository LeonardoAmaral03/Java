import fatec.poo.model.Retangulo;
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
        double medAlt, medBase;
        
        DecimalFormat Formato = new DecimalFormat("#0.00");
        Scanner Entrada = new Scanner(System.in);
        
        //Definição de um ponteiro
        //para um objeto da
        //classe Retangulo
        Retangulo objRet;
        
        
        //Instanciação de um
        //objeto da classe Retangulo
        objRet = new Retangulo();
        
        //Entrada de Dados
        System.out.println("Digite a medida da altura: ");
        medAlt = Entrada.nextDouble();
        System.out.println("Digite a medida da base: ");
        medBase = Entrada.nextDouble();
        
        
        //Passagem de mensagens
        //para o objeto Retangulo instanciado
        objRet.setAltura(medAlt);
        objRet.setBase(medBase);
        
        System.out.println("Area: " + Formato.format(objRet.CalcArea()));
        System.out.println("Perimetro: " + Formato.format(objRet.CalcPerimetro()));
        System.out.println("Diagonal: " + Formato.format(objRet.CalcDiagonal()));
    }
    
}
