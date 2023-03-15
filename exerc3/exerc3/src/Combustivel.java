import java.util.*;

public class Combustivel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite a distância total percorrida em km: ");
        double distanciaTotal = scanner.nextDouble();
        
        System.out.print("Digite o total de combustível gasto em litros: ");
        double combustivelGasto = scanner.nextDouble();
        
        double consumoMedio = distanciaTotal / combustivelGasto;
        
        System.out.printf("O consumo médio do automóvel é de %.2f km/l.\n", consumoMedio);
    }
}
