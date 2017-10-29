package fatec.poo.model;

/**
 *
 * @author 0030481521022
 */
public class Turma {
    private String sigla;
    private int qtdeVagas;
    private Curso curso;
    private Professor professor;
    private Aluno[] alunos;
    private int numAlu;

    public Turma(String sigla, int qtdeVagas) {
        this.sigla = sigla;
        this.qtdeVagas = qtdeVagas;
        alunos = new Aluno[5];
    }

    public String getSigla() {
        return sigla;
    }

    public int getQtdeVagas() {
        return qtdeVagas;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Curso getCurso() {
        return curso;
    }

    public Professor getProfessor() {
        return professor;
    }
    
    public void addAluno(Aluno a) {
        alunos[numAlu] = a;
        numAlu++;
    }
    
    public void listarAlunos() {
        System.out.println("\n\n\t\t\tLista de Frequência");
        System.out.print("\nSigla do Curso: " + getCurso().getSigla());
        System.out.println("\t\tNome do Curso: " + getCurso().getDescricao());
        System.out.println("\nSigla da Turma: " + sigla);
        System.out.println("\nNome do professor: " + getProfessor().getNome());
        System.out.println("\n\tNome do Aluno\n");
        for(int i = 0; i < numAlu; i++) {
            System.out.println((i + 1) + " - " + alunos[i].getNome());
        }
    }
}
