package br.bb;

public class PessoaJuridica extends Cliente {

    private String cnpj;

    PessoaJuridica(String nome, String cnpj) {
        super(nome);
        this.cnpj = cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getCnpj(String cnpj) {
        return this.cnpj;
    }
}
