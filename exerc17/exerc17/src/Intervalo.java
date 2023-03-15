import java.util.Scanner;

public class Intervalo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0; 
        for (int i = 0; i < 80; i++) {
            System.out.print("Digite o " + (i+1) + "º numero: ");
            int num = scanner.nextInt();
            if (num >= 10 && num <= 150) {
                count++;
            }
        }
        System.out.println("O numero de numeros no intervalo [10, 150] e: " + count);
        scanner.close();
    }
}
