package db;

import logica.DB;
import logica.IEnvio;

public class MySQL implements DB {

    @Override
    public void saveEnvioDB(IEnvio envio) {
        System.out.println("Guardando envio en MySQL");
    }

}
