package br.bb;

abstract public class Cliente {
    private  String nome;
    public enum TipoPessoa {
            PF, PJ
    }

    private TipoPessoa tipoPessoa;

    public TipoPessoa getTipoPessoa() {
        return tipoPessoa;
    }

    public void setTipoPessoa(TipoPessoa tipoPessoa) {
        this.tipoPessoa = tipoPessoa;
    }
}
