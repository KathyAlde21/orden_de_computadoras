package modelo;

public class Monitor {
    
    private final int idMonitor;
    private String marca;
    private double tamanio;
    private static int contadorMonitores;

    //para que el id quede privado se separa en el constructor
    private Monitor(){
        idMonitor = ++contadorMonitores;
    }
    
    //resto del constructor
    public Monitor(
            String marca,
            double tamanio
    ) {
        this();
        this.marca = marca;
        this.tamanio = tamanio;
    }
    
    //---------------------

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getTamanio() {
        return tamanio;
    }

    public void setTamanio(double tamanio) {
        this.tamanio = tamanio;
    }

    public static int getContadorMonitores() {
        return contadorMonitores;
    }

    public static void setContadorMonitores(int contadorMonitores) {
        Monitor.contadorMonitores = contadorMonitores;
    }
    
    //-------------

    @Override
    public String toString() {
        return "Monitor{" 
                + "idMonitor=" + idMonitor 
                + ", marca=" + marca 
                + ", tamanio=" + tamanio 
                + '}';
    }
    
}
