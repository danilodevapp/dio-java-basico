//TODO: Importar e exibir as classes: Scanner e Locale

import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        //Exibir mensagem para o usuário digitar o número da conta
        System.out.println("Digite o número da conta sem dígito: ");
        //Recebe o número da conta por meio da variável Número
        int Numero = scanner.nextInt();
        System.out.println("");

        //Exibir mensagem para que o usuário digite o número da agência com dígito
        System.out.println("Digite o número da agência com dígito: ");
        //Recebe o número da agência por meio da variável Agência
        String Agencia = scanner.next();
        System.out.println("");

        //Exibir mensagem para o usuário digitar o número do cliente
        System.out.println("Digite o nome do cliente: ");
        scanner.nextLine(); // Limpar o buffer
        //Recebe o nome do cliente por meio da variável NomeCliente
        String NomeCliente = scanner.nextLine();
        System.out.println("");

        //Exibir mensagem para o usuário digitar o saldo do cliente
        System.out.println("Digite o Saldo do cliente: ");
        //Recebe o valor do saldo do cliente por meio da variável Saldo
        double Saldo = scanner.nextDouble();
        System.out.println("");

        //Imprime os uma mensagem de boas vindas ao cliente e exibe os valores recebidos nas variáveis
        System.out.println("Olá " + NomeCliente + ", obrigado por criar uma conta em nosso banco, " + 
                          "sua agência é " + Agencia + ", conta " + Numero + " e seu saldo " + Saldo + 
                          " já está disponível para saque");
    }
}
