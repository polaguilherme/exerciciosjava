import java.util.Scanner;

public class Nummaior {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("digite um numero: ");
        int num = sc.nextInt();
        if(num > 10){
            System.out.println("o numero e maior que 10");
        }else{
            System.out.println(" o numero nao e maior que 10");
        }
    }
}
