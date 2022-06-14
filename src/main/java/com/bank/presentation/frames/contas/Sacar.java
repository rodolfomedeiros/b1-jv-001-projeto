package com.bank.presentation.frames.contas;

import java.math.BigDecimal;
import java.util.HashMap;

import com.bank.models.Conta;
import com.bank.presentation.navigation.Frame;
import com.bank.presentation.navigation.Navigator;

public class Sacar extends Frame {
    private double valor;
    
    public Sacar(String key, Navigator navigator, HashMap<String, Object> params) {
        super(key, navigator, params);
    }

    @Override
    public void render() throws Exception {
        printFrameTitle("SACAR");

        Conta conta = (Conta)params.get("conta");

        System.out.printf("Saldo atual: R$ %.2f\n", conta.getSaldo());

        System.out.print("Digite o valor a ser sacado: ");
        valor = scanner.nextDouble();
        scanner.nextLine();

        if(valor > conta.getSaldo()) {
            throw new Exception("Saldo insulficiente!");
        }

        conta.sacar(valor);
        
        System.out.println("Saque realizado com sucesso!");
        System.out.println();
        System.out.printf("Novo saldo: R$ %.2f", conta.getSaldo());
        System.out.println();
        System.out.println("Aperte ENTER para continuar...");

        if(this.scanner.hasNextLine()) {
            this.scanner.nextLine();
            navigator.goBack();
        }
    }
    
}
