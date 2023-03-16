import java.util.Scanner;

public class Verificanumero {
    public static void main(String[] args) throws Exception {
       Scanner sc = new Scanner(System.in);

        System.out.println("Iforme um numero: ");
        int num = sc.nextInt();

        if (num > 80) {
            System.out.println("o numero e maior que 80");
        }else if (num < 25) {
            System.out.println("numero e menor que 25: ");
        }else if (num == 40) {
            System.out.println("o numero e igual a 40");
        }
    }
}
