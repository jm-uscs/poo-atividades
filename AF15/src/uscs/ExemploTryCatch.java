package uscs;

import java.util.Scanner;

public class ExemploTryCatch {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        try{
            System.out.print("Digite um número inteiro: ");
            int n1 = s.nextInt();
            System.out.print("Digite um número inteiro: ");
            int n2 = s.nextInt();
            System.out.println(n1 + " + " + n2 + " = " + (n1 + n2));
            System.out.println(n1 + " / " + n2 + " = " + (n1 / n2));
        }
       catch(ArithmeticException e){
            System.out.println("Erro: Divisão por zero não é permitida.");
        }
        catch(Exception e){
            System.out.println("Erro: Entrada inválida. Por favor, digite números inteiros.");
        }
        finally {
            s.close();
            System.out.println("Scanner fechado. Fim do programa.");
        }

    }
}
