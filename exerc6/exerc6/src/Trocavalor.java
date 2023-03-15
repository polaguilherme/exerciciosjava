
import java.util.Scanner;
public class Trocavalor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o valor de A: ");
        int a = input.nextInt();

        System.out.print("Digite o valor de B: ");
        int b = input.nextInt();

        int temp = a;
        a = b;
        b = temp;

        System.out.println("Valor de A: " + a);
        System.out.println("Valor de B: " + b);

        input.close();
    }
}