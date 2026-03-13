import java.util.ArrayList;

public class Stiva {
    private ArrayList<Item> stiva;
    private final int MAX_SIZE;

    public Stiva(int maxSize){
        this.MAX_SIZE= maxSize;
        this.stiva = new ArrayList<>();
    }

    public synchronized void deposit (Item item) throws InterruptedException{
        if(stiva.size() == MAX_SIZE){
            System.out.println(Thread.currentThread().getName() + ": in attesa");
            wait();
        }
        stiva.add(item);
        System.out.println(Thread.currentThread().getName() + ": ha aggiunto " + item.toString());
        notifyAll();
    }

    public Item getItem()throws InterruptedException{
        while (stiva.isEmpty()) wait();
        Item i = stiva.get(0);
        System.out.println(Thread.currentThread().getName() + "ha prelevato " + i.toString());
        notifyAll();
        stiva.removeFirst();
        return i;
    }
}
