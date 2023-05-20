/* Nome do Aluno: João Vitor da Silva Marques Fernandes
* RA: 323120197
* Nome do Programa: Meses do ano
* Data: 20/05/2023
*/
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite o número do mês:");
        int mes = input.nextInt();
        
        switch(mes)
        {
            case 1 :
            System.out.println("Mês: Janeiro ; Estação: Verão");
            break;
            case 2 :
            System.out.println("Mês: Fevereiro ; Estação: Verão");
            break;
            case 3 :
            System.out.println("Mês: Março ; Estação: Verão");
            break;
            case 4 :
            System.out.println("Mês: Abril ; Estação: Outono");
            break;
            case 5 :
            System.out.println("Mês: Maio ; Estação: Outono");
            break;
            case 6 :
            System.out.println("Mês: Junho ; Estação: Outono");
            break;
            case 7 :
            System.out.println("Mês: Julho ; Estação: Inverno");
            break;
            case 8 :
            System.out.println("Mês: Agosto ; Estação: Inverno");
            break;
            case 9 :
            System.out.println("Mês: Setembro ; Estação: Inverno");
            break;
            case 10 :
            System.out.println("Mês: Outubro ; Estação: Primavera");
            break;
            case 11 :
            System.out.println("Mês: Novembro ; Estação: Primavera");
            break;
            case 12 :
            System.out.println("Mês: Dezembro ; Estação: Primavera");
            break;
        }
    }
}
