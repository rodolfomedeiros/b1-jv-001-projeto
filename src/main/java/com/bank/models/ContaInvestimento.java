package com.bank.models;

public class ContaInvestimento extends ContaComRendimento{
    // Implementar:
    // Se durante a criação, o cliente for PJ, o rendimento deve ser o default + 2%
    // Consultar saldo

    final public static double RENDIMENTO = 1.10;
    final public static double PJ_RENDIMENTO_EXTRA = 1.02;

    public ContaInvestimento(Cliente cliente){
        super(cliente, RENDIMENTO);
        this.tipo = TipoConta.CONTA_INVESTIMENTO;
    }

    @Override
    public void rende(){
        setSaldo(getSaldo()*getTaxaRendimento());
        if(cliente.isPessoaJuridica()){
            setSaldo(getSaldo()*PJ_RENDIMENTO_EXTRA);
        }
    }
}
