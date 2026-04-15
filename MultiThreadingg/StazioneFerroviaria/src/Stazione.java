public class Stazione {
    private int nBinari;
    String nome;
    private int binariLiberi = nBinari;

    public Stazione(int nBinari, String nome) {
        this.nBinari = nBinari;
        this.nome = nome;
    }

    public synchronized void occupaBinario(Treno treno) throws InterruptedException{
        while(binariLiberi==0){
            System.out.println(treno.getnID()+" aspetta binario libero");
            wait();
        }
        binariLiberi--;
        System.out.println("binario occupato");
        notifyAll();
    }

    public synchronized void liberaBinario(Treno treno)throws InterruptedException{
        binariLiberi++;
        treno.interrupt();
    }
}

