package com.bank.models;

import com.bank.data.Entity;

import java.time.LocalDate;

public abstract class Cliente extends Entity {
    protected String nome;
    protected LocalDate createdAt;

    protected TipoPessoa tipo;

    Cliente(String nome) {
        this.nome = nome;
        this.createdAt = LocalDate.now();
    }

    public Boolean isPessoaFisica(){
        return this.tipo == TipoPessoa.PESSOA_FISICA;
    }

    public Boolean isPessoaJuridica(){
        return this.tipo == TipoPessoa.PESSOA_JURIDICA;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return this.nome;
    }

    public LocalDate getCreatedAt() {
        return this.createdAt;
    }
}
