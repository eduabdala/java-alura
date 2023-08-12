public abstract class Conta {
  protected double saldo;
  private int agencia;
  private int numero;
  private Cliente titular;
  private static int total;

  public Conta(int agencia, int numero) {
    total++;
    this.agencia = agencia;
    this.numero = numero;
  }

  public abstract void deposita(double valor);

  public boolean saca(double valor) {
    if(saldo >= valor) {
      this.saldo -= valor;
      System.out.println(this.saldo);
      return true;
    } else {
      System.out.println("saldo insuficiente");
      return false;
    }
  }

  public boolean transfere(double valor, Conta destino) {
    if(this.saldo >= valor){
      this.saldo -= valor;
      destino.deposita(valor);
      return true;
    } else {
      return false;
    }
  }

  public double getSaldo() {
    return saldo;
  }

  public int getAgencia() {
    return agencia;
  }

  public int getNumero() {
    return numero;
  }

  public Cliente getTitular() {
    return titular;
  }

  public void setTitular(Cliente titular) {
    this.titular = titular;
  }

  public static int getTotal() {
    return total;
  }
}
