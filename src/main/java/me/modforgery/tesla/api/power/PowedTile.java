package me.modforgery.tesla.api.power;


public class PowedTile {


    public int plasma;
    public int maxPlasma;

    public PowedTile() {
        maxPlasma = 1000;
    }

    public PowedTile(int maxPlasmaStored) {
        maxPlasma = maxPlasmaStored;
    }

    public int getPlasma() {
        return plasma;
    }

    public void setPlasma(int plasma) {
        this.plasma = plasma;
    }

    public int getMaxPlasma() {
        return maxPlasma;
    }

    public void setMaxPlasma(int maxPlasma) {
        this.maxPlasma = maxPlasma;
    }
}
