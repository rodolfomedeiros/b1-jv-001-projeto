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

            System.out.println(cliente.getId());
        });

        // TODO: implementar a listagem de clientes

        System.out.println("Aperte ENTER para continuar...");

        if(this.scanner.hasNextLine()) {
            this.scanner.nextLine();
            navigator.goBack();
        }
    }
}
