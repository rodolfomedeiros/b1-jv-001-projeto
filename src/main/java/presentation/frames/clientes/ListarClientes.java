package presentation.frames.clientes;

import br.bb.Cliente;
import br.bb.PessoaFisica;
import br.bb.PessoaJuridica;
import data.RepositorioClientes;
import presentation.navigation.Frame;
import presentation.navigation.Navigator;

import java.util.List;

public class ListarClientes extends Frame {

    public ListarClientes(String key, Navigator navigator) {
        super(key, navigator);
    }

    @Override
    public void render() {
        printFrameTitle("LISTAR CLIENTES");

        List<Cliente> listaClientes = RepositorioClientes.getInstancia().listarClientes();

        listaClientes.forEach(cliente -> {

            if(cliente.isPessoaFisica()){
                displayPessoaFisica((PessoaFisica) cliente);
            }else {
                displayPessoaJuridica((PessoaJuridica) cliente);
            }

        });
        //printFrameTitle("-----------------------");

        // TODO: implementar a listagem de clientes

        System.out.println("Aperte ENTER para continuar...");

        if(this.scanner.hasNextLine()) {
            this.scanner.nextLine();
            navigator.goBack();
        }
    }

    private void displayPessoaFisica(PessoaFisica pessoaFisica){
        System.out.println("Cliente: "+pessoaFisica.getNome());
        System.out.println("CPF: "+pessoaFisica.getCpf());
        System.out.println("-------------------------");
    }

    private void displayPessoaJuridica(PessoaJuridica pessoaJuridica){
        System.out.println("Cliente: "+pessoaJuridica.getNome());
        System.out.println("CNPJ: "+pessoaJuridica.getCnpj());
        System.out.println("-------------------------");
    }


}
