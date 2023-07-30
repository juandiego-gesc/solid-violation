public abstract class Envio implements IEnvio {

  private Integer precio;

  Envio(Integer precio) {
    this.precio = precio;
  }

  public Integer getPrecio() {
    return precio;
  }
}