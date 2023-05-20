/* Nome do Aluno:João Vitor da Silva Marques Fernandes
* RA: 323120197
* Nome do Programa: Multiplos
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
        input.close();

        if ( firstNumber % secondNumber == 0 || secondNumber % firstNumber == 0){
            System.out.println("São multiplos");
        }
        else {
            System.out.println("Não são multiplos");
        }
    }
}
