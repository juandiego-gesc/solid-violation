package envio;

import logica.Envio;

public class EnvioInternacional implements Envio {

    private final Integer precio;

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
    public int obtenerTiempoEnvio() {
        return 190;
    }

    @Override
    public boolean permitidoEnAvion() {
        return this.precio < 100;
    }

    @Override
    public Integer obtenerPrecio() {
        return this.precio;
    }

    @Override
    public String obtenerTipo() {
        return "Internacional";
    }
}
