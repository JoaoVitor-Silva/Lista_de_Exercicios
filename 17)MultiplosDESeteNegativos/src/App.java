/* Nome do Aluno: João Vitor da Silva Marques Fernandes
* RA: 323120197
* Nome do Programa: Multiplos negativos de sete
* Data: 20/05/2023
*/

public class App {
    public static void main(String[] args) throws Exception {
        
        int contador = 1;
        int result = 0;

        do{
            result = (-7) * contador;
            System.out.println("-7 x " + contador + " = " + result);
            contador++;
        }
        while(result > -1000);
    }
}