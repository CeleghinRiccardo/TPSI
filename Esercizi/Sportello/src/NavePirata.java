import Expetions.NaveAffondataExeption;

public class NavePirata extends Nave{
    private int cannonPower;

    public NavePirata(String name, int scafo, int cannonPower){
        super(name, scafo);
        this.cannonPower=cannonPower;
    }

    @Override
    public void takeDamage(int damage) {
        if(damage<0) throw new IllegalArgumentException("Il danno deve essere positivo");
        setScafo(getScafo() - damage);
        if(getScafo() < 0){
            throw new NaveAffondataExeption(getName());
        }
    }

    @Override
    public void shoot(Nave nave) {
        nave.takeDamage(cannonPower);
    }
}
