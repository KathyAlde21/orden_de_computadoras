package servicio;

import java.util.List;
import java.util.ArrayList;
import modelo.Computadora;


public class Orden {
    
    private final int idOrden;
    private final List<Computadora> computadoras; //esta pidiendo un array []
    private static int contadorOrdenes;
    
    public Orden (){
        computadoras = new ArrayList<>();
        this.idOrden = ++contadorOrdenes;
    }

    //-------------
    //METODOS
    public void agregarComputadora(Computadora computadora){
        computadoras.add(computadora);
    }
    
    public void mostrarOrden() {
        System.out.println("Orden #" + this.idOrden);
        System.out.println("Total de computadoras: " + computadoras.size());
        computadoras.forEach(System.out::println);
        
        
      /*  for (Computadora e : computadoras){
            System.out.println(e);}*/
      
    }
    
    @Override
    public String toString() {
        return "Orden{" 
                + "idOrden=" + idOrden 
                + ", computadoras=" + computadoras 
                + '}';
    }


    
    
}
