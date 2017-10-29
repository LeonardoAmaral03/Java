import fatec.poo.model.Retangulo;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author 0030481521022
 */
public class Aplic2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        DecimalFormat Formato = new DecimalFormat("#0.00");
        double medAlt, medBase;
        
        System.out.println("Digite a altura: ");
        medAlt = entrada.nextDouble();
        System.out.println("Digite a base: ");
        medBase = entrada.nextDouble();
        
        Retangulo objRet = new Retangulo(medAlt, medBase);
        
        System.out.println("Altura...: " + Formato.format(objRet.getAltura()));
        System.out.println("Base.....: " + Formato.format(objRet.getBase()));
        System.out.println("Area.....: " + Formato.format(objRet.CalcArea()));
        System.out.println("Perimetro: " + Formato.format(objRet.CalcPerimetro()));
        System.out.println("Diagonal.: " + Formato.format(objRet.CalcDiagonal()));
    }
    
}
