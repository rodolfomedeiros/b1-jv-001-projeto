package com.bank.presentation.frames.contas;

import java.util.HashMap;

import com.bank.models.Conta;
import com.bank.presentation.navigation.Frame;
import com.bank.presentation.navigation.Navigator;

public class Investir extends Frame {
    private Double valor;

    public Investir(String key, Navigator navigator, HashMap<String, Object> params) {
        super(key, navigator, params);
    }

    @Override
    public void render() throws Exception {
        printFrameTitle("SACAR");

        // Acessa a conta recebida como parâmetro no frame "Acessar Conta"
        Conta conta = (Conta)params.get("conta");

        System.out.print("Digite o valor a ser investido: ");
        valor = scanner.nextDouble();
        scanner.nextLine();

        // TODO: implementar o lógica de investimento
        
        System.out.println("Investimento realizado com sucesso!");
        System.out.println("Aperte ENTER para continuar...");

        if(this.scanner.hasNextLine()) {
            this.scanner.nextLine();
            navigator.goBack();
        }
    }
    
}
