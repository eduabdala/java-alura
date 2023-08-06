package Bytebank;

public class CriaConta {
  public static void main(String[] args) {
    Conta primeiraConta = new Conta(0001, 010101);
    primeiraConta.deposita(200);
    System.out.println("seu saldo é " + primeiraConta.getSaldo());
    System.out.println(primeiraConta);
    primeiraConta.deposita(100);
    System.out.println(primeiraConta.getSaldo());

    Conta segundaConta = new Conta(0002, 020202);
    System.out.println(segundaConta);
    segundaConta.deposita(50);
    System.out.println(segundaConta.getSaldo());
    System.out.println(primeiraConta.getSaldo());

    primeiraConta.deposita(500);
    System.out.println(primeiraConta.getSaldo());
    System.out.println(segundaConta.getSaldo());
    System.out.println(Conta.getTotal());
  }
}
