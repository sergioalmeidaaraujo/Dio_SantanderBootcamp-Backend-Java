import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        int numero; //= 1021;
        String agencia; //= "067-8";
        String nomeCliente; //= "Mario Andrade";
        double saldo; //= 237.48;
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, digite o nome do cliente:");
        nomeCliente = sc.nextLine(); // Use nextLine para ler a linha completa.

        System.out.println("Por favor, digite o número da Agência:");
        agencia = sc.nextLine();

        System.out.println("Por favor, digite o número da Conta:");
        numero = sc.nextInt(); // Use nextInt para ler um número inteiro.

        System.out.println("Por favor, digite o saldo:");
        saldo = sc.nextDouble(); // Use nextInt para ler um número inteiro.

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + 
        ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");

        sc.close();
    }
}
