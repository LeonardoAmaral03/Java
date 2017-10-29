package fatec.poo.model;

/**
 *
 * @author 0030481521022
 */
public class ContaCorrente {
    private int numero;
    private double saldo;
    
    public ContaCorrente(int n, double s){
        numero = n;
        saldo = s;
    }
    
    public void depositar(double d){
        saldo += d;
    }
    
    public void sacar(double sq){
        saldo -= sq;
    }
    
    public int getNumero(){
        return(numero);
    }
    
    public double getSaldo(){
        return(saldo);
    }
}
