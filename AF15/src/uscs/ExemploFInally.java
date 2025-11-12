package uscs;

import java.util.Scanner;

public class ExemploFInally {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        try {
            System.out.println("Digite o valor do dividendo: ");
            int dividendo = s.nextInt();
            System.out.println("Digite o valor do divisor: ");
            int divisor = s.nextInt();
            if (divisor == 0) {
                throw new Exception("Divisor não pode ser zero.");
            } else {
                int resultado = dividendo / divisor;
                System.out.println("Resultado da divisão de " + dividendo + " por " + divisor + " é: " + resultado);
            }

        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        } finally {
            s.close();
            System.out.println("Scanner fechado. Fim do programa.");
        }
    }
}
