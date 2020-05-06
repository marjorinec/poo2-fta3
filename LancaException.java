public class LancaException {
  public static double retornaQuociente(int dividendo, int divisor) throws ArithmeticException {

		if (divisor == 0) {
			throw new ArithmeticException("O divisor não pode ser igual a zero!");
    }

		return dividendo/divisor;
	}
}