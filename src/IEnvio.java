public interface IEnvio {

  void cargarMercancia();

  void rastrearPaquete();

  void saveEnvioDB(Envio envio);

  void printTiempoEnvio();

  boolean permitidoEnAvion();
}
