import java.util.Scanner;

public class Totalhomememulher {
    public static void main(String[] args) throws Exception {
       Scanner sc = new Scanner(System.in);
       int countM =0;
       int countF= 0;
       for (int i = 0; i < 4; i++) {
        System.out.println("digite o nome da"+(i+1)+"ªpessoa: ");
        String nome = sc.nextLine();
        System.out.println("digite o sexo da"+(i+1)+"ªpessoa: ");
        String sexo = sc.nextLine();

        if(sexo.equalsIgnoreCase("M")){
           countM++;
        }else if (sexo.equalsIgnoreCase("F")) {
                countF++;
            }
        }
        System.out.println("total de homens"+countM);
        System.out.println("total de mulheres"+countF);

       }
    }

