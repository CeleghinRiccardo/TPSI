import Exeptions.NumeroNegativoException;

public class Calcolatrice {

    public double divide(double a, double b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Divisione per zero");
        }
        return a / b;
    }

    public double sqrt(double x) throws NumeroNegativoException {
        if (x < 0) {
            throw new NumeroNegativoException("Numero negativo");
        }
        return Math.sqrt(x);
    }
}
