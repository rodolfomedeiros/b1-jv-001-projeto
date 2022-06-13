package br.bb;

public class PessoaFisica extends Cliente {

    private String cpf;

    PessoaFisica(String nome, String cpf) {
        super(nome);
        this.cpf = cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCpf(String cpf) {
        return this.cpf;
    }
}
