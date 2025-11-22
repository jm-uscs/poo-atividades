package uscs;

public class Retangulo implements FormaGeometrica{

    public double base, altura;

    public Retangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double area() {
        return base * altura;
    }

    @Override
    public double perimetro() {
        return 2 * (base + altura);
    }

    @Override
    public String nome() {
        return "Retângulo";
    }

    
}
