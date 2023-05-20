import java.util.Scanner;

/*_______________________________________________________________
Nome do Aluno: João Vitor da Silva Marques Fernandes
RA: 323120197
Nome do Programa: Gas
Data: 25/04/23

Um determinado gás duplica seu volume a cada segundo. Dada um
volume inicial, em centímetros cúbicos, digitado pelo usuário
faça um programa que determine o tempo necessário para que
esse volume se torne maior que 1000 centímetros cúbicos.
(utilize while)

_______________________________________________________________*/

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner input = new Scanner(System.in);
        int cont = 0;

        System.out.print("Informe o volume inicial em m³: ");
        double metros = input.nextDouble();

        while (metros <= 1000)
        {
            metros = metros * 2;
            cont++;
        }
        System.out.println("M³: " + metros);
        System.out.println("Tempo: " + cont);
        input.close();

    }
}
