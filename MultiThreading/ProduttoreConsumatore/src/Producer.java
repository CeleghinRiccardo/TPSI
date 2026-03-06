public class Producer extends Thread{
    private final Buffer buffer;

    public Producer(Buffer b){
        this.buffer= b;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            try {
                buffer.setValore(i);
            } catch (InterruptedException e) {

                throw new RuntimeException(e);
            }

        }
    }
}
