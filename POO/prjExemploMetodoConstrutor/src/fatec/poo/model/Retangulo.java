package fatec.poo.model;

/**
 *
 * @author 0030481521022
 */
public class Retangulo {
    private double altura; 
    private double base;
    
    //Definição do metodo construtor
    public Retangulo(double a, double b){
        altura = a;
        base = b;
    }

    public Retangulo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public double CalcArea(){
        double Area;
        Area = altura * base;
        return(Area);
    }
    public double CalcPerimetro(){
        double Perimetro;
        Perimetro = 2 * (base + altura);
        return(Perimetro);
    }
    
    public double CalcDiagonal(){
        double Diagonal;
        Diagonal = Math.sqrt(Math.pow(altura, 2) + Math.pow(base, 2));
        return(Diagonal);
    }
    
    public double getAltura(){
        return(altura);
    }
    
    public double getBase(){
        return(base);
    }
}
