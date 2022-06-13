package br.bb;

import java.util.Date;

abstract public class Cliente {
    private String nome;
    private Date createdAt;

    Cliente(String nome) {
        this.nome = nome;
        this.createdAt = new Date();
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome(String nome) {
        return this.nome;
    }

    public Date getCreatedAt() {
        return this.createdAt;
    }
}
