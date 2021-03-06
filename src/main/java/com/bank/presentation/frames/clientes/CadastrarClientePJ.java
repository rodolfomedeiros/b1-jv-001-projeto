package com.bank.presentation.frames.clientes;

import com.bank.models.PessoaJuridica;
import com.bank.data.RepositorioClientes;
import com.bank.presentation.navigation.Frame;
import com.bank.presentation.navigation.Navigator;

public class CadastrarClientePJ extends Frame {
    private String nome;
    private String cnpj;

    public CadastrarClientePJ(String key, Navigator navigator) {
        super(key, navigator);
    }

    @Override
    public void render() {
        printFrameTitle("CADASTRAR CLIENTE PESSOA JURÍDICA");

        PessoaJuridica pj = new PessoaJuridica(nome, cnpj);

        System.out.println();
        System.out.print("Nome: ");
        nome = scanner.nextLine();
        pj.setNome(nome);

        System.out.print("CNPJ: ");
        cnpj = scanner.nextLine();
        pj.setCnpj(cnpj);

        RepositorioClientes.getInstancia().salvar(pj);

        // TODO: implementar a criação de um cliente pessoa jurídica

        System.out.println("Cliente cadastrado com sucesso!");
        System.out.println("Aperte ENTER para continuar...");

        if(this.scanner.hasNextLine()) {
            this.scanner.nextLine();
            navigator.goBack();
        }
    }
}
