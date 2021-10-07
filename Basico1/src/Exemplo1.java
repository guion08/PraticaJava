import java.util.Scanner;

public class Exemplo1 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Insira o seu nome: ");
        String nome = leitor.next();
        System.out.println();
        System.out.print("Exemplo1\n" + nome + "!");
    }
}
