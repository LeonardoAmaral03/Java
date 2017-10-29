package fatec.poo.model;

/**
 *
 * @author 0030481521022
 */
public class PessoaJuridica extends Pessoa{
    private String cgc;
    private double taxaIncentivo;
    
    public PessoaJuridica(String c, String n, int ai){
        super(n, ai);
        cgc = c;
    }
    
    public double calcBonus(int a){
        double bonus;
        bonus = (getTotalCompras() * getTaxaIncentivo()) *  (a - getAnoInscricao());
        return(bonus);
    }
    
    public void setTaxaIncentivo(double ti){
        taxaIncentivo = ti / 100;
    }
    
    public String getCgc(){
        return(cgc);
    }
    
    public double getTaxaIncentivo(){
        return(taxaIncentivo);
    }
}
