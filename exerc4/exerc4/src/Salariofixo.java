import java.util.*;

public class Salariofixo {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.print("Digite o nome do vendedor: ");
    String nome = input.nextLine();

    System.out.print("Digite o salário fixo do vendedor: ");
    double salarioFixo = input.nextDouble();

    System.out.print("Digite o total de vendas efetuadas no mês: ");
    double totalVendas = input.nextDouble();

    double comissao = totalVendas * 0.15;
    double salarioFinal = salarioFixo + comissao; 

    System.out.println("Nome: " + nome);
    System.out.println("Salário fixo: R$" + salarioFixo);
    System.out.println("Salário final: R$" + salarioFinal);

    input.close();

  }

}
