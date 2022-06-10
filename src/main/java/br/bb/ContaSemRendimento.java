package br.bb;

abstract public class ContaSemRendimento {
    // Implementar:
    // Depositar
    // Investir
    // Consultar saldo

    public void depositar(double value) {};

    public void investir(ContaInvestimento destinatario) {};

    public double consultarSaldo() {
        return 0d;
    };
}
