import java.util.Scanner;

/*_______________________________________________________________
Nome do Aluno: João Vitor da Silva Marques Fernandes
RA: 323120197
Nome do Programa: Elevador
Data: 25/04/23

Escreva um programa que, dada a carga máxima de um elevador e
a quantidade máxima de pessoas digitadas pelo usuário, leia o
peso de cada pessoa, também digitada pelo usuário, que entra
no elevador até que a carga máxima seja atingida ou o número
máximo de pessoas seja atingido (utilize do / while).

_______________________________________________________________*/

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner input = new Scanner(System.in);
        int PesoMaximo = 0;

        System.out.print("Peso maximo do elevador: ");
        double PesoElevador = input.nextDouble();

        do
        {
            System.out.print("Peso da pessoa: ");
            PesoMaximo += input.nextInt();

        }while ( PesoMaximo < PesoElevador);
        System.out.println("Peso maximo atingido.");

        input.close();
    }
}
