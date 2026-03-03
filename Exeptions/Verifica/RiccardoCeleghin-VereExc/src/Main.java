import Exeptions.OutOfTourchesExeption;
import Exeptions.TrapExeption;

public class Main {
    public static void main (String [] args) throws InterruptedException {
        Tomb tomb = new Tomb();

        do{
            try{
                tomb.trap();
                try {
                    tomb.avanzaCorridoio();
                    Thread.sleep(1000);
                } catch (OutOfTourchesExeption e) {
                    System.out.println(e);
                }
            } catch (TrapExeption e) {
                System.out.println(e);
            }
        }while(tomb.getnCorridoio()<= 15 && tomb.getTourcess()>=0);
    }
}
