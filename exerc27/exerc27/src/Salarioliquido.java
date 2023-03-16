import java.util.*;
public class Salarioliquido {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o nome do funcionário: ");
        String nome = sc.nextLine();
        System.out.print("Digite a idade do funcionário: ");
        int idade = sc.nextInt();
        System.out.print("Digite o sexo do funcionário (M/F): ");
        char sexo = sc.next().charAt(0);
        System.out.print("Digite o salário fixo do funcionário: ");
        double salario = sc.nextDouble();
        
        double abono = 0;
        if (sexo == 'M' && idade >= 30) {
            abono = 100;
        } else if (sexo == 'M' && idade < 30) {
            abono = 50;
        } else if (sexo == 'F' && idade >= 30) {
            abono = 200;
        } else if (sexo == 'F' && idade < 30) {
            abono = 80;
        } else {
            System.out.println("Sexo inválido!");
            System.exit(0);
        }
        
        double salarioLiquido = salario + abono;
        System.out.println("O funcionário " + nome + " tem um salário líquido de " + salarioLiquido + ".");
    }
}
