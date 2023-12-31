package Bytebank;

public class Cliente implements Autenticavel{
  private String nome;
  private String cpf;
  private String profissao;
  private Endereco endereco;
  private int senha;

  @Override
  public void setSenha(int senha) {
    this.senha = senha;
  }

  @Override
  public boolean autentica(int senha) {
    if(this.senha == senha) {
      return true;
    } else {
      return false;
    }
  }

  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }


  public String getCpf() {
    return cpf;
  }
  public void setCpf(String cpf) {
    this.cpf = cpf;
  } 

  public String getProfissao() {
    return profissao;
  }
  public void setProfissao(String profissao) {
    this.profissao = profissao;
  }
  
  public Endereco getEndereco() {
    return endereco;
  }
  public void setEndereco(Endereco endereco) {
    this.endereco = endereco;
  }
}
