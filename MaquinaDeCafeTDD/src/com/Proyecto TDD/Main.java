package com.MaquinaDeCafeTDD;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Cafetera cafetera = new Cafetera(50);
        Vaso vasosPequenos = new Vaso(5, 10);
        Vaso vasosMedianos = new Vaso(3, 20);
        Vaso vasosGrande = new Vaso(1, 30);
        Azucarero azucarero = new Azucarero(20);

        MaquinaDeCafe maquinaDeCafe = new MaquinaDeCafe();
        maquinaDeCafe.setCafe(cafetera);
        maquinaDeCafe.setVasosPequenos(vasosPequenos);
        maquinaDeCafe.setVasosMedianos(vasosMedianos);
        maquinaDeCafe.setVasosGrandes(vasosGrande);
        maquinaDeCafe.setAzucar(azucarero);
        printInfo();

        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.println("Selecciona el tipo de vaso de cafe que desea consumir (pequeno, mediano, grande) > ");
            String vaso = in.nextLine();
            boolean resultado = (vaso.equals("pequeno") || vaso.equals("mediano") || vaso.equals("grande"));

            if(!resultado) {
                System.out.println("Por favor, selecciona un tamano de vaso ");
                continue;
            }

            System.out.println("�Que cantidad de cucharas de azucar que deseas?");
            String cantidadDeAzucar = in.nextLine();

            if (!cantidadDeAzucar.matches("[0-9]+")) {
                System.out.println("Necesita introducir un numero, se repetiran las opciones");
                continue;
            }

            int azucar = Integer.parseInt(cantidadDeAzucar);
            Vaso vasoDeCafe = maquinaDeCafe.getTipoVaso(vaso);
            String resultadoMaquina = maquinaDeCafe.getVasoDeCafe(vasoDeCafe, 1, azucar);
            System.out.println(resultadoMaquina);

           
            System.out.println("------------------------------");
            try {
                Thread.sleep(3*1000);
             } catch (Exception e) {
                System.out.println(e);
             }
            System.out.println("Su cafe esta servido ");
            System.out.println();
            try {
                Thread.sleep(4*1000);
             } catch (Exception e) {
                System.out.println(e);
             }
            
            System.out.println("Desea salir de la cafetera (y/[n])> ");
            String response = in.nextLine();

            if(response.equals("y")) {
                System.out.println("Hasta la proxima!!");
                break;
            }
        }
    }

    public static void printInfo() {
        System.out.println("   *****MAQUINA DE CAF� ITLA*****");
        System.out.println("--SELECCIONE SU CAF� DE PREFERENCIA--");
        try {
            Thread.sleep(3*1000);
         } catch (Exception e) {
            System.out.println(e);
         }
        System.out.println();
        System.out.println("Cantidad de cafe en la maquina: 50 unidades");
        System.out.println("Cantidad de azucar en la maquina: 20 gramos");
        System.out.println("-------------------------------------------");
        try {
            Thread.sleep(2*1000);
         } catch (Exception e) {
            System.out.println(e);
         }
        System.out.println("                  **Tipos de Vasos**");
        System.out.println("Vasos Pequeno: 10 unidades de cafe. Cantidad de Vasos 5");
        System.out.println("Vasos Mediano: 20 unidades de cafe. Cantidad de Vasos 3");
        System.out.println("Vasos Grande: 30 unidades de cafe. . Cantidad de Vasos 1");
        
    }
}
