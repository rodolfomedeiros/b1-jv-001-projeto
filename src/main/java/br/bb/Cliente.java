package br.bb;

import java.time.LocalDate;
import java.util.Date;

public abstract class Cliente {
    private String nome;
    private LocalDate createdAt;

    Cliente(String nome) {
        this.nome = nome;
        this.createdAt = LocalDate.now();
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
