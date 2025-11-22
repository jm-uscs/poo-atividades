package uscs;

import java.util.Scanner;
public class TestaFiguraGeometrica {
    public static void main(String[] args) throws Exception {
        //Cria o Scanner
        Scanner leitor = new Scanner(System.in);

        //Cria o Circulo
        System.out.println("==================Leitor de Circulo==================");
        System.out.println("Insira o raio do circulo: ");
        double raioInput = leitor.nextDouble();
        Circulo c1 = new Circulo(raioInput);

        System.out.println("Area do "+c1.nome()+" é "+c1.area());
        System.out.println("Perimetro do "+c1.nome()+" é "+c1.perimetro());

        //Cria o Quadrado
        System.out.println("==================Leitor de Quadrado==================");
        System.out.println("Insira o lado do quadrado: ");
        double ladoInput = leitor.nextDouble();
        Quadrado q1 = new Quadrado(ladoInput);

        System.out.println("Area do "+q1.nome()+" é "+q1.area());
        System.out.println("Perimetro do "+q1.nome()+" é "+q1.perimetro());

        //Cria o Retângulo
        System.out.println("==================Leitor de Retângulo==================");
        System.out.println("Insira a base do retângulo: ");
        double baseInput = leitor.nextDouble();
        System.out.println("Insira a altura do retângulo: ");
        double alturaInput = leitor.nextDouble();
        Retangulo r1 = new Retangulo(baseInput, alturaInput);

        System.out.println("Area do "+r1.nome()+" é "+r1.area());
        System.out.println("Perimetro do "+r1.nome()+" é "+r1.perimetro());

        //Fecha o Scanner
        leitor.close();
    }
}
