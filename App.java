import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
  static Scanner scan = new Scanner(System.in);
  static int dividendo, divisor;
  static double quociente;

  public static void main(String[] args) {
    System.out.println("Digite um número inteiro para ser utilizado como dividendo:");

    try {
      dividendo = scan.nextInt();
    } catch (InputMismatchException e) {
      System.out.println("Valor digitado não Numérico!");
      System.exit(0);
    }

    System.out.println("Digite um número inteiro para ser utilizado como divisor: ");

    try {
      divisor = scan.nextInt();
    } catch (InputMismatchException e) {
      System.out.println("Valor digitado não Numérico!");
      System.exit(0);
    }

    try {
      quociente = LancaException.retornaQuociente(dividendo, divisor);
      System.out.printf("Resultado da divisão: %.2f", quociente);
    }
  }
}