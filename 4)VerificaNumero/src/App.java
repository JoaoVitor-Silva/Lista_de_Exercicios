/* Nome do Aluno: João Vitor da Silva Marques Fernandes
* RA: 323120197
* Nome do Programa: Verifico numeros Pares, Impares, Positivos ee Negativos
* Data: 20/05/2023
*/
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um numero inteiro: ");
        int value = input.nextInt();

        if(value % 2 == 0)
        {
            System.out.println("Par");
        }
        else
        {
            System.out.println("Impar");
        }

        if(value >= 0)
        {
            System.out.println("Positivo");
        }
        else
        {
            System.out.println("Negativo");
        }
    }
}
