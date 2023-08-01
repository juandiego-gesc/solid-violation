package logica;

public interface Envio {

  void cargarMercancia();

  void rastrearPaquete();
  
  boolean permitidoEnAvion();

  int obtenerTiempoEnvio();
  
  Integer obtenerPrecio();

  String obtenerTipo();
}
