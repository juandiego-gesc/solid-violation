public class Principal {

  public static void main(String[] args) {
    Envio[] envios = {
        new EnvioMunicipal(5000),
        new EnvioInternacional(25000)
    };
    imprimirTiempoDeEnvio(envios);
  }

  public static void imprimirTiempoDeEnvio(Envio[] envios){
    for (Envio envio : envios) {
        envio.printTiempoEnvio();
    }
  }
}
