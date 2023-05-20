/*_______________________________________________________________
Nome do Aluno: João Vitor da Silva Marques Fernandes
RA: 323120197
Nome do Programa: Preenchendo Matriz
Data: 20/05/23
*/

public class App {
    public static void main(String[] args) throws Exception {

        int[][] GradeNumeros = new int[10][10];

        for (int i = 0; i < GradeNumeros.length; i++) {
            System.out.println(" ");
            for (int j = 0; j < GradeNumeros.length; j++) {
                GradeNumeros[i][j] = 0;
                System.out.print(GradeNumeros[i][j]);
            }
        }
    }
}
