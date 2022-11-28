package pt.uma.arq.entities;


import java.util.ArrayList;

public class Fleet{


    private ArrayList<Ship> frota;

    public Fleet() {
        this.frota = new ArrayList<Ship>();
    }

    public ArrayList<Ship> getFrota() {
        return frota;
    }

    public void addFrota(Ship naves){
        this.frota.add(naves);
    }
}



