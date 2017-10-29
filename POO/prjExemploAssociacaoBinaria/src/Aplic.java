
import fatec.poo.model.Departamento;
import fatec.poo.model.FuncionarioComissionado;
import fatec.poo.model.FuncionarioHorista;
import fatec.poo.model.FuncionarioMensalista;
import fatec.poo.model.Projeto;
import java.text.DecimalFormat;

/**
 *
 * @author Leonardo
 */
public class Aplic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#,##0.00");
        FuncionarioHorista funchor = new FuncionarioHorista(1010, "Pedro Silveira", "14/05/1978", 15.80);
        FuncionarioMensalista funcmen = new FuncionarioMensalista(2020, "Leonardo Amaral", "20/06/2015", 2.50);
        FuncionarioComissionado funccom = new FuncionarioComissionado(3030, "Serjão Berranteiro", "21/03/2017", 0.10);
        
        funchor.apontarHoras(90);
        funchor.setCargo("Gerente");
        funcmen.apontarValSalMin(680);
        funcmen.setCargo("Coordenador");
        funccom.setSalBase(1000.00);
        funccom.setCargo("Assistente administrativo");
        funccom.addVendas(3000.00);
        funccom.addVendas(2000.00);
        funccom.addVendas(5000.00);
        
        Departamento dep1 = new Departamento("RH", "Recursos Humanos");
        Departamento dep2 = new Departamento("VD", "Vendas");
        
        Projeto proj1 = new Projeto("DSA", "Drone de Segurança Automático");
        Projeto proj2 = new Projeto("FM", "Foguete de Marte");
        proj1.setDataInicio("18/04/2017");
        proj1.setDataTermino("18/04/2018");
        proj2.setDataInicio("10/10/2017");
        proj2.setDataTermino("10/10/2018");
        
        //Estabelecer a associação binária
        //entre um (1) objeto da classe Funcionario
        //com um (1) objeto da classe Departamento
        funchor.setDepartamento(dep1);
        funcmen.setDepartamento(dep1);
        funccom.setDepartamento(dep2);
        
        funchor.setProjeto(proj1);
        funcmen.setProjeto(proj2);
        funccom.setProjeto(proj2);
        
        System.out.println("O funcionario " + funchor.getNome() + " trabalha no departamento " + funchor.getDepartamento().getNome());
        System.out.println("O funcionario " + funcmen.getNome() + " trabalha no departamento " + funcmen.getDepartamento().getNome());
        System.out.println("O funcionario " + funccom.getNome() + " trabalha no departamento " + funccom.getDepartamento().getNome());
        
        
        //Estabelecer a associação binária entre um (1)
        //objeto Departamento com um (1) ou mais (*)
        //objetos Funcionario Horista, Mensalista e Comissionado
        dep1.addFuncionarios(funchor);
        dep1.addFuncionarios(funcmen);
        dep2.addFuncionarios(funccom);
        
        proj1.addFuncionarios(funchor);
        proj2.addFuncionarios(funcmen);
        proj2.addFuncionarios(funccom);
        
        dep1.listar();
        dep2.listar();
        
        proj1.listar();
        proj2.listar();
    }
    
}
