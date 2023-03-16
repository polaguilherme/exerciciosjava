import java.util.Scanner;

public class Servicomilitar {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

       int countTotal = 0;
       int countAptos = 0;

        while(true){
            System.out.println("Digite seu nome(ou digite sair para finalizar): ");
            String nome = sc.nextLine();
              if (nome.equalsIgnoreCase("sair")) {
                break;
            }
            System.out.println("Informe seu sexo: ");
            String sexo = sc.nextLine();
            System.out.println("digitie sua idade: ");
            int idade = sc.nextInt();
            System.out.println("Saude: ");
            String saude = sc.nextLine();

           countTotal++;

           if (sexo.equalsIgnoreCase("M") && idade >= 18 && saude.equalsIgnoreCase("boa")) {
             countAptos++;
           }
           System.out.println("total de pessoas: "+countTotal);
           System.out.println("total de pessoas aptas: "+countAptos);
        }
    }
}
