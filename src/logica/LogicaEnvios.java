package logica;

import java.util.ArrayList;
import java.util.List;

public class LogicaEnvios {

  private final DB db;
  List<Envio> envios;

  public LogicaEnvios(DB db) {
    this.db = db;
    envios = new ArrayList<>();
  }

  public void crearEnvio(Envio envio) {
    envios.add(envio);
    this.db.guardarEnvioDB(envio);
  }

  public void imprimirTiempoDeEnvio(){
    for (Envio envio : this.envios) {
      System.out.println("Tiempo Envio: " + envio.obtenerTiempoEnvio() + " horas");
    }
  }
}
