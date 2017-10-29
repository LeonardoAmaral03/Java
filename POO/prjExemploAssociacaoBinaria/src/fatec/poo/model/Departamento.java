package fatec.poo.model;

/**
 *
 * @author Leonardo
 */
public class Departamento {
    private String sigla;
    private String nome;
    private Funcionario funcionarios[];
    private int qtdFunc;

    public Departamento(String sigla, String nome) {
        this.sigla = sigla;
        this.nome = nome;
        funcionarios = new Funcionario[5];
    }

    public String getSigla() {
        return sigla;
    }

    public String getNome() {
        return nome;
    }
    
    public void addFuncionarios(Funcionario f) {
        funcionarios[qtdFunc] = f;
        qtdFunc++;
    }
    
    public void listar(){
        System.out.println("\n\nSigla: " + sigla + "\nNome: " + nome + "\nQuantidade de Funcionários: " + qtdFunc);
        System.out.println("\nRegistro\tNome\t\tTipo");
        for (int i = 0; i < qtdFunc; i++) {
            System.out.print(funcionarios[i].getRegistro());
            System.out.print("\t\t" + funcionarios[i].getNome());
            if(funcionarios[i] instanceof FuncionarioComissionado) {
                System.out.println("\tComissionado");
            } else {
                if(funcionarios[i] instanceof FuncionarioHorista) {
                    System.out.println("\tHorista");
                } else {
                    System.out.println("\tMensalista");
                }
            }
        }
    }
}
