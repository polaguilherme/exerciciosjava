import java.util.Scanner;

public class Mediaaluno {
    public static void main(String[] args) throws Exception {
        String nome;
        double media,not1, not2, not3;
        Scanner input = new Scanner(System.in);
        System.out.println("digite seu nome: ");
        nome = input.nextLine();
        System.out.println("digite uma nota: ");
        not1 = input.nextDouble();
        System.out.println("digite a segunda nota: ");
        not2 = input.nextDouble();
        System.out.println("Digite a terceira nota: ");
        not3 = input.nextDouble();

        media = (not1 + not2 + not3) /3 ;

        System.out.println(nome+"Sua media é: "+Math.floor(media));

    }
}
