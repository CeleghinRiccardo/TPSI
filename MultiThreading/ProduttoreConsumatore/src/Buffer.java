public class Buffer {
    private int valore;

    final int BUFFERSIZE = 1;
    private int numItems = 0;

    public synchronized int getValore() throws InterruptedException {

        if (numItems == 0) wait();

        this.numItems--;
        System.out.print(" C:" + valore);
        notify();
        return valore;
    }

    public synchronized void setValore(int newVal) throws InterruptedException {

        if (numItems == BUFFERSIZE) wait();


        this.valore = newVal;
        this.numItems++;
        System.out.print(" P:" + valore);
        notify();
    }

}
