package com.bank.models;

public class ContaPoupanca extends ContaComRendimento {

    final public static double RENDIMENTO = 1.05;

    public ContaPoupanca(Cliente cliente){
        super(cliente, RENDIMENTO);
    }
}
