package com.bank.presentation.frames.contas;

import com.bank.data.RepositorioContas;
import com.bank.models.ContaCorrente;
import com.bank.models.ContaInvestimento;
import com.bank.models.ContaPoupanca;
import com.bank.presentation.navigation.Frame;
import com.bank.presentation.navigation.Navigator;

public class ListarContas extends Frame {

    public ListarContas(String key, Navigator navigator) {
        super(key, navigator);
    }

    @Override
    public void render() {
        printFrameTitle("LISTAR CONTAS");

        StringBuilder str = new StringBuilder();
        RepositorioContas.getInstancia().listarContas().stream().forEach(conta -> {
            if(conta instanceof ContaPoupanca){
                str.append("Conta Poupança: ");
            } else if (conta instanceof ContaCorrente){
                str.append("Conta Corrente: ");
            }else if (conta instanceof ContaInvestimento){
                str.append("Conta Investimento: ");
            }

            str.append("UUID");
            str.append(conta.getId());
            str.append(" ");
            str.append("Saldo: ");
            str.append(conta.getSaldo());
        });

        System.out.println("Aperte ENTER para continuar...");

        if(this.scanner.hasNextLine()) {
            this.scanner.nextLine();
            navigator.goBack();
        }
    }
}
