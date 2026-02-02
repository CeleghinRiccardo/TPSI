import java.util.Random;
import Exeptions.ArmaMalfunzionanteException;

public class Avatar {
    private String nome;
    private Arma arma;
    private double forzaAttacco;

    private Random r;

    public Avatar(String nome, Arma arma, double forzaAttacco) {
        this.nome = nome;
        this.arma = arma;
        this.forzaAttacco = forzaAttacco;
        this.r = new Random();
    }


    public void attaccaPostazione(PostazioneRDA postazioneRDA) throws ArmaMalfunzionanteException {
        double attackProb = r.nextDouble();

        if (attackProb <= 0.5) {
            postazioneRDA.riceviDanno(forzaAttacco);
        } else throw new ArmaMalfunzionanteException("L'arma " + arma + " di " + nome + " non funziona.");
    }
}