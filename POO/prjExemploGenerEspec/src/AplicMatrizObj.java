import fatec.poo.model.Funcionario;
import fatec.poo.model.FuncionarioHorista;
import fatec.poo.model.FuncionarioMensalista;
import java.text.DecimalFormat;
/**
 *
 * @author dimas
 */
public class AplicMatrizObj {
    public static void main(String[] args) {
         DecimalFormat df = new DecimalFormat("#,##0.00");
        //definição da matriz de objetos
        //a partir da superclasse Funcionario
        Funcionario[] CadFun = new Funcionario[3];
        
        CadFun[0] = new FuncionarioHorista(1010,
                                           "Pedro Silveira",
                                           "14/05/1978",
                                           15.80);
        
        CadFun[1] = new FuncionarioMensalista(2020,
                                              "Ana Beatriz",
                                              "17/05/1987",
                                              2.5);
        
        CadFun[0].setCargo("Programador");
        CadFun[1].setCargo("Auxiliar Administrativo");
        
        ((FuncionarioHorista)CadFun[0]).apontarHoras(30);
        ((FuncionarioMensalista)CadFun[1]).apontarValSalMin(680);
        
        for (int i=0; i < 2; i++){
            if (CadFun[i] instanceof FuncionarioHorista){
                System.out.println("\n\nFuncionario Horista");                
            }else{
                System.out.println("\n\nFuncionario Mensalista");
            }
            System.out.println("Registro         =>  " + CadFun[i].getRegistro());
            System.out.println("Nome             =>  " + CadFun[i].getNome());
            System.out.println("Cargo            =>  " + CadFun[i].getCargo());
            System.out.println("Data de Admissão =>  " + CadFun[i].getDtAdmissao());
            if (CadFun[i] instanceof FuncionarioHorista){                
                System.out.println("Salario Bruto    =>  " + 
                                   df.format(((FuncionarioHorista)CadFun[i]).calcSalBruto()));            
            }else{
                System.out.println("Salario Bruto    =>  " + 
                                   df.format(((FuncionarioMensalista)CadFun[i]).calcSalBruto())); 
            }
            if (CadFun[i] instanceof FuncionarioHorista){
                System.out.println("Gratificação     =>  " + 
                                   df.format(((FuncionarioHorista)CadFun[i]).calcGratificacao()));
            }
            System.out.println("Desconto         =>  " + 
                                   df.format(CadFun[i].calcDesconto()));
            
            if (CadFun[i] instanceof FuncionarioHorista){
                System.out.println("Salario Liquido  =>  " + 
                        df.format(((FuncionarioHorista)CadFun[i]).calcSalLiquido())); 
            }else{
                System.out.println("Salario Liquido  =>  " + 
                        df.format(CadFun[i].calcSalLiquido())); 
            }
        }
    }  
    
}
