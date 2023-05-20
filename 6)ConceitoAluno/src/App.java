/* Nome do Aluno: João Vitor da Silva Marques Fernandes
* RA: 323120197
* Nome do Programa: Conceito de notas de aluno
* Data: 20/05/2023
*/

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite sua nota: ");
        double nota = input.nextDouble();

        if(nota >= 85)
        {
            System.out.println("Ótimo");
        }
        else if(nota >= 65 && nota <= 84)
        {
            System.out.println("Bom");
        }
        else if(nota >= 50 && nota <= 64)
        {
            System.out.println("Regular");
        }
        else if(nota <= 49)
        {
            System.out.println("Insuficiente");
        }
    }
}
