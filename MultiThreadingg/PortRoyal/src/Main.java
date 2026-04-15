public class Main {
    public static void main(String[] args) {
        Stiva s = new Stiva(5);
        final int N = 30;
        final int nPirati = 3;
        final int nScrivani = 2;

        Thread[] pirati = new Thread[nPirati];
        Thread[] scrivani = new Thread[nScrivani];

        for (int i = 0; i < nPirati; i++) {
            pirati[i] = new Thread(() -> {
                for (int count = 0; count < N/nPirati; count++) {
                    try {
                        s.deposit(new Item("Item" + count));
                    } catch (InterruptedException e) {
                        System.out.println(e.getMessage());
                        Thread.currentThread().interrupt();
                    }
                }
            });
        }





        for (int i = 0; i < nScrivani; i++) {
            scrivani[i] = new Thread(() -> {
                for (int j = 0; j < N/nScrivani; j++) {
                    try{
                        s.getItem();
                    }catch (InterruptedException e){
                        System.out.println(e.getMessage());
                        Thread.currentThread().interrupt();
                    }
                }
            });
        }


        for (Thread t : pirati) t.start();
        for (Thread t : scrivani) t.start();

        try {
            for (Thread t : pirati) t.join();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage() );
        }

        try{
            for (Thread t : scrivani) t.join();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}