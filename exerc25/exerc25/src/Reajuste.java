import java.util.Scanner;

public class Reajuste {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        double salariomin = 1100.0;
        int totalfunc = 584;

       int contadorSalarioMenortres =0;
       int contadorSalarioEntreTresDez=0;
       int contadorSalarioEntreDezVinte =0;

       for (int i = 1; i <= totalfunc; i++) {
        System.out.println("funcionario: "+i);
        System.out.println("informe seu salario: ");
        double salario = sc.nextDouble();

        if (salario <(3* salariomin)) {
            salario *= 1.5;
            contadorSalarioMenortres++;
        }else if (salario >= (3* salariomin)&& salario < (10 * salariomin)) {
            salario *= 1.2;
            contadorSalarioEntreTresDez++;
        }else if (salario >=(10* salario) && salario <=(20 * salariomin)) {
            salario *= 1.15;
            contadorSalarioEntreDezVinte++;
        }
        System.out.println("novo salario: "+ salario);
       }
    }
}
