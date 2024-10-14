
package modelo;

public class Raton extends DispositivoEntrada{
    
    private final int idRaton;//todo tipo final se debe inicializar rapido
    private static int contadorRatones; //contador para incrementar
    
    //public Raton (){}

    public Raton(
            String tipoEntrada,
            String marca
    ) {
        super(tipoEntrada, marca);
        //acá debo inicializar para aplicar el contador
        //parte en 1 por el ++ y aumenta de 1 en 1
        idRaton = ++contadorRatones; //con esto se hace unico
    }

    @Override
    public String toString() {
        return "Raton{" 
                + "idRaton=" + idRaton 
                + '}'
                + super.toString();
    }

}
