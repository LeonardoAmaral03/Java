package fatec.poo.model;

/**
 *
 * @author 0030481521022
 */
public class FuncionarioHorista extends Funcionario{
    private double ValHorTrab;
    private int QtdeHorTrab;
    
    public FuncionarioHorista(int r, String n, String dta, double vht) {
        super(r, n, dta);
        ValHorTrab = vht;
    }
    
    public void apontarHoras(int qht) {
        QtdeHorTrab = qht;
    }
    
    public double calcSalBruto() {
        double SalBruto;
        SalBruto = ValHorTrab * QtdeHorTrab;
        return(SalBruto);
    }
    
    public double calcGratificacao() {
        double Gratificacao;
        Gratificacao = 0.075 * (ValHorTrab * QtdeHorTrab);
        return(Gratificacao);
    }
    
    public double calcSalLiquido() {
        double SalLiq;
        SalLiq = super.calcSalLiquido() + calcGratificacao() - super.calcDesconto();
        return(SalLiq);
    }
}
