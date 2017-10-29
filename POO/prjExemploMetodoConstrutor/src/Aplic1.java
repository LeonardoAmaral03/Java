import fatec.poo.model.Retangulo;
import java.text.DecimalFormat;

/**
 *
 * @author 0030481521022
 */
public class Aplic1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DecimalFormat Formato = new DecimalFormat("#0.00");
        //instanciação do objeto
        //da classe Retangulo
        Retangulo objRet = new Retangulo(3.0, 4.0);
        
        System.out.println("Altura...: " + Formato.format(objRet.getAltura()));
        System.out.println("Base.....: " + Formato.format(objRet.getBase()));
        System.out.println("Area.....: " + Formato.format(objRet.CalcArea()));
        System.out.println("Perimetro: " + Formato.format(objRet.CalcPerimetro()));
        System.out.println("Diagonal.: " + Formato.format(objRet.CalcDiagonal()));
    }
    
}
