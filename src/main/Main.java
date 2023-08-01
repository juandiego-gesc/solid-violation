package main;

import logica.LogicaEnvios;
import envio.*;

public class Main {
    public static void main(String[] args) {
        LogicaEnvios logicaEnvios = new LogicaEnvios(new db.MySQL());

        logicaEnvios.crearEnvio(new EnvioMunicipal(5000));
        logicaEnvios.crearEnvio(new EnvioInternacional(25000));

        logicaEnvios.imprimirTiempoDeEnvio();
    }
}

