import java.util.Scanner;
import java.text.DecimalFormat;

public class Desafio01 {

  public static void main(String[] args) {
    // Lendo os dados de Entrada:
    Scanner scanner = new Scanner(System.in);
    int numeroConta = scanner.nextInt();
    scanner.nextLine(); // Consome a quebra de linha após a entrada do número da conta
    String nomeTitular = scanner.nextLine();
    double saldo = scanner.nextDouble();

    //TODO: Criar uma instância de "ContaBancaria" com os valores de Entrada.

    System.out.println("Informacoes:");
    //TODO: Imprimir as informações da conta usando o objeto criado no TODO acima.
    
    ContaBancaria contaBancaria = new ContaBancaria();
    contaBancaria.Bancaria(numeroConta,nomeTitular,saldo);
    System.out.println(contaBancaria);
    scanner.close();
  }
}

class ContaBancaria {
  int numero;
  String titular;
  double saldo;

  public void Bancaria(int numero, String titular, double saldo) {
    this.numero = numero;
    this.titular = titular;
    this.saldo = saldo;
  }
  
  @Override
  public String toString() {
    DecimalFormat df = new DecimalFormat("0.0");

  
    return "Conta: " + numero +
            "\nTitular: " + titular +
            "\nSaldo: R$ " + df.format(saldo);
  }
  
 
}


//Conta: 101010
//Titular: Caio Carlos
//Saldo: R$ 98.0

