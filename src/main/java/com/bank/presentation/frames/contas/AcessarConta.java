package com.bank.presentation.frames.contas;

import java.util.HashMap;

import com.bank.data.RepositorioContas;
import com.bank.models.Conta;
import com.bank.presentation.navigation.Frame;
import com.bank.presentation.navigation.Navigator;

public class AcessarConta extends Frame {
    private String codigoConta;

    public AcessarConta(String key, Navigator navigator) {
        super(key, navigator);
    }

    @Override
    public void render() throws Exception {
        printFrameTitle("ACESSAR CONTA");
        System.out.print("Digite o código da conta (deixe vazio para voltar): ");

        codigoConta = this.scanner.nextLine();

        if (codigoConta.isEmpty()) {
            this.navigator.goBack();
            return;
        }

        Conta conta = RepositorioContas.getInstancia().obterContaPorCodigo(codigoConta);

        if(conta == null) {
            throw new Exception("Conta não encontrada!!");
        }

        // cria hash map para armazenar parametros de um frame
        HashMap<String, Object> params = new HashMap<>();
        params.put("conta", conta);

        // navega para o frame "detalhes-conta" injetando os parametros
        this.navigator.navigate("detalhes-conta", params);
    }
    
}
