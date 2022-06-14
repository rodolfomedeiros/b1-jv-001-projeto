import java.util.Scanner;

import presentation.frames.Clientes;
import presentation.frames.Contas;
import presentation.frames.Home;
import presentation.frames.clientes.CadastrarCliente;
import presentation.frames.clientes.CadastrarClientePF;
import presentation.frames.clientes.CadastrarClientePJ;
import presentation.frames.clientes.ListarClientes;
import presentation.frames.contas.AbrirConta;
import presentation.frames.contas.AbrirContaCorrente;
import presentation.frames.contas.AbrirContaInvestimento;
import presentation.frames.contas.AbrirContaPoupanca;
import presentation.frames.contas.AcessarConta;
import presentation.frames.contas.Conta;
import presentation.frames.contas.Depositar;
import presentation.frames.contas.ListarContas;
import presentation.frames.contas.Sacar;
import presentation.frames.contas.Transferir;
import presentation.navigation.Navigator;

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
    navigator.addFrame("conta", Conta.class);
    navigator.addFrame("transferir", Transferir.class);
    navigator.addFrame("sacar", Sacar.class);
    navigator.addFrame("depositar", Depositar.class);

    navigator.init("home");

    while(!navigator.isEmpty()) {
        navigator.renderCurrentFrame();
    }

    new Scanner(System.in).close();
    System.exit(0);
  }
}
