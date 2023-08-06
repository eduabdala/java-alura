package src;

public class TesteContas {

  public static void main(String[] args) {
    ContaCorrente cc = new ContaCorrente(111, 011);
    cc.deposita(100);

    ContaPoupanca cp = new ContaPoupanca(222, 022);
    cp.deposita(100);

    cc.transfere(10.00, cp);
    System.out.println("CC: " + cc.getSaldo());
    System.out.println("CP: " + cp.getSaldo());

    cc.saca(20);
    System.out.println("CC: " + cc.getSaldo());


  }
  
}
