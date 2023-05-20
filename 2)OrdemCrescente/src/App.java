/* Nome do Aluno: João Vitor da Silva Marques Fernandes
* RA: 323120197
* Nome do Programa: Ordem Crescente
* Data: 20/05/2023
*/
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe 3 valores: ");
        double First = input.nextDouble();
        double Second = input.nextDouble();
        double Third = input.nextDouble();

        input.close();


        if(First < Second && Second < Third)
        {
            System.out.println(First + "-" + Second + "-" + Third);
        }
        else if(First < Third && Third < Second) 
        {
            System.out.println(First + "-" + Third + "-" + Second);
        }
        else if(Second < First && First < Third)
        {
            System.out.println(Second + "-" + First + "-" + Third);
        }
        else if(Second < Third && Third < First)
        {
            System.out.println(Second + "-" + Third + "-" + First);
        }
        else if(Third < First && First < Second)
        {
            System.out.println(Third + "-" + First + "-" + Second);
        }
        else if(Third < Second && Second < First)
        {
            System.out.println(Third + "-" + Second + "-" + First);
        }
    }
}