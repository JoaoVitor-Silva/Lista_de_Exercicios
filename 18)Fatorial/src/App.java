import java.util.Scanner;

/*_______________________________________________________________
Nome do Aluno: João Vitor da Silva Marques Fernandes
RA: 323120197
Nome do Programa: Fatorial
Data: 20/05/23
*/

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite o fatorial: ");
        int Number = input.nextInt(); 

        if (Number == 0)
        {
            System.out.println("O Fatorial de 0 e " + Number);
        }
        else
        {
            int Result = Number;

            for (int i = Number - 1; i >= 1 ; i-- )
            {
                Result = Result * i;
            }
            System.out.println("O fatorial de " + Number + " e " + Result);
        }

        input.close();
    }
}
