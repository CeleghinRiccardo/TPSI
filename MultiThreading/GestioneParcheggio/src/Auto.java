import java.util.Random;

public class Auto extends Thread{

    private Random random;
    private Parcheggio parcheggio;

    public Auto(Parcheggio parcheggio){
        this.random=new Random();
        this.parcheggio=parcheggio;
    }

    @Override
    public void run() {
        try {
            sleep(2000 + random.nextInt(3001));
            parcheggio.enter(this);
            sleep(3000+random.nextInt(5000));
        }catch (InterruptedException e){
            interrupt();
        }
    }
}
