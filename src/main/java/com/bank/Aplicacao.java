package com.bank;

import java.util.Scanner;

import com.bank.presentation.frames.clientes.CadastrarClientePJ;
import com.bank.presentation.frames.contas.Investir;
import com.bank.presentation.frames.Clientes;
import com.bank.presentation.frames.Contas;
import com.bank.presentation.frames.Home;
import com.bank.presentation.frames.clientes.CadastrarCliente;
import com.bank.presentation.frames.clientes.CadastrarClientePF;
import com.bank.presentation.frames.clientes.ListarClientes;
import com.bank.presentation.frames.contas.AbrirConta;
import com.bank.presentation.frames.contas.AbrirContaCorrente;
import com.bank.presentation.frames.contas.AbrirContaInvestimento;
import com.bank.presentation.frames.contas.AbrirContaPoupanca;
import com.bank.presentation.frames.contas.AcessarConta;
import com.bank.presentation.frames.contas.Depositar;
import com.bank.presentation.frames.contas.DetalhesConta;
import com.bank.presentation.frames.contas.ListarContas;
import com.bank.presentation.frames.contas.Sacar;
import com.bank.presentation.frames.contas.Transferir;
import com.bank.presentation.navigation.Navigator;

public class Aplicacao {

  public static void main(String[] args) {
    Navigator navigator = new Navigator();
    navigator.addFrame("home", Home.class);
    navigator.addFrame("clientes", Clientes.class);
    navigator.addFrame("contas", Contas.class);

    navigator.addFrame("cadastrar-cliente", CadastrarCliente.class);
    navigator.addFrame("listar-clientes", ListarClientes.class);
    navigator.addFrame("cadastrar-cliente-pf", CadastrarClientePF.class);
    navigator.addFrame("cadastrar-cliente-pj", CadastrarClientePJ.class);

    navigator.addFrame("abrir-conta", AbrirConta.class);
    navigator.addFrame("abrir-conta-poupanca", AbrirContaPoupanca.class);
    navigator.addFrame("abrir-conta-corrente", AbrirContaCorrente.class);
    navigator.addFrame("abrir-conta-investimento", AbrirContaInvestimento.class);
    navigator.addFrame("acessar-conta", AcessarConta.class);
    navigator.addFrame("listar-contas", ListarContas.class);
    navigator.addFrame("detalhes-conta", DetalhesConta.class);
    navigator.addFrame("transferir", Transferir.class);
    navigator.addFrame("sacar", Sacar.class);
    navigator.addFrame("depositar", Depositar.class);
    navigator.addFrame("investir", Investir.class);

    navigator.init("home");

    while(!navigator.isEmpty()) {
        navigator.renderCurrentFrame();
    }

    new Scanner(System.in).close();
    System.exit(0);
  }
}
