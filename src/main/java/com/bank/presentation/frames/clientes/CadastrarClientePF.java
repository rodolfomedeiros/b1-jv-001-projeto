package com.bank.presentation.frames.clientes;

import com.bank.models.PessoaFisica;
import com.bank.data.RepositorioClientes;
import com.bank.presentation.navigation.Frame;
import com.bank.presentation.navigation.Navigator;

public class CadastrarClientePF extends Frame {
    private String nome;
    private String cpf;

    public CadastrarClientePF(String key, Navigator navigator) {
        super(key, navigator);
    }

    @Override
    public void render() {
        printFrameTitle("CADASTRAR CLIENTE PESSOA FÍSICA");

        PessoaFisica pf = new PessoaFisica(nome, cpf);

        System.out.println();
        System.out.print("Nome: ");
        nome = scanner.nextLine();
        pf.setNome(nome);

        System.out.print("CPF: ");
        cpf = scanner.nextLine();
        pf.setCpf(cpf);

        RepositorioClientes.getInstancia().salvar(pf);

        // TODO: implementar a criação de um cliente pessoa física

        System.out.println("Cliente cadastrado com sucesso!");
        System.out.println("Aperte ENTER para continuar...");

        if(this.scanner.hasNextLine()) {
            this.scanner.nextLine();
            navigator.goBack();
        }
    }
}
