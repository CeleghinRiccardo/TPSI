import Exeptions.NumeroNegativoException;

import java.util.ArrayList;
import java.util.List;

public class SessioneCalcolo {

    private Calcolatrice calc;
    private List storico;

    public SessioneCalcolo() {
        calc = new Calcolatrice();
        storico = new ArrayList();
    }

    public void eseguiDivisione(double a, double b) {
        try {
            double risultato = calc.divide(a, b);
            storico.add("Divisione: " + a + " / " + b + " = " + risultato);
        } catch (ArithmeticException e) {
            storico.add("Errore: divisione per zero");
        }
    }

    public void computeSqrt(double x) {
        try {
            double risultato = calc.sqrt(x);
            storico.add("Radice quadrata: " + x + " = " + risultato);
        } catch (NumeroNegativoException e) {
            storico.add("Errore: radice di numero negativo");
        }
    }

    public List getStorico() {
        return storico;
    }
}
