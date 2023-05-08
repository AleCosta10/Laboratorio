package ar.org.centro8.test;

import ar.org.centro8.entities.AutoClasico;
import ar.org.centro8.entities.AutoNuevo;
import ar.org.centro8.entities.Colectivo;

public class VehiculoTest {
    public static void main(String[] args) {
        System.out.println(" ");   
        System.out.println("--AutoClasico1--");
        AutoClasico ac1 = new AutoClasico("Rojo", "Fiat", "Palio", 150000);
        System.out.println(ac1);
        System.out.println(" ");

        System.out.println("--AutoClasico2 Sin Precio y con Radio --");
        AutoClasico ac2 = new AutoClasico("Gris", "Vw", "Gol", "Philips", 20);
        System.out.println(ac2);
        System.out.println(" ");

        System.out.println("------ Agregar Una Radio a AutoClasico1 -------");
        ac1.agregarRadio("Yamaha", 19);
        System.out.println(ac1);
        System.out.println(" ");

        System.out.println("-- AutoNuevo1 con Precio --");
        AutoNuevo an1 = new AutoNuevo("Azul", "Ford", "Fiesta", 10000, "Pionner", 18);
        System.out.println(an1);
        System.out.println(" ");

        System.out.println("-- AutoNuevo2 Sin Precio --");
        AutoNuevo an2 = new AutoNuevo("Negro", "Peugeot", "308", "Pionner", 18);
        System.out.println(an2);
        System.out.println(" ");
       
        System.out.println("-------Colectivo------");
        Colectivo cc1 = new Colectivo("Verde", "Mercedez Benz", "30 pax");
        System.out.println(cc1);
        System.out.println(" ");

        System.out.println("------- Colectivo2 Con Precio y Radio ------");
        Colectivo cc2 = new Colectivo("Blanco", "VW", "45 pax");
        System.out.println(cc2);
        System.out.println(" ");

        System.out.println("----Agregar Radio a colectivo----");
        cc1.agregarRadio("Fender", 20);
        System.out.println(cc1);
        
        System.out.println(" ");
        System.out.println("----- Fin -----");
        System.out.println(" ");
        System.out.println(" Alejandro Costa ");
        System.out.println(" ");





    }

}
