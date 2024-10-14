package ordenpc;

import modelo.Monitor;
import modelo.Raton;
import modelo.Teclado;
import modelo.Computadora;
import servicio.Orden;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hola Mundo");
        
        Teclado tecladoDell = new Teclado("usb", "Dell");
        Teclado tecladoLenovo = new Teclado("bluetooth", "Lenovo");
        
        Raton ratonDell = new Raton("usb", "Dell");
        Raton ratonLenovo = new Raton("bluetooth", "Lenovo");
        
        Monitor monitorDell = new Monitor("Dell", 24);
        Monitor monitorLenovo = new Monitor("Lenovo", 24);
        
        System.out.println("-------------------------");
        System.out.println(tecladoDell);
        System.out.println(tecladoLenovo);
        System.out.println("-------------------------");
        System.out.println(ratonDell);
        System.out.println(ratonLenovo);
        System.out.println("-------------------------");
        System.out.println(monitorDell);
        System.out.println(monitorLenovo);
        System.out.println("-------------------------");
        
        //-----------
        Computadora computadoraDell = new Computadora (
                "Computadora Dell",
                monitorDell, //lo puso automatico
                tecladoDell, //lo puso automatico
                ratonDell //lo puso automatico
        );
        Computadora computadoraLenovo = new Computadora (
                "Computadora Lenovo", 
                monitorLenovo, //lo cambie manual porque salia dell
                tecladoLenovo, 
                ratonLenovo
        );        
        System.out.println(computadoraDell);
        System.out.println(computadoraLenovo);
        System.out.println("-------------------------");
        
        //-----------
        Orden orden1 = new Orden();
        orden1.agregarComputadora(computadoraDell);
       // Orden orden2 = new Orden();
        orden1.agregarComputadora(computadoraLenovo);
        
        orden1.mostrarOrden(); 
       
        System.out.println(orden1);
       // System.out.println(orden2);
        
    }
}
