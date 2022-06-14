package com.bank.presentation.frames.contas;

import java.util.List;

import com.bank.data.RepositorioContas;
import com.bank.models.Conta;
import com.bank.presentation.navigation.Frame;
import com.bank.presentation.navigation.Navigator;

public class ListarContas extends Frame {

    public ListarContas(String key, Navigator navigator) {
        super(key, navigator);
    }

    @Override
    public void render() {
        printFrameTitle("LISTAR CONTAS");
        
        List<Conta> contas = RepositorioContas.getInstancia().listarContas();

        contas.forEach(conta -> {
            System.out.println("-----------------------------------------");
            System.out.println("-- Cliente: " + conta.getCliente().getNome());
            System.out.println("-- Código da conta: " + conta.getCodigo());
            System.out.println("-----------------------------------------");
        });

        System.out.println("Aperte ENTER para continuar...");

        if(this.scanner.hasNextLine()) {
            this.scanner.nextLine();
            navigator.goBack();
        }
    }
}
