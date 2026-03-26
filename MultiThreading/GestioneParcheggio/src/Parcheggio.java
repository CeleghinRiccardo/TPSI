public class Parcheggio {
    private int postiDisponibili;
    private final int CAPACITY;

    public Parcheggio(int capacity){
        this.CAPACITY=capacity;
        this.postiDisponibili=CAPACITY;
    }

    public synchronized void enter(Auto auto) throws InterruptedException{
        while(postiDisponibili==0){
            System.out.println("L'auto "+ auto.getName()+" in attesa. posti disponibili: "+postiDisponibili);
            wait();

        }

        postiDisponibili--;
    }
}
