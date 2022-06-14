package com.bank.models;

public class CodigoConta {
    private int sequencia;
    private static CodigoConta instancia;

    private CodigoConta() {
        sequencia = 0;
    }

    public static CodigoConta getInstancia() {
        if(instancia == null) {
            instancia = new CodigoConta();
        }
        return instancia;
    }

    public String getProximoCodigo() {
        sequencia++;
        return String.format("%06" + "d", sequencia);
    }
}
