public class EnvioMunicipal extends Envio{
    final int tiempoEnvio = 12;
    final boolean permitidoEnAvion = true;

    EnvioMunicipal(Integer precio) {
        super(precio);
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
    public void saveEnvioDB(Envio envio) {
        // Guardando Envio en base de datos
        System.out.println("Guardando Envio en base de datos");
    }

    @Override
    public void printTiempoEnvio() {
        System.out.println("Tiempo Envio: " + tiempoEnvio + " horas");
    }

    @Override
    public boolean permitidoEnAvion() {
        return permitidoEnAvion;
    }
}
