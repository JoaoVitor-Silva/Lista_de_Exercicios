/* Nome do Aluno: João Vitor da Silva Marques Fernandes
* RA: 323120197
* Nome do Programa: Hospedagem de hotel
* Data: 20/05/2023
*/
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.print("Informe a quantidade de dias que ira ficar hospedado: ");
        int hospedagem = input.nextInt();

        if(hospedagem > 15)
        {
            double Price = (hospedagem * 60) + (hospedagem * 5.50);
            System.out.println("Hospedagem: " + hospedagem
                            + "\nPreço: " + Price);
        }
        else if(hospedagem == 15)
        {
            double Price = (hospedagem * 60) + (hospedagem * 6);
            System.out.println("Hospedagem: " + hospedagem
                            + "\nPreço: " + Price);
        }
        else if(hospedagem < 15)
        {
            double Price = (hospedagem * 60) + (hospedagem * 8);
            System.out.println("Hospedagem: " + hospedagem
                            + "\nPreço: " + Price);
        }
    }
}
