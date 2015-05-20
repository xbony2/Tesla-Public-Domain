package me.modforgery.tesla.api.power;

public class PoweredTile {

    public int plasma;
    public int maxPlasma;

    public PoweredTile() {
        maxPlasma = 1000;
    }

    public PoweredTile(int maxPlasmaStored) {
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
