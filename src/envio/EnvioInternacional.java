package envio;

import logica.IEnvio;

public class EnvioInternacional implements IEnvio{

    private final Integer precio;
    private final int tiempoEnvio = 190;
    private final String tipo = "Internacional";

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
    public int getTiempoEnvio() {
        return tiempoEnvio;
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

    @Override
    public String getTipo() {
        return tipo;
    }
}
