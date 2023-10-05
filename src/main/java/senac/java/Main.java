package senac.java;

import senac.java.Services.Servidor;
import senac.java.Views.Telas;

import senac.java.Views.Imprimir;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        Telas tela = new Telas();
        Servidor servidor = new Servidor();

        servidor.apiServer();
        tela.mostrarMenuInicial();
    }
}