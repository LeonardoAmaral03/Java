
import fatec.poo.model.FuncionarioHorista;
import fatec.poo.model.FuncionarioMensalista;
import fatec.poo.model.FuncionarioComissionado;
import java.text.DecimalFormat;

/**
 *
 * @author dimas
 */
public class Aplic {

    public static void main(String[] args) {
        DecimalFormat Formato = new DecimalFormat("#,##0.00");
        FuncionarioHorista FuncHo = new FuncionarioHorista(1010, "Pedro Silveira", "14/05/1978", 15.80);
        FuncionarioMensalista FuncMes = new FuncionarioMensalista(2020, "Ana Beatriz", "11/11/1985", 2.5);
        FuncionarioComissionado FuncCom = new FuncionarioComissionado(3030, "Joao", "10/12/1975", 8.5);
        
        FuncHo.setCargo("Programador");
        FuncHo.apontarHoras(90);
        
        FuncMes.setCargo("Aux. Administrativo");
        FuncMes.apontarValSalMin(760);
        
        FuncCom.setCargo("Vendedor");
        FuncCom.setSalBase(980);
        FuncCom.addVendas(1000);
        FuncCom.addVendas(3000);
        FuncCom.addVendas(2000);
        
        System.out.println("Registro: " + FuncHo.getRegistro());
        System.out.println("Nome: " + FuncHo.getNome());
        System.out.println("Data admissão: " + FuncHo.getDtAdmissao());
        System.out.println("Cargo: " + FuncHo.getCargo());
        System.out.println("Salario Bruto: " + Formato.format(FuncHo.calcSalBruto()));
        System.out.println("Desconto: " + Formato.format(FuncHo.calcDesconto()));
        System.out.println("Gratificacao: " + Formato.format(FuncHo.calcGratificacao()));
        System.out.println("Salario Liquido: " + Formato.format(FuncHo.calcSalLiquido()));
       
        
        System.out.println("\n\nRegistro: " + FuncMes.getRegistro());
        System.out.println("Nome: " + FuncMes.getNome());
        System.out.println("Data admissão: " + FuncMes.getDtAdmissao());
        System.out.println("Cargo: " + FuncMes.getCargo());
        System.out.println("Salario Bruto: " + Formato.format(FuncMes.calcSalBruto()));
        System.out.println("Desconto: " + Formato.format(FuncMes.calcDesconto()));
        System.out.println("Salario Liquido: " + Formato.format(FuncMes.calcSalLiquido()));
        
        System.out.println("\n\nRegistro: " + FuncCom.getRegistro());
        System.out.println("Nome: " + FuncCom.getNome());
        System.out.println("Data admissão: " + FuncCom.getDtAdmissao());
        System.out.println("Cargo: " + FuncCom.getCargo());
        System.out.println("Salario Bruto: " + Formato.format(FuncCom.calcSalBruto()));
        System.out.println("Vendas: " + Formato.format(FuncCom.getTotalVendas()));
        System.out.println("Comissao: " + Formato.format(FuncCom.getTotalComissao()));
        System.out.println("Desconto: " + Formato.format(FuncCom.calcDesconto()));
        System.out.println("Gratificacao: " + Formato.format(FuncCom.calcGratificacao()));
        System.out.println("Salario Liquido: " + Formato.format(FuncCom.calcSalLiquido()));           
    }

}
