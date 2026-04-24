public class Sportello {
    private final int cassieri = 2;
    private int cassieriLiberi = cassieri;
    private final double MAX_ATTESA = 5000;
    private double tempoMancannte;
    public Sportello() {
    }

    public synchronized boolean accedi(Cliente c)throws InterruptedException{
        double inizio = System.currentTimeMillis();
        tempoMancannte = MAX_ATTESA;
        System.out.println("Cliente "+c.getName()+" prova ad essere servito");

        while(cassieriLiberi == 0){
            wait();
            tempoMancannte = tempoMancannte - inizio;
            if(tempoMancannte <=0){
                System.out.println("Tempo per il cliente "+c.getName()+"  esaurito!!!!");
                return false;
            }
            wait((long) tempoMancannte);
        }
        cassieriLiberi--;
        return true;
    }

    public synchronized boolean esci(Cliente c)throws InterruptedException{
        System.out.println("Cliente "+c.getName()+" servito, esco...");
        cassieriLiberi++;
        notifyAll();
        return true;
    }
}
