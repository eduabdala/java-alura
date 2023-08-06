package Bytebank;

public class Gerente extends FuncionarioAutenticavel {
  
  public int senha;

  public double getBonificacao() {
    return this.getBonificacao() + getSalario();
  }

  public void setSenha(int senha) {
    this.senha = senha;
  }

  public int getSenha() {
    return senha;
  }
}
