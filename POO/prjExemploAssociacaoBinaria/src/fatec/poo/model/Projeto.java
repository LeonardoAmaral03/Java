package fatec.poo.model;

/**
 *
 * @author 0030481521022
 */
public class Projeto {
    private String sigla;
    private  String descricao;
    private String dataInicio;
    private String dataTermino;
    private Funcionario funcionarios[];
    private int qtdFunc;

    public Projeto(String sigla, String descricao) {
        this.sigla = sigla;
        this.descricao = descricao;
        funcionarios = new Funcionario[5];
    }

    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }

    public void setDataTermino(String dataTermino) {
        this.dataTermino = dataTermino;
    }

    public String getSigla() {
        return sigla;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getDataInicio() {
        return dataInicio;
    }

    public String getDataTermino() {
        return dataTermino;
    }
    
    public void addFuncionarios(Funcionario f) {
        funcionarios[qtdFunc] = f;
        qtdFunc++;
    }
    
    public void listar() {
        System.out.println("\n\nSigla: " + sigla);
        System.out.println("Descrição: " + descricao);
        System.out.println("Data de Início: " + dataInicio);
        System.out.println("Data de Término: " + dataTermino);
        System.out.println("Quantidade de Funcionários: " + qtdFunc);
        
        System.out.println("\nRegistro\t\tNome\t\tDepartamento");
        for(int i = 0; i < qtdFunc; i++){
            System.out.print(funcionarios[i].getRegistro());
            System.out.print("\t\t" + funcionarios[i].getNome());
            System.out.println("\t\t" + funcionarios[i].getDepartamento().getNome());
        }
    }
}
