package logica;

public interface IEnvio {

  void cargarMercancia();

  void rastrearPaquete();

  void printTiempoEnvio();

  boolean permitidoEnAvion();

  Integer getPrecio();
}
