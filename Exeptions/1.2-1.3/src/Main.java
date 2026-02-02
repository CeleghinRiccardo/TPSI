public class Main {

    public static void main(String[] args) {

        Sala sala = new Sala(5);
        GestorePrenotazioni gestore = new GestorePrenotazioni();

        gestore.creaPrenotazione(sala, 2, "1234567890");
        gestore.creaPrenotazione(sala, 2, "0987654321");
        gestore.creaPrenotazione(sala, 10, "1234567890");
        gestore.creaPrenotazione(sala, 3, "12345");
    }
}
