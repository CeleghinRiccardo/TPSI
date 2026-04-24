import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws InterruptedException{
        Sportello s =new Sportello();
        Cliente c0 = new Cliente("mario",s);
        Cliente c1 = new Cliente("luca",s);
        Cliente c2 = new Cliente("adolfo",s);
        Cliente c3 = new Cliente("mauri",s);
        Cliente c4 = new Cliente("frezza",s);
        Cliente c5 = new Cliente("fara",s);
        Cliente c6 = new Cliente("lavo",s);
        Cliente c7 = new Cliente("chris",s);

        c0.start();
        c1.start();
        c2.start();
        c3.start();
        c4.start();
        c5.start();
        c6.start();
        c7.start();

        c0.join();
        c1.join();
        c2.join();
        c3.join();
        c4.join();
        c5.join();
        c6.join();
        c7.join();

    }
}