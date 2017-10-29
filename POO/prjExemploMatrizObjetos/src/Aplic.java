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
        Scanner entrada = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#0.00");
        double medAlt, medBase;
        
        //definição da matriz de objetos
        Retangulo[] MatRet = new Retangulo[3];
        
        //Instanciando e armazenando objetos na matriz de objetos
        for(int i=0; i < MatRet.length; i++){
            System.out.println("Digite a altura: ");
            medAlt = entrada.nextDouble();
            System.out.println("Digite a base: ");
            medBase = entrada.nextDouble();
            
            MatRet[i] = new Retangulo(medAlt, medBase);
        }
        
        //Acessando os objetos apontados
        //pela matriz de objetos
        for(int i=0; i < MatRet.length; i++){
            System.out.println("\nObjeto Retangulo " + (i + 1));
            System.out.println("Altura: " + df.format(MatRet[i].getAltura()));
            System.out.println("Base: " + df.format(MatRet[i].getBase()));
            System.out.println("Area: " + df.format(MatRet[i].CalcArea()));
            System.out.println("Perimetro: " + df.format(MatRet[i].CalcPerimetro()));
            System.out.println("Diagonal: " + df.format(MatRet[i].CalcDiagonal()) + "\n");
        }
    }
    
}
