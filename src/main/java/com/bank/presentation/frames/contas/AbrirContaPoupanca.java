package com.bank.presentation.frames.contas;

import com.bank.data.RepositorioClientes;
import com.bank.data.RepositorioContas;
import com.bank.models.Conta;
import com.bank.models.ContaPoupanca;
import com.bank.models.PessoaFisica;
import com.bank.presentation.navigation.Frame;
import com.bank.presentation.navigation.Navigator;

public class AbrirContaPoupanca extends Frame {

    public AbrirContaPoupanca(String key, Navigator navigator) {
        super(key, navigator);
    }

    @Override
    public void render() throws Exception{
        printFrameTitle("ABRIR CONTA POUPANÇA");

        System.out.println("Digite o CPF:");
        String cpf = this.scanner.nextLine();

        PessoaFisica cliente = RepositorioClientes.getInstancia().obterPessoaFisica(cpf);

        if(cliente == null) {
            throw new Exception("Cliente não encontrado!!!!");
        }

        Conta conta = new ContaPoupanca(cliente);

        RepositorioContas.getInstancia().salvar(conta);

        System.out.println("Codigo da conta: " + conta.getCodigo());

        System.out.println("Conta poupança aberta com sucesso!");
        System.out.println("Aperte ENTER para continuar...");

        if(this.scanner.hasNextLine()) {
            this.scanner.nextLine();
            navigator.goBack();
        }
    }
}
