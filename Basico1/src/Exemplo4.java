import java.util.Scanner;

public class Exemplo4 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Insira um valor inteiro: ");
        int num = leitor.nextInt();

        System.out.println("\nTabuada de multiplicacao até 10 do valor " + num + ":");

        for (int i = 0; i <= 10; i ++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }
}
