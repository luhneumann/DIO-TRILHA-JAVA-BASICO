
/*Elabore um programa que simule uma fila de atendimento bancário. O programa deve ler o nome de 3 pessoas (clientes do banco), armazenando-os em uma fila. */
import java.util.Scanner;

public class FilaDoBanco {
  public static void main(String[] args) {
    Scanner nome = new Scanner(System.in);

    String[] nomesFila = new String[3];

    for (int i = 0; i < nomesFila.length; i++) {
      String nomes = nome.next();
      nomesFila[i] = nomes;
    }
    System.out.println(nomesFila[0] + " - esta na posicao: " + 1);
    System.out.println(nomesFila[1] + " - esta na posicao: " + 2);
    System.out.println(nomesFila[2] + " - esta na posicao: " + 3);
  }
}
