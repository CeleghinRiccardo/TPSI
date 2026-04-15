import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Atleta atleta = new Atleta("Andrea");
        Atleta atleta2 = new Atleta("Luca");

        atleta.start();
        atleta2.start();



        //il thread che chiama questo il metodo attende che l'altro thread termini per avanzare
        try {
            Thread.sleep(2000);
            boolean r = new Random().nextBoolean();
            if(r){
                atleta.interrupt();
            }else{
                atleta2.interrupt();
            }

            atleta2.join();
            atleta.join();

            System.out.println(atleta.getName() + " : Tempo gara : " + atleta.getRaceTime());
            System.out.println(atleta2.getName() + " : Tempo gara : " + atleta2.getRaceTime());

        } catch (InterruptedException e) {

        }



    }
}