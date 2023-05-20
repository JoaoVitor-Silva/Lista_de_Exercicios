import java.util.Scanner;

/*_______________________________________________________________
Nome do Aluno: João Vitor da Silva Marques Fernandes
RA: 323120197
Nome do Programa: Numeros pares inverso
Data: 20/05/23
*/

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        int number = 0;
        System.out.println("Digite algum valor menor que 0 para encerrar o programa, ou continue digitando " +
        "valores maior que zero para continuar executando o programa.");
        while (number >= 0)
        {
            number = input.nextInt();
        }
        input.close();
    }
}
