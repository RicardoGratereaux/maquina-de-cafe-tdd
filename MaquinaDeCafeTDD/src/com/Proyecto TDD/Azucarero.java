package com.MaquinaDeCafeTDD;

public class Azucarero {
    private int cantidadAzucar;

    public Azucarero(int cantidadAzucar) {
        this.cantidadAzucar = cantidadAzucar;
    }

    public void setCantidadAzucar(int cantidadAzucar) {
        this.cantidadAzucar = cantidadAzucar;
    }

    public int getCantidadAzucar() {
        return cantidadAzucar;
    }

    public boolean hasAzucar(int cantidadAzucar) {
        return cantidadAzucar <= this.cantidadAzucar;
    }

    public void giveAzucar(int cantidadAzucar) {
        this.cantidadAzucar -= cantidadAzucar;
    }
    
}
