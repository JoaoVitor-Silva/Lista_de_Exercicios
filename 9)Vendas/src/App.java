/* Nome do Aluno: João Vitor da Silva Marques Fernandes
* RA: 323120197
* Nome do Programa: Vendas
* Data: 20/05/2023
*/
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner input = new Scanner(System.in);
        double Sale;

        System.out.print("Valor da venda: ");
        double Price = input.nextDouble();

        System.out.println("Forma de pagamento"
                          +"\n1)Venda a Vista - desconto de 10%"
                          +"\n2)Venda a Prazo 30 dias - desconto de 5%"
                          +"\n3)Venda a Prazo 60 dias - mesmo preço"
                          +"\n4)Venda a Prazo 90 dias - acréscimo de 5%"
                          +"\n5)Venda com cartão de débito - desconto de 8%"
                          +"\n6)Venda com cartão de crédito - desconto de 7%");
        int res = input.nextInt();
        
        switch(res)
        {
            case 1:
                Sale = Price - (Price * 0.1);
                System.out.println("Valor: R$" + Sale);
            break;
            case 2:
                Sale = Price - (Price * 0.05);
                System.out.println("Valor: R$" + Sale);
            break;
            case 3:
                Sale = Price;
                System.out.println("Valor: R$" + Sale);
            break;
            case 4:
                Sale = Price + (Price * 0.05);
                System.out.println("Valor: R$" + Sale);
            break;
            case 5:
                Sale = Price - (Price * 0.08);
                System.out.println("Valor: R$" + Sale);
            break;
            case 6:
                Sale = Price - (Price * 0.07);
                System.out.println("Valor: R$" + Sale);
            break;
        }

    }
}
