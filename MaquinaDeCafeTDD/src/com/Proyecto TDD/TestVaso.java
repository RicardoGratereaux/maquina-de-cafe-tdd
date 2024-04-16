package com.MaquinaDeCafeTDD;

import static org.junit.Assert.*;
import org.junit.Test;

public class TestVaso {

    @Test
    public void deberiaDevolverVerdaderosSiExistenVasos() {
        Vaso vasospequenos = new Vaso(2, 10);
        boolean resultado = vasospequenos.hasVasos(1);

        assertEquals(true, resultado);
    }

    @Test
    public void deberiaDevolverFalsoSiNoExistenVasos() {
        Vaso vasospequenos = new Vaso(1, 10);
        boolean resultado = vasospequenos.hasVasos(2);

        assertEquals(false, resultado);
    }

    @Test
    public void deberiaRestarCantidadDeVaso() {
        Vaso vasospequenos = new Vaso(5, 10);
        vasospequenos.giveVasos(1);

        assertEquals(4, vasospequenos.getCantidadVasos());
    }
    
}
