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
    public void render() {
        printFrameTitle("ABRIR CONTA POUPANÇA");

        System.out.println("Digite o CPF:");
        String cpf = this.scanner.nextLine();

        PessoaFisica cliente = RepositorioClientes.getInstancia().obterPessoaFisica(cpf);

        Conta conta = new ContaPoupanca(cliente);

        RepositorioContas.getInstancia().salvar(conta);

        System.out.println("Conta poupança aberta com sucesso!");
        System.out.println("Aperte ENTER para continuar...");

        if(this.scanner.hasNextLine()) {
            this.scanner.nextLine();
            navigator.goBack();
        }
    }
}
