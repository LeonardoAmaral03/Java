package fatec.poo.model;

/**
 *
 * @author 0030481521022
 */
public class PessoaFisica extends Pessoa{
    private String cpf;
    private double base;
    
    public PessoaFisica(String c, String n, int ai) {
        super(n, ai);
        cpf = c;
    }
    
    public double calcBonus(int a){
        double bonus;
        bonus = 0;
        if(getTotalCompras() > 12000){
            bonus = (a - getAnoInscricao()) * getBase(); 
        }
        return(bonus);
    }
    
    public String getCpf(){
        return(cpf);
    }
    
    public void setBase(double b){
        base = b;
    }
    
    public double getBase(){
        return(base);
    }
}
