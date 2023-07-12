import java.util.Scanner;

public class Desafio {
  public static void main(String[] args) {
    Scanner leitor = new Scanner (System.in);
    String nome = "Eduardo Abdala";
    String tipoConta = "Corrente";
    double saldo = 2500.00;


    System.out.println("************************************");
    System.out.println("\nDados iniciais do cliente: ");
    System.out.println("Nome: " + nome);
    System.out.println("Tipo de conta: " + tipoConta);
    System.out.println("Saldo Atual: " + saldo);
    System.out.println("\n************************************");


    String menu = "** Digite sua opção ** \n 1- Consultar saldo \n 2- Transferir valor \n 3- Receber valor \n 4- Sair";
    int opcao = 0;
    double transferencia = 0;

    while (opcao != 4) {
      System.out.println(menu);
      opcao = leitor.nextInt();

      switch (opcao) {

        case 1:
          System.out.println("Saldo: " + saldo);
          break;
        case 2:
          System.out.println("Valor da transferencia: ");
          transferencia = leitor.nextDouble();
          if (transferencia < saldo) {
            saldo -= transferencia;
            System.out.println("Transferencia concluida");
          } else {
            System.out.println("Saldo insuficiente");
          }
          break;
        case 3:
          System.out.println("Valor a receber: ");
          transferencia = leitor.nextDouble();
          saldo += transferencia;
          System.out.println("Valor recebido.");
          break;
        case 4:
          System.out.println("Encerrando Programa...");
          break;
        default:
          System.out.println("Opção invalida, Digite novamente.");
      }
    }
  }
}
