package com.bank.presentation.frames.contas;

import com.bank.data.RepositorioClientes;
import com.bank.data.RepositorioContas;
import com.bank.models.*;
import com.bank.presentation.navigation.Frame;
import com.bank.presentation.navigation.Navigator;

public class AbrirContaInvestimento extends Frame {
    public AbrirContaInvestimento(String key, Navigator navigator) {
        super(key, navigator);
    }

    @Override
    public void render() throws Exception {
        printFrameTitle("ABRIR CONTA INVESTIMENTO");

        System.out.println("Selecione o tipo de pessoa:");
        System.out.println("1. Pessoa física");
        System.out.println("2. Pessoa jurídica");

        System.out.print("Digite a opção desejada: ");

        int option = this.scanner.nextInt();
        this.scanner.nextLine();

        switch(option) {
            case 1:
                abrirContaCorrenteParaPessoaFisica();
                break;
            case 2:
                abrirContaCorrenteParaPessoaJuridica();
                break;
            default:
                throw new Exception("Opcão inválida!!!!");
        }

        System.out.println("Conta investimento aberta com sucesso!");
        System.out.println("Aperte ENTER para continuar...");
        

        if(this.scanner.hasNextLine()) {
            this.scanner.nextLine();
            navigator.goBack();
        }
    }

    private void abrirContaCorrenteParaPessoaFisica() throws Exception {
        System.out.println("Digite o CPF:");

        String cpf = this.scanner.nextLine();

        PessoaFisica cliente = RepositorioClientes.getInstancia().obterPessoaFisica(cpf);

        if(cliente == null) {
            throw new Exception("Cliente não encontrado!!!!");
        }

        Conta conta = new ContaInvestimento(cliente);

        RepositorioContas.getInstancia().salvar(conta);

        System.out.println("Codigo da conta: " + conta.getCodigo());

    }

    private void abrirContaCorrenteParaPessoaJuridica() throws Exception {
        System.out.println("Digite o CNPJ:");

        String cnpj = this.scanner.nextLine();

        PessoaJuridica cliente = RepositorioClientes.getInstancia().obterPessoaJuridica(cnpj);

        if(cliente == null) {
            throw new Exception("Cliente não encontrado!!!!");
        }

        Conta conta = new ContaInvestimento(cliente);

        RepositorioContas.getInstancia().salvar(conta);

        System.out.println("Codigo da conta: " + conta.getCodigo());

    }
}
