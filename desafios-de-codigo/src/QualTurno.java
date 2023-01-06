import java.util.Scanner;

/*Faça um Programa que pergunte em que turno você estuda. Peça para digitar M-matutino ou V-Vespertino ou N- Noturno. Imprima a mensagem "Bom Dia!", "Boa Tarde!" ou "Boa Noite!" ou "Valor Inválido!", conforme o caso. */

public class QualTurno {
  public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);

    char turno = leitor.next().toUpperCase().charAt(0);
    char matutino = 'M';
    char vespertino = 'V';
    char noturno = 'N';

    if (turno == 'M') {
      System.out.println("Bom dia!");
    }
    if (turno == 'V') {
      System.out.println("Boa Tarde!");
    }
    if (turno == 'N') {
      System.out.println("Boa Noite!");
    }
  }
}
