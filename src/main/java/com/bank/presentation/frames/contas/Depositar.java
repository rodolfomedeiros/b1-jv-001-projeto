package com.bank.presentation.frames.contas;

import java.util.HashMap;

import com.bank.models.Conta;
import com.bank.presentation.navigation.Frame;
import com.bank.presentation.navigation.Navigator;

public class Depositar extends Frame {
    private double valor;

    public Depositar(String key, Navigator navigator, HashMap<String, Object> params) {
        super(key, navigator, params);
    }

    @Override
    public void render() {
        printFrameTitle("DEPOSITAR");

        Conta conta = (Conta)params.get("conta");

        System.out.printf("Saldo atual: R$ %.2f\n", conta.getSaldo());
        System.out.print("Digite o valor a ser depositado: ");
        valor = scanner.nextDouble();
        scanner.nextLine();

        conta.depositar(valor);
        
        System.out.println("Depósito realizado com sucesso!");
        System.out.println();
        System.out.printf("Saldo atual: R$ %.2f\n", conta.getSaldo());
        System.out.println();
        System.out.println("Aperte ENTER para continuar...");

        if(this.scanner.hasNextLine()) {
            this.scanner.nextLine();
            navigator.goBack();
        }
    }
    
}
