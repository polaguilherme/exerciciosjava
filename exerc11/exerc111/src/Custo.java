import java.util.Scanner;

public class Custo {
   public static void main(String[] args) {
      
      Scanner input = new Scanner(System.in);
      
      System.out.print("Digite o custo do produto:  ");
      double custo = input.nextDouble();
      
      System.out.print("Digite o percentual de acréscimo (em %): ");
      double percentual = input.nextDouble();
      
      double acrescimo = custo * (percentual / 100);
      double precoVenda = custo + acrescimo;
      
      System.out.printf("O preço de venda é R$ %.2f", precoVenda);
   }
}
