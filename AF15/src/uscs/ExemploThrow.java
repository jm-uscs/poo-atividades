package uscs;
import java.util.Scanner;

public class ExemploThrow {
    public static final String SENHA_CORRETA = "123456";

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        try {
            System.out.println("Digite a senha:");
            String senha = s.nextLine();
            if (!senha.equals(SENHA_CORRETA)) {
                throw new Exception("Senha incorreta!");
            }
            System.out.println("Acesso permitido. Bem vindo Jota");
        } catch (Exception ex) {
            System.out.println("Erro: " + ex.getMessage());
        } finally {
            s.close();
            System.out.println("Fim do programa.");
        }
    }
}
