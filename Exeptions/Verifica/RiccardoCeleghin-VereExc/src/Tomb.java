import Exeptions.OutOfTourchesExeption;
import Exeptions.TrapExeption;

public class Tomb {
    private int nCorridoio, nProb;
    private Explorer explorer= new Explorer("Riccardo", 10);
    private int torcePerse;
    private int tourcess;

    public int getTourcess() {
        return explorer.getnTorce();
    }

    public int getTorcePerse() {
        return torcePerse;
    }

    public void setTorcePerse(int torcePerse) {
        this.torcePerse = torcePerse;
    }

    public void setnProb(int nProb) {
        this.nProb = nProb;
    }

    public int getnProb() {
        return nProb;
    }

    public Tomb() {
        this.nCorridoio = 1;
    }

    public int getnCorridoio() {
        return nCorridoio;
    }

    public void setnCorridoio(int nCorridoio) {
        this.nCorridoio = nCorridoio;
    }

    public void avanzaCorridoio() {
        setnCorridoio(getnCorridoio()+1);
        explorer.setnTorce(explorer.getnTorce() - 1);
        setTorcePerse((int)(Math.random()*3));
        if (explorer.getnTorce() < 0) {
            throw new OutOfTourchesExeption("FINE: Torce eaurite al corridoio "+(getnCorridoio()-1));

        } else if (nCorridoio==16) {
            System.out.println("Sei arrivato al corridoio finale, HAI   VINTO ");
        }else {
            System.out.println("Corridoio: "+getnCorridoio()+" avanzato. Torce rimanenti: "+explorer.getnTorce());
        }
    }

    public void trap() throws TrapExeption {
        setnProb((int)(Math.random()*100)-1);

        if(getnProb()<=40){
            explorer.setnTorce(explorer.getnTorce()-getTorcePerse());
            throw new TrapExeption("Corridoio: "+ getnCorridoio() + " TRAPPOLA! Perse "+ getTorcePerse()+" torce. Torce rimanenti: "+explorer.getnTorce());

        }
    }
}
