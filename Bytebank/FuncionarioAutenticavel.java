package Bytebank;

public abstract class FuncionarioAutenticavel extends Funcionario {

  private int senha;

  public boolean autentica(int senha) {
    if (this.senha== senha) {
      return true;
    } else {
      return false;
    }
  }
}
