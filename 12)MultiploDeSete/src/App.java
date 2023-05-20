/* Nome do Aluno: João Vitor da Silva Marques Fernandes
* RA: 323120197
* Nome do Programa: Multiplo de sete
* Data: 20/05/2023
*/

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        int contador = 0;

        do{
            contador += 2;
            System.out.println(contador);
        }
        while(contador % 7 != 0);

        System.out.println(contador + " é multiplo de sete");
    }
}
