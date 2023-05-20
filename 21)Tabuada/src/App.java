/* Nome do Aluno: João Vitor da Silva Marques Fernandes
* RA: 323120197
* Nome do Programa: Tabuada
* Data: 20/05/2023
*/

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.print("Informe um numero: ");
        int valorLimite = input.nextInt();

        input.close();

        if (valorLimite > 0) {
            for (int numero = 1; numero <= valorLimite; numero++) {
                System.out.println("\nTabuada - " + numero);

                for (int expoente = 1; expoente <= 10; expoente++)
                {
                    int result = numero * expoente;
                    System.out.println(String.format("%d x %d = %d", numero, expoente, result));
                }
            }
        }
        else{
            System.out.println("Não e possivel realizar a operação com numeros menores ou iguais a 0.");
        }
    }
}