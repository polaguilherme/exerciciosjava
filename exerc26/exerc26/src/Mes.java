import java.util.*;
public class Mes {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o número do mês: ");
        int mes = sc.nextInt();
        
        String mesString = "";
        switch (mes) {
            case 1:
                mesString = "Janeiro";
                break;
            case 2:
                mesString = "Fevereiro";
                break;
            case 3:
                mesString = "Março";
                break;
            case 4:
                mesString = "Abril";
                break;
            case 5:
                mesString = "Maio";
                break;
            case 6:
                mesString = "Junho";
                break;
            case 7:
                mesString = "Julho";
                break;
            case 8:
                mesString = "Agosto";
                break;
            case 9:
                mesString = "Setembro";
                break;
            case 10:
                mesString = "Outubro";
                break;
            case 11:
                mesString = "Novembro";
                break;
            case 12:
                mesString = "Dezembro";
                break;
            default:
                System.out.println("Mês inválido!");
                System.exit(0);
        }
        
        System.out.println("O mês correspondente ao número " + mes + " é " + mesString + ".");
    } 
}

