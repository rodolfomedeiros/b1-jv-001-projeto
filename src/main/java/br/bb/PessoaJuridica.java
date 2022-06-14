package br.bb;

public class PessoaJuridica extends Cliente {

    private String cnpj;

    public PessoaJuridica(String nome, String cnpj) { // Mudei para "public"
        super(nome);
        this.cnpj = cnpj;
        this.tipo = TipoPessoa.PESSOA_JURIDICA;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return this.cnpj;
    }
}
