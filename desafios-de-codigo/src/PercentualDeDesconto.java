/*O gerente de uma loja resolveu aplicar descontos em todos os seus produtos! A tarefa é calcular a Porcentagem de Desconto aplicada a esses produtos. 
 * A entrada deverá ser feita por dois valores M e D, onde a primeira linha deverá receber o valor marcado do produto, 
 * e na segunda linha o valor do produto com o desconto já aplicado.
 * A saída deverá retornar o percentual de desconto que foi aplicado no produto, conforme exemplo abaixo.
 */

import java.util.Scanner;

public class PercentualDeDesconto {

  public static void main(String args[]) {
    Scanner input = new Scanner(System.in);

    int M = input.nextInt();
    int D = input.nextInt();

    int descontoReal = M - D;
    int descontoPercentual = (descontoReal * 100) / M;

    System.out.println("O desconto foi de " + descontoPercentual + "%");

  }
}