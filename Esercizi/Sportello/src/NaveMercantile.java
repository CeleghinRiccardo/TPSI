import Expetions.NaveAffondataExeption;

public class NaveMercantile extends Nave{

    private int carico;

    public NaveMercantile(String name, int scafo, int carico) {
        super(name, scafo);
        this.carico = carico;
    }

    @Override
    public void takeDamage(int damage) {


        setScafo(getScafo() - damage);

        if(Math.random() < 0.3){
            int loss= Math.min(carico, damage);
            this.carico -= loss;
            if(getScafo() < 0){
                throw new NaveAffondataExeption(getName());
            }
        }
    }

    @Override
    public void shoot(Nave nave) {

    }
}
