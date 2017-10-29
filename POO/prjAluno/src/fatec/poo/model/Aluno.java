package fatec.poo.model;

/**
 *
 * @author 0030481521022
 */
public class Aluno {
    private int ra;
    private String nome;
    private double nota1;
    private double nota2;
    
    public Aluno(int a, String b){
        ra = a;
        nome = b;
    }
    
    public void setNota1(double c){
        nota1 = c;
    }
    
    public void setNota2(double d){
        nota2 = d;
    }
    
    public double CalcMedia(){
        double Media;
        Media = (nota1 + nota2) / 2;
        return(Media);
    }
    
    public boolean isAprovado(){
        if((nota1 + nota2) / 2 >= 6.0){
            return(true);
        } else {
            return(false);
        }
    }
    
    public int getRa(){
        return(ra);
    }
    
    public String getNome(){
        return(nome);
    }
}
