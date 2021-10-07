import java.util.Scanner;

public class Exemplo3 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Insira o primeiro valor inteiro:");
        int a = leitor.nextInt();
        System.out.println("Insira o segundo valor inteiro:");
        int b = leitor.nextInt();

        System.out.println("------------------");

        int soma = a + b;
        int sub = a - b;
        int multi = a * b;
        int div = a / b;
        int mod = a % b;

        System.out.println(a + " + " + b + " = " + soma);
        System.out.println(a + " - " + b + " = " + sub);
        System.out.println(a + " x " + b + " = " + multi);
        System.out.println(a + " / " + b + " = " + div);
        System.out.println(a + " mod " + b + " = " + mod);

    }

}
