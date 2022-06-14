package com.bank.presentation.frames.contas;

import java.util.HashMap;

import com.bank.models.Conta;
import com.bank.presentation.navigation.Frame;
import com.bank.presentation.navigation.Navigator;

public class Transferir extends Frame {
    private Double valor;
    private String codigoContaDestino;

    public Transferir(String key, Navigator navigator, HashMap<String, Object> params) {
        super(key, navigator, params);
    }

    @Override
    public void render() {
        printFrameTitle("TRANSFERIR");

        // Acessa a conta recebida como parâmetro no frame "Acessar Conta"
        Conta conta = (Conta)params.get("conta");
        
        System.out.print("Digite o valor a ser transferido: ");
        valor = scanner.nextDouble();
        scanner.nextLine();
        
        System.out.println("Digite o código da conta destino: ");
        codigoContaDestino = scanner.nextLine();

        // TODO: implementar o lógica de transferência

        System.out.println("Transferência realizada com sucesso!");
        System.out.println("Aperte ENTER para continuar...");

        if(this.scanner.hasNextLine()) {
            this.scanner.nextLine();
            navigator.goBack();
        }
    }
    
}
