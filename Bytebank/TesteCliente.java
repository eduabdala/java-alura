package Bytebank;

public class TesteCliente {
  public static void main(String[] args) {
//    Conta contaEduardo = new Conta(0003, 030303);
//    contaEduardo.setTitular(new Cliente());
//    contaEduardo.getTitular().setNome("william grayson");
//    contaEduardo.getTitular().setCpf("030-030-030.03");

//    System.out.println("Nome: " + contaEduardo.getTitular().getNome());
//    System.out.println("CPF: " + contaEduardo.getTitular().getCpf());
//    System.out.println("O total de contas é: " + Conta.getTotal());

      Funcionario william = new Gerente();

      william.setNome("william grayson");
      william.setCpf("090-092-094.09");
      william.setSalario(3000);

      System.out.println("Olá, " + william.getNome());
      System.out.println("Sua bonificação é de: " + william.getBonificacao());


      Gerente davi = new Gerente();

      davi.setNome("davi santos");
      davi.setCpf("000-000-000.00");
      davi.setSalario(9000);

      System.out.println("Olá " + davi.getNome());
      System.out.println("bonificacao: " + davi.getBonificacao());

  }
}
