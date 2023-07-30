package envio;

import logica.IEnvio;

public class EnvioInternacional implements IEnvio{

    private Integer precio;

    public EnvioInternacional(Integer precio) {
        this.precio = precio;
    }

    @Override
    public void cargarMercancia() {
        // Cargando Mercancia
        System.out.println("Cargando Mercancia");
    }

    @Override
    public void rastrearPaquete() {
        // Rastreando Paquete
        System.out.println("Rastreando Paquete");
    }

    @Override
    public void printTiempoEnvio() {
        int tiempoEnvio = 190;
        System.out.println("Tiempo Envio: " + tiempoEnvio + " horas");
    }

    @Override
    public boolean permitidoEnAvion() {
        return true;
    }

    @Override
    public Integer getPrecio() {
        return this.precio;
    }
}
