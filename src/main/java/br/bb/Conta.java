package br.bb;

abstract public class Conta {
    // Implementar:
    // Sacar - PJ tem taxa de 0,5% por saque
    // Tranferir - PJ tem taxa de 0,5% por

    private Cliente cliente;

    public void sacar() {};

    public void transferir(ContaSemRendimento destinatario) {};
}
