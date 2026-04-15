import java.util.Random;

public class Treno extends Thread{
    private int nID;
    private String dest;
    private int tempo;

    public int getnID() {
        return nID;
    }

    public Treno(int nID, String dest){
        this.nID=nID;
        this.dest=dest;
        this.tempo=(int)(Math.random()*4+2);
    }

}
