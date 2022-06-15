package com.bank.models;

import com.bank.data.Entity;

public abstract class Conta extends Entity {
    // Implementar:
    // Sacar - PJ tem taxa de 0,5% por saque
    // Tranferir - PJ tem taxa de 0,5% por

    protected String codigo;
    protected Cliente cliente;
    protected double saldo;

    protected TipoConta tipo;

    public Conta(Cliente cliente) {
        this.cliente = cliente;
        this.saldo = 0;
        this.codigo = CodigoConta.getInstancia().getProximoCodigo();
    }

    public Boolean isContaComRendimento(){return this.tipo == TipoConta.CONTA_RENDIMENTO; }

    public Boolean isContaPoupanca(){
        return this.tipo == TipoConta.CONTA_POUPANCA;
    }

    public Boolean isContaCorrente(){
        return this.tipo == TipoConta.CONTA_CORRENTE;
    }

    public Boolean isContaInvestimento(){
        return this.tipo == TipoConta.CONTA_INVESTIMENTO;
    }

    public void sacar(double valor) throws IllegalArgumentException {
        if (this.saldo >= valor) {
            if(this.cliente.getClass() == PessoaJuridica.class){
                this.saldo -= (valor * 1.05);
            }else{
                this.saldo -= valor;
            }
        } else {
            throw new IllegalArgumentException("Valor inválido!");
        }
    }

    public void depositar(double valor) throws IllegalArgumentException {
        if (valor > 0) {
            this.saldo += valor;
        } else {
            throw new IllegalArgumentException("Valor inválido!");
        }
    }

    public void transferir(Conta contaDestino, double valor) throws IllegalArgumentException {
        if (contaDestino != null) {
            this.sacar(valor);
            contaDestino.depositar(valor);
        } else {
            throw new IllegalArgumentException("Conta de destino inválida!");
        }
    }

    public double getSaldo() {
        return this.saldo;
    }

    protected void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public String getCodigo() {
        return codigo;
    }
}
