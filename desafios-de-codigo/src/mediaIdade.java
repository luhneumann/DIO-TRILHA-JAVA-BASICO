import java.util.Scanner;

/*Faça um programa que peça para 3 pessoas a sua idade, ao final o programa deverá verificar se a média de idade da turma varia entre 0 e 25, 26 e 60 e maior que 60; e então, dizer se a turma é jovem, adulta ou idosa, conforme a média calculada. */
public class mediaIdade {
  public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);

    int soma = 0;
    int media = 0;
    int count = 0;

    do {
      int idade = leitor.nextInt();
      count++;

      soma = soma + idade;

    } while (count < 3);

    media = soma / 3;

    if (media <= 25) {
      System.out.println("Jovem!");
    }
    if (media > 25 && media <= 60) {
      System.out.println("Adulta!");
    }
    if (media > 60) {
      System.out.println("Idosa!");
    }

  }
}
