package com.bank.models;

public class ContaComRendimento extends Conta{

    protected double taxaRendimento;

    public ContaComRendimento(Cliente cliente, double rendimento){
        super(cliente);
        this.taxaRendimento = rendimento;
    }

    @Override
    public void rende(){
        setSaldo(getSaldo() * taxaRendimento);
    };

    public double getTaxaRendimento(){
        return taxaRendimento;
    }

    public void setTaxaRendimento(double rendimento){
        this.taxaRendimento = rendimento;
    }
}
