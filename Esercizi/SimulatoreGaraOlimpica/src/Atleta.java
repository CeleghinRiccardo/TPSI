public class Atleta extends Thread {

    private String name;
    private long startTime, endTime;
    private boolean disqualified;

    public Atleta(String name) {
        super(name); //setName(name);
    }

    @Override
    public void run() {
        startTime = System.currentTimeMillis();
        for (int i = 0 ; i <10; i++){
            System.out.println(getName() + ": Step "+(i+1));
            try {
                sleep(300 + (int)(Math.random()*500));
            } catch (InterruptedException e) {
                disqualified=true;
                System.out.println(getName() + "ritirato / qualificato");
                break;
            }
        }

        endTime = System.currentTimeMillis();
    }

    public long getRaceTime(){
        return endTime - startTime;
    }

    public boolean getDisqalified(){
        return disqualified;
    }
}
