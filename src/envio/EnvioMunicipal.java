package envio;

import logica.Envio;

public class EnvioMunicipal implements Envio {

    private final Integer precio;

    public EnvioMunicipal(Integer precio) {
        this.precio = precio;
    }

    @Override
    public void cargarMercancia() {
        // Cargando Mercancia
        System.out.println("Cargando Mercancia Municipal");
    }

    @Override
    public void rastrearPaquete() {
        // Rastreando Paquete
        System.out.println("Rastreando Paquete Municipal");
    }

    @Override
    public int obtenerTiempoEnvio() {
        return 12;
    }

    @Override
    public boolean permitidoEnAvion() {
        return false;
    }

    @Override
    public Integer obtenerPrecio() {
        return this.precio;
    }

    @Override
    public String obtenerTipo() {
        return "Municipal";
    }
}
