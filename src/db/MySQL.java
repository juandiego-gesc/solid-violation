package db;

import logica.DB;
import logica.Envio;

public class MySQL implements DB {

    @Override
    public void guardarEnvioDB(Envio envio) {
        System.out.println("Guardando envio en MySQL");
    }

}
