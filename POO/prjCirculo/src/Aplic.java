import fatec.poo.model.Circulo;
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
        double medRaio;
        
        DecimalFormat Formato = new DecimalFormat("#0.00");
        Scanner Entrada = new Scanner(System.in);
        
        Circulo objCir;
        objCir = new Circulo();
        //Circulo objCir = new Circulo();
        
        System.out.println("Digite a medida do raio: ");
        medRaio = Entrada.nextDouble();
        
        objCir.setRaio(medRaio);
        
        System.out.println("Area: " + Formato.format(objCir.CalcArea()));
        System.out.println("Perimetro: " + Formato.format(objCir.CalcPerimetro()));
        System.out.println("Diametro: " + Formato.format(objCir.CalcDiametro()));
    }
    
}
