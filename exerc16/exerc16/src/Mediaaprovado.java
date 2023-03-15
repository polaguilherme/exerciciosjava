import java.util.Scanner;

public class Mediaaprovado {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("digite o seu nome: ");
        String nome = sc.nextLine();
        System.out.println("digite a primeira nota: ");
        double nota1 = sc.nextDouble();
        System.out.println("digite a segunda nota: ");
        double nota2 = sc.nextDouble();
        System.out.println("digite a terceira nota: ");
        double nota3 = sc.nextDouble();
        
        double media = (nota1 + nota2 + nota3)/3;

        if (media >= 7) {
            System.out.println(nome+"esta aprovado com media: "+media);
        }else{
            if (media <= 5) {
                System.out.println(nome+" reprovado com media: "+media);
            }else{
                if (media >= 5.1 || media <= 6.9) {
                    System.out.println(nome+"em recuperacao com media: "+Math.floor(media));
                }
            }
        }
    }
}
