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
        System.out.println("Cargando Mercancia Internacional");
    }

    @Override
    public void rastrearPaquete() {
        // Rastreando Paquete
        System.out.println("Rastreando Paquete Internacional");
    }

    @Override
    public void printTiempoEnvio() {
        int tiempoEnvio = 190;
        System.out.println("Tiempo Envio: " + tiempoEnvio + " horas");
    }

    @Override
    public boolean permitidoEnAvion() {
        boolean precioAceptable = this.precio < 100;
        return precioAceptable;
    }

    @Override
    public Integer getPrecio() {
        return this.precio;
    }
}
