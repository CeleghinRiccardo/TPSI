import Exeptions.PostoGiaOccupatoException;
import Exeptions.PostoNonEsistenteException;
import Exeptions.TelefonoNonValidoException;

import java.util.ArrayList;

public class GestorePrenotazioni {

    private ArrayList prenotazioni;

    public GestorePrenotazioni() {
        prenotazioni = new ArrayList();
    }

    public void creaPrenotazione(Sala sala, int numeroPosto, String telefono) {

        try {
            sala.prenotaPosto(numeroPosto);
            Prenotazione p = new Prenotazione(numeroPosto, telefono);
            prenotazioni.add(p);
            System.out.println("Prenotazione effettuata");

        } catch (PostoNonEsistenteException e) {
            System.out.println("ERRORE GRAVE: posto inesistente");

        } catch (PostoGiaOccupatoException e) {
            System.out.println("Posto occupato, scegli un altro");

        } catch (TelefonoNonValidoException e) {
            System.out.println("Telefono non valido, riprova");
        }
    }
}
