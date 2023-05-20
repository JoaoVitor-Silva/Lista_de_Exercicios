/* Nome do Aluno: João Vitor da Silva Marques Fernandes
* RA: 32310197
* Nome do Programa: MmaiorNumero
* Data: 20/05/23
*/

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.println("Primeiro numero: ");
        float firstNumber = input.nextFloat();

        System.out.println("Segundo numero: ");
        float secondNumber = input.nextFloat();

        var result = firstNumber > secondNumber ? firstNumber : secondNumber;

        System.out.println(result);

        input.close();
    }
}
