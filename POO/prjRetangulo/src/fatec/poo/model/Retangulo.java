package fatec.poo.model;

/**
 *
 * @author 0030481521022
 */
public class Retangulo {
    private double Altura; 
    private double Base;
    
    public void setAltura(double a){
        Altura = a;
    }
    public void setBase(double b){
        Base = b;
    }
    public double CalcArea(){
        double Area;
        Area = Altura * Base;
        return(Area);
    }
    public double CalcPerimetro(){
        double Perimetro;
        Perimetro = 2 * (Base + Altura);
        return(Perimetro);
    }
    
    public double CalcDiagonal(){
        double Diagonal;
        Diagonal = Math.sqrt(Math.pow(Altura, 2) + Math.pow(Base, 2));
        return(Diagonal);
    }
}
