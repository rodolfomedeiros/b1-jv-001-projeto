package br.bb;

public class ContaInvestimento extends ContaComRendimento{
    // Implementar:
    // Se durante a criação, o cliente for PJ, o rendimento deve ser o default + 2%
    // Consultar saldo

    final public static double PJ_RENDIMENTO_EXTRA = 1.02;

    public ContaInvestimento(Cliente cliente, double rendimento){
        super(cliente, rendimento);
    }

    @Override
    public void rende(){
        setSaldo(getSaldo()*getTaxaRendimento());
        if(cliente instanceof PessoaJuridica){
            setSaldo(getSaldo()*PJ_RENDIMENTO_EXTRA);
        }
    }
}
