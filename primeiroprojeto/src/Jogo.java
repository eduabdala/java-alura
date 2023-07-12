import java.util.Scanner;
import java.util.Random;

public class Jogo {
  public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);
    int numeroAleatorio = new Random().nextInt(100);
    int tentativas = 0;

    while (tentativas < 5) {
      System.out.println("Digite um numero entre 0 e 100: ");
      int numeroDigitado = leitor.nextInt();
      tentativas++;

      if (numeroDigitado == numeroAleatorio) {
        System.out.println("Parabens, Voce acertou!");
        break;
      } else if (numeroDigitado < numeroAleatorio){
        System.out.println("O numero digitado é menor que o numero aleatorio");
      } else {
        System.out.println("O numero digitado é maior que o numero aleatorio");
      }
    }
  
    if (tentativas == 5) {
      System.out.println("Voce nao conseguiu adivinhar o numero, a respostar era:" + numeroAleatorio);
    }

  }
}
