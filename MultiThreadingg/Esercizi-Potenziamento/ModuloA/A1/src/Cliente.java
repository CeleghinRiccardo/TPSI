public class Cliente extends Thread{
    private Sportello s;
    private String nome;
    private int n= (int)(Math.random()*2000)+2000;

    public Cliente ( String nome, Sportello s){
        super(nome);
        this.s=s;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public void run() {
        try {
            if(s.accedi(this)){
                System.out.println("Cliente "+this.getName()+" viene servito...");
                Thread.sleep(n);
                s.esci(this);
            }
        } catch (InterruptedException e) {
            e.getMessage();
        }
    }
}
