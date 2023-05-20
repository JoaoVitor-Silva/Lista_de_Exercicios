/* Nome do Aluno: João Vitor da Silva Marques Fernandes
* RA: 323120197
* Nome do Programa: Cadastro de usuario
* Data: 20/05/2023
*/
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = input.nextLine();
        System.out.print("Sobrenome: ");
        String sobrenome = input.nextLine();
        System.out.print("Idade: ");
        int idade = input.nextInt();
        System.out.print("Naturalidade: ");
        String naturalidade = input.next();

        System.out.print("Deseja vizualizar os dados completos? (s/n): ");
        char res = input.next().toString().toLowerCase().charAt(0);

        if(res == 's')
        {
            System.out.println("Nome: " + nome);
            System.out.println("Sobrenome: " + sobrenome);
            System.out.println("Idade: " + idade);
            System.out.println("Naturalidade: " + naturalidade);
        }
        else if(res == 'n')
        {
            System.out.println("Nome: " + nome);
            System.out.println("Idade: " + idade);
        }
        else
        {
            System.out.println("Digitação errada. Tente Novamente");
        }

    }
}
