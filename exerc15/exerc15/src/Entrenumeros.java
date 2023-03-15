import java.util.Scanner;

public class Entrenumeros {
    public static void main(String[] args) throws Exception {
       Scanner sc = new Scanner(System.in) ;
        System.out.println("digite um numero: ");
        int num = sc.nextInt();

        if (num >= 100 && num <= 200) {
            System.out.println("o numero"+" "+num+" "+"esta no intervalo entre 100 e 200");
        }else{
            System.out.println("o numero"+" "+num+""+"nao esta no intervalo entre 100 e 200");
        }
    }
}
