import java.util.Scanner;

public class Maiordeidade {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 75; i++) {
            System.out.println("digite sua idade: ");
            int idade = sc.nextInt();

            if(idade >= 18){
                System.out.println("a pessoa e maior de idade");
            }else{
                System.out.println("a pessoa nao e maior de idade");
            }
        }
    }
}
