import java.util.Scanner;
public class Maior {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("digite o primeiro numero: ");
        int num = sc.nextInt();
        System.out.println("digite o segundo numero: ");
        int num2 = sc.nextInt();

        if(num > num2){
            System.out.println("o maior nuumero e: "+num);
        }else{
           System.out.println("o maior numero e : "+num2);
        }
    }
}
