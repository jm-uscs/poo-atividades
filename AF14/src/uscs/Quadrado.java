package uscs;

public class Quadrado implements FormaGeometrica{

    public double lado;

    public Quadrado(double lado){
        this.lado = lado;
    }

    @Override
    public double area() {
        return Math.pow(lado, 2);
    }

    @Override
    public double perimetro() {
        return 4 * lado; 
    }

    @Override
    public String nome() {
        return "Quadrado";
    }

    
    
}
