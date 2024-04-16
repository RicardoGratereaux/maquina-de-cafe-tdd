package com.MaquinaDeCafeTDD;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;

public class TestMaquinaDeCafe {
    Cafetera cafetera;
    Vaso vasosPequenos;
    Vaso vasosMedianos;
    Vaso vasosGrande;
    Azucarero azucarero;
    MaquinaDeCafe maquinaDeCafe;

    @Before
    public void setUp() {
        cafetera = new Cafetera(50);
        vasosPequenos = new Vaso(5, 10);
        vasosMedianos = new Vaso(5, 20);
        vasosGrande = new Vaso(5, 30);
        azucarero = new Azucarero(20);

        maquinaDeCafe = new MaquinaDeCafe();
        maquinaDeCafe.setCafe(cafetera);
        maquinaDeCafe.setVasosPequenos(vasosPequenos);
        maquinaDeCafe.setVasosMedianos(vasosMedianos);
        maquinaDeCafe.setVasosGrandes(vasosGrande);
        maquinaDeCafe.setAzucar(azucarero);
    }

    @Test
    public void deberiaDevolverUnVasoPequeno() {
        Vaso vaso = maquinaDeCafe.getTipoVaso("pequeno");

        assertEquals(maquinaDeCafe.vasosPequenos, vaso);
    }

    @Test
    public void deberiaDevolverUnVasoMediano() {
        Vaso vaso = maquinaDeCafe.getTipoVaso("mediano");

        assertEquals(maquinaDeCafe.vasosMedianos, vaso);
    }

    @Test
    public void deberiaDevolverUnVasoGrande() {
        Vaso vaso = maquinaDeCafe.getTipoVaso("grande");

        assertEquals(maquinaDeCafe.vasosGrandes, vaso);
    }

    @Test
    public void deberiaDevolverSiNoHayVasos() {
        Vaso vaso = maquinaDeCafe.getTipoVaso("pequeno");

        String resultado = maquinaDeCafe.getVasoDeCafe(vaso, 10, 2);

        assertEquals("No hay Vasos", resultado);
    }

    @Test
    public void deberiaDevolverSiNoHayCafe() {
        cafetera = new Cafetera(5);
        maquinaDeCafe.setCafe(cafetera);
        Vaso vaso = maquinaDeCafe.getTipoVaso("pequeno");

        String resultado = maquinaDeCafe.getVasoDeCafe(vaso, 1, 2);

        assertEquals("No hay Cafe", resultado);
    }

    @Test
    public void deberiaDevolverSiNoHayAzucar() {
        azucarero = new Azucarero(2);
        maquinaDeCafe.setAzucar(azucarero);
        Vaso vaso = maquinaDeCafe.getTipoVaso("pequeno");

        String resultado = maquinaDeCafe.getVasoDeCafe(vaso, 1, 3);

        assertEquals("No hay Azucar", resultado);
    }

    @Test
    public void deberiaRestarCafe() {
        Vaso vaso = maquinaDeCafe.getTipoVaso("pequeno");

        maquinaDeCafe.getVasoDeCafe(vaso,1,3);

        int resultado = maquinaDeCafe.getCafe().getCantidadCafe();

        assertEquals(40, resultado);
    }

    @Test
    public void deberiaRestarVaso() {
        Vaso vaso = maquinaDeCafe.getTipoVaso("pequeno");

        maquinaDeCafe.getVasoDeCafe(vaso,1,3);

        int resultado = maquinaDeCafe.getVasosPequenos().getCantidadVasos();

        assertEquals(4, resultado);
    }

    @Test
    public void deberiaRestarAzucar() {
        Vaso vaso = maquinaDeCafe.getTipoVaso("pequeno");

        maquinaDeCafe.getVasoDeCafe(vaso,1,3);

        int resultado = maquinaDeCafe.getAzucar().getCantidadAzucar();

        assertEquals(17, resultado);
    }

    @Test
    public void deberiaDevolverFelicitaciones() {
        Vaso vaso = maquinaDeCafe.getTipoVaso("pequeno");

        String resultado = maquinaDeCafe.getVasoDeCafe(vaso, 1, 3);

        assertEquals("Felicitaciones", resultado);
    }
    
}
