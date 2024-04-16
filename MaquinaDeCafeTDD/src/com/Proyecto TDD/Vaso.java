package com.MaquinaDeCafeTDD;

public class Vaso {
    private int cantidadVasos;
    public int contenido;

    public Vaso(int cantidadVasos, int contenido) {
        this.cantidadVasos = cantidadVasos;
        this.contenido = contenido;
    }

    public void setCantidadVasos(int cantidadVasos) {
        this.cantidadVasos = cantidadVasos;
    }

    public int getCantidadVasos() {
        return cantidadVasos;
    }

    public void setContenido(int contenido) {
        this.contenido = contenido;
    }

    public int getContenido() {
        return contenido;
    }

    public boolean hasVasos(int cantidadVasos) {
        return cantidadVasos <= this.cantidadVasos;
    }

    public void giveVasos(int cantidadVasos) {
        this.cantidadVasos -= cantidadVasos;
    }
    
}
