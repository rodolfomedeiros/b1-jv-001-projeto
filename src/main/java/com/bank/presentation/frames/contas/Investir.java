package com.bank.presentation.frames.contas;

import java.util.HashMap;

import com.bank.models.Conta;
import com.bank.models.ContaInvestimento;
import com.bank.presentation.navigation.Frame;
import com.bank.presentation.navigation.Navigator;

public class Investir extends Frame {
    private Double valor;

    public Investir(String key, Navigator navigator, HashMap<String, Object> params) {
        super(key, navigator, params);
    }

    @Override
    public void render() throws Exception {
        printFrameTitle("INVESTIR");

        // Acessa a conta recebida como parâmetro no frame "Acessar Conta"
        Conta conta = (Conta)params.get("conta");

        System.out.println("SALDO ANTERIOR: "+conta.getSaldo());

        if(!conta.isContaInvestimento()){
            throw new Exception("Sua conta não é de investimento!");
         }

        ContaInvestimento contaInvestimento = (ContaInvestimento)conta;

        contaInvestimento.rende();

        System.out.println("SALDO ATUAL: "+conta.getSaldo());
        
        System.out.println("Investimento realizado com sucesso!");
        System.out.println("Aperte ENTER para continuar...");

        if(this.scanner.hasNextLine()) {
            this.scanner.nextLine();
            navigator.goBack();
        }
    }
    
}
