package modelo;

public class Teclado extends DispositivoEntrada{
    
    private final int idTeclado; //todo tipo final se debe inicializar rapido
    private static int contadorTeclado;//contador para incrementar
    
    //public Teclado (){};

    public Teclado(
            String tipoEntrada,
            String marca
    ) {
        super(tipoEntrada, marca);
        //acá debo inicializar para aplicar el contador
        //parte en 1 por el ++ y aumenta de 1 en 1
        idTeclado = ++contadorTeclado; //con esto se hace unico
    }

    @Override
    public String toString() {
        return "Teclado{" 
                + "idTeclado=" + idTeclado 
                + '}'
                + super.toString();
    }

}
