package br.bb;

abstract public class Conta {
    // Implementar:
    // Sacar - PJ tem taxa de 0,5% por saque
    // Tranferir - PJ tem taxa de 0,5% por

    private Cliente cliente;
    private double saldo;

    public Conta(Cliente cliente){
        this.cliente = cliente;
        this.saldo = 0;
    }

    public void sacar(double valor) throws IllegalArgumentException{
        if(this.saldo >= valor){
                this.saldo -= valor;
        }else{
            throw new IllegalArgumentException("Valor inválido!");
        }
    }
    public void depositar(double valor) throws IllegalArgumentException{
        if(valor > 0){
            this.saldo += valor;
        }else{
            throw new IllegalArgumentException("Valor inválido!");
        }
    }

    public void transferir(Conta contaDestino, double valor) throws IllegalArgumentException {
        if(contaDestino != null){
            sacar(valor);
            contaDestino.depositar(valor);
        }else{
            throw new IllegalArgumentException("Conta de destino inválida!");
        }
    };

    public double getSaldo(){
        return this.saldo;
    }
    private void setSaldo(double saldo){
        this.saldo = saldo;
    }
}
