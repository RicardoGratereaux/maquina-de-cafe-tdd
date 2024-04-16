package com.MaquinaDeCafeTDD;

public class Cafetera {
    private int cantidadCafe;

    public Cafetera(int cantidadCafe) {
        this.cantidadCafe = cantidadCafe;
    }

    public void setCantidadCafe(int cantidadCafe) {
        this.cantidadCafe = cantidadCafe;
    }

    public int getCantidadCafe() {
        return cantidadCafe;
    }

    public boolean hasCafe(int cantidadCafe) {
        return cantidadCafe <= this.cantidadCafe;
    }

    public void giveCafe(int cantidadCafe) {
        this.cantidadCafe -= cantidadCafe;
    }
    
}
