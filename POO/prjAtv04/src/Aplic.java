
import fatec.poo.model.Aluno;
import fatec.poo.model.Curso;
import fatec.poo.model.Professor;
import fatec.poo.model.Turma;

/**
 *
 * @author Leonardo
 */
public class Aplic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Aluno alu1 = new Aluno("0030481521090", "Silvio Silverio");
        Aluno alu2 = new Aluno("0030481521091", "Pedro Pedroso");
        Aluno alu3 = new Aluno("0030481521092", "Alfredo Ferreira");
        Aluno alu4 = new Aluno("0030481521093", "Ademar Bolonha");
        
        Professor profads = new Professor("001289", "Paulão Doutrinador");
        Professor profmcc = new Professor("001256", "Julia Piazini");
        
        Curso curads = new Curso("ADS", "Ánalise e Desenvolvimento de Sistemas", "2000 Horas");
        Curso curmcc = new Curso("MCC", "Mecatrônica", "800 Horas");
        
        Turma turads = new Turma("TMADS1", 40);
        Turma turmcc = new Turma("TTMCC1", 60);
        
        turads.addAluno(alu1);
        turads.addAluno(alu3);
        turmcc.addAluno(alu2);
        turmcc.addAluno(alu4);
        
        turads.setCurso(curads);
        turmcc.setCurso(curmcc);
        
        turads.setProfessor(profads);
        turmcc.setProfessor(profmcc);
        
        turads.listarAlunos();
        turmcc.listarAlunos();
    }
    
}
