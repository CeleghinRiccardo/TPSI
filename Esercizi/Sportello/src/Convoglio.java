import Expetions.ConvoglioSbandatoExeption;

import java.util.ArrayList;

public class Convoglio {
    private ArrayList<NaveMercantile> mercantile;
    private Fregata fregata;

    private double distance;

    public Convoglio(ArrayList<NaveMercantile> navi, Fregata fregata) {
        this.mercantile = navi;
        this.fregata = fregata;
    }

    public void step(int steps){
        distance -= steps;
    }

    public void checkConvoy()throws ConvoglioSbandatoExeption{
        int count = 0;
        for(Nave nave : mercantile){
            if(!nave.isAlive()){
                count++;
            }
        }
        if(count>mercantile.size()/2) throw new ConvoglioSbandatoExeption("Convoglio sbandato, HAI PERSO");
    }
}
