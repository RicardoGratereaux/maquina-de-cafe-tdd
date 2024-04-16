package com.MaquinaDeCafeTDD;

import java.util.HashMap;
import java.util.Map;

public class MaquinaDeCafe {
    public Cafetera cafe;
    public Vaso vasosPequenos;
    public Vaso vasosMedianos;
    public Vaso vasosGrandes;
    public Azucarero azucar;
    public Map<String, Vaso> vasosTamanos;

    public MaquinaDeCafe() {
        this.vasosTamanos = new HashMap<String, Vaso>();
    }

    public Vaso getTipoVaso(String tipoDeVaso) {
        return this.vasosTamanos.get(tipoDeVaso);
    }

    public void setVasosPequenos(Vaso vasosPequenos) {
        this.vasosPequenos = vasosPequenos;
        this.vasosTamanos.put("pequeno", vasosPequenos);
    }

    public void setVasosMedianos(Vaso vasosMedianos) {
        this.vasosMedianos = vasosMedianos;
        this.vasosTamanos.put("mediano", vasosMedianos);
    }

    public void setVasosGrandes(Vaso vasosGrandes) {
        this.vasosGrandes = vasosGrandes;
        this.vasosTamanos.put("grande", vasosGrandes);
    }

    public void setAzucar(Azucarero azucar) {
        this.azucar = azucar;
    }

    public void setCafe(Cafetera cafe) {
        this.cafe = cafe;
    }

    public Cafetera getCafe() {
        return cafe;
    }

    public Vaso getVasosGrandes() {
        return vasosGrandes;
    }

    public Vaso getVasosMedianos() {
        return vasosMedianos;
    }

    public Vaso getVasosPequenos() {
        return vasosPequenos;
    }

    public Azucarero getAzucar() {
        return azucar;
    }

    public String getVasoDeCafe(Vaso vaso, int cantidadDeVasos, int cantidadDeAzucar) {
        if (vaso.hasVasos(cantidadDeVasos) == false) {
            return "No hay Vasos";
        }

        if(this.cafe.hasCafe(vaso.getContenido()) == false) {
            return "No hay Cafe";
        }

        if(this.azucar.getCantidadAzucar() <= cantidadDeAzucar) {
            return "No hay Azucar";
        }

        cafe.giveCafe(vaso.getContenido());
        azucar.giveAzucar(cantidadDeAzucar);
        vaso.giveVasos(cantidadDeVasos);

        return "Su Cafe esta siendo preparado!!!";
        
    }
    
    
}
