package fatec.poo.model;

/**
 *
 * @author 0030481521022
 */
public class Circulo {
    private double Raio;
    
    public void setRaio(double r){
        Raio = r;
    }
    
    public double CalcArea(){
        double Area;
        Area = Math.PI * Math.pow(Raio, 2);
        return(Area);
        //return(Math.PI * Math.pow(Raio, 2));
    }
    
    public double CalcPerimetro(){
        double Perimetro;
        Perimetro = 2 * Math.PI * Raio;
        return(Perimetro);
    }
    
    public double CalcDiametro(){
        double Diametro;
        Diametro = 2 * Raio;
        return(Diametro);
    }
}
