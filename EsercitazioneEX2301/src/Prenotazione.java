import Exeptions.TelefonoNonValidoException;

public class Prenotazione {

    private int numeroPosto;
    private String telefono;

    public Prenotazione(int numeroPosto, String telefono)
            throws TelefonoNonValidoException {

        if (telefono.length() != 10) {
            throw new TelefonoNonValidoException("Telefono non valido");
        }

        for (int i = 0; i < telefono.length(); i++) {
            if (!Character.isDigit(telefono.charAt(i))) {
                throw new TelefonoNonValidoException("Telefono non valido");
            }
        }

        this.numeroPosto = numeroPosto;
        this.telefono = telefono;
    }
}
