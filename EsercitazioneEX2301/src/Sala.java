import Exeptions.PostoGiaOccupatoException;
import Exeptions.PostoNonEsistenteException;

import java.util.ArrayList;

public class Sala {

    private ArrayList posti;

    public Sala(int numeroPosti) {
        posti = new ArrayList();
        for (int i = 0; i < numeroPosti; i++) {
            posti.add(false);
        }
    }

    public void prenotaPosto(int numeroPosto)
            throws PostoNonEsistenteException, PostoGiaOccupatoException {

        if (numeroPosto < 0 || numeroPosto >= posti.size()) {
            throw new PostoNonEsistenteException("Posto inesistente");
        }

        if ((Boolean) posti.get(numeroPosto)) {
            throw new PostoGiaOccupatoException("Posto già occupato");
        }

        posti.set(numeroPosto, true);
    }
}
