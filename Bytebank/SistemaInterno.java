package Bytebank;

public class SistemaInterno {

  private int senha = 2222;

  public void autentica(Gerente g){
    boolean autentica = g.autentica(this.senha);
    if(autentica) {
      System.out.println("Pode entrar no sistema!");
    } else {
      System.out.println("Nao pode entrar no sistema");
    }
  }
  
}
