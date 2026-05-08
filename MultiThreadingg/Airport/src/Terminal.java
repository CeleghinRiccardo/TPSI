import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Terminal {
    private int gateNazionali;
    private int gateInternazionali;


    private int gateInternazionaliLiberi;
    private int gateNazionaliLiberi;

    private final ReentrantLock lock;
    private Condition attendiInternazionali;
    private Condition attendiNazionali;


    public Terminal(int gateNazionali, int gateInternazionali) {
        this.gateInternazionaliLiberi = gateInternazionali;
        this.gateNazionaliLiberi = gateNazionali;

        this.gateNazionali = gateNazionali;
        this.gateInternazionali = gateInternazionali;
        this.lock= new ReentrantLock();
        this.attendiInternazionali = lock.newCondition();
        this.attendiNazionali = lock.newCondition();
    }

    public void occupaGateInternazionale(Volo v) throws InterruptedException{
        lock.lock();

        try {
            while (gateInternazionaliLiberi == 0) attendiInternazionali.await();

            gateInternazionaliLiberi--;
            System.out.println("[GATE-INTERNAZIONALE]: "+v.getName()+"occupa un gate"+
                    "(int.liberi: "+ gateInternazionaliLiberi+")");
        } finally {
            lock.unlock();
        }
    }

    public void rilasciaGateInternazionale(Volo v){
        lock.lock();

        try {
            gateInternazionaliLiberi++;
            System.out.println("[GATE-INTERNAZIONALE]: "+v.getName()+"lascia un gate"+
                    "(int.liberi: "+ gateInternazionaliLiberi+")");
            attendiInternazionali.signal();
        } finally {
            lock.unlock();
        }

    }

    public void occupaGateNazionale(Volo v) {
    }

    public void rilasciaGateNazionale(Volo v) {
    }
}
