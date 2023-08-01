package db;

import logica.*;

public class PostgressDB implements DB{

    @Override
    public void guardarEnvioDB(Envio envio) {
        System.out.println("Guardando envio en Postgress");
    }

}
