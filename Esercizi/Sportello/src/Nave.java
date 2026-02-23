public abstract class Nave {
    private String name;
    private int scafo;

    public Nave(String name, int scafo) {
        this.name = name;
        this.scafo = scafo;
    }

    public abstract void takeDamage(int damage);

    public abstract void shoot(Nave nave);

    public int getScafo() {
        return scafo;
    }

    public void setScafo(int scafo) {
        this.scafo = scafo;
    }

    public String getName() {
        return name;
    }

    public boolean isAlive(){
        return scafo > 0;
    }
}
