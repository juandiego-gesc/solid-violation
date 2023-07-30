package logica;

import java.util.ArrayList;
import java.util.List;

public class LogicaEnvios {

  private final DB db;
  List<IEnvio> envios;

  public LogicaEnvios(DB db) {
    this.db = db;
    envios = new ArrayList<>();
  }

  public void crearEnvio(IEnvio envio) {
    envios.add(envio);
    this.db.saveEnvioDB(envio);
  }

  public void imprimirTiempoDeEnvio(){
    for (IEnvio envio : this.envios) {
        envio.printTiempoEnvio();
    }
  }
}
