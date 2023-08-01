package envio;

import logica.IEnvio;

public class EnvioMunicipal implements IEnvio{

    private final Integer precio;
    private final int tiempoEnvio = 12;
    private final String tipo = "Municipal";

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
    public int getTiempoEnvio() {
        return tiempoEnvio;
    }

    @Override
    public boolean permitidoEnAvion() {
        return false;
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
