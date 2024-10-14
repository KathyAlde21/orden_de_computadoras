//documentado con Javadoc
package modelo;

/**
 * Clase padre de raton y teclado
 * 
 * @author Kathy
 * @version 0.0.1
 * 
 */
public class DispositivoEntrada {

    /**
     * Tipo de entrada
     */
    private String tipoEntrada;
    /**
     * Marca del dispositivo
     */
    private String marca;
    
    
    public DispositivoEntrada(){};

    //en el constructor con texto si hago /** y bajo autocompleta
    /**
     * Datos de nuevo dispositivo de entrada
     * 
     * @param tipoEntrada
     * @param marca 
     */
    public DispositivoEntrada(
            String tipoEntrada,
            String marca
    ) {
        this.tipoEntrada = tipoEntrada;
        this.marca = marca;
    }
    
    //----------------
    //en el getter y setter si hago /** y bajo autocompleta
    /**
     * Se obtiene el tipo de entrada
     * 
     * @return Tipo de entrada
     */
        public String getTipoEntrada() {
        return tipoEntrada;
    }
        
    /**
     * Modifica el Tipo de entrada
     * 
     * @param tipoEntrada 
     */
    public void setTipoEntrada(String tipoEntrada) {
        this.tipoEntrada = tipoEntrada;
    }

    /**
     * Se obtiene la marca del dispositivo
     * @return Marca del dispositivo
     */
    public String getMarca() {
        return marca;
    }

    /**
     * Modifica la marca del dispositivo
     * @param marca Marca del dispositivo
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    //----------------
    /**
     * Retorna los datos del dispositivo de entrada
     * @return Datos de clase
     */
    @Override
    public String toString() {
        return "DispositivoEntrada{" + "tipoEntrada=" + tipoEntrada 
                + ", marca=" + marca + '}';
    }
    
    
    
}
