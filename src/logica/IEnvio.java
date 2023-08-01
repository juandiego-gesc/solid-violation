package logica;

public interface IEnvio {

  void cargarMercancia();

  void rastrearPaquete();
  
  boolean permitidoEnAvion();

  int getTiempoEnvio();
  
  Integer getPrecio();

  String getTipo();
}
