import Expetions.MunizioniEsauriteExeption;

public class Fregata extends Nave{


    private int cannoniOperativi, munizioni;
    public Fregata(String name, int scafoIniziale, int cannoniOperativi, int munizioni) {
        super(name, scafoIniziale);
        this.cannoniOperativi=cannoniOperativi;
        this.munizioni=munizioni;
    }

    @Override
    public void takeDamage(int damage) {

    }

    public void foo(){
        if(Math.random()<0.20){
            cannoniOperativi++;
            System.out.println(getName() +"cannone ripristinato: Cannoni Operativi: "+ cannoniOperativi);
        }
    }

    public void defend(Nave target)throws MunizioniEsauriteExeption {
        if(munizioni<0) throw new MunizioniEsauriteExeption(getName()+"munizioni Esautie");

        munizioni--;
        target.takeDamage(cannoniOperativi*5);
    }


    @Override
    public void shoot(Nave nave) {
        if (munizioni<0) return;

        munizioni--;
        nave.takeDamage(cannoniOperativi *5);
    }
}
