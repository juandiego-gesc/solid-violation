package db;

import logica.*;

public class PostgressDB implements DB{

    @Override
    public void saveEnvioDB(IEnvio envio) {
        System.out.println("Guardando envio en Postgress");
    }

}
