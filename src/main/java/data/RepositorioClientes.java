package data;

import br.bb.Cliente;

import java.util.*;

public class RepositorioClientes {

    private static RepositorioClientes instancia;

    public static RepositorioClientes getInstancia(){
        if(instancia == null){
            instancia = new RepositorioClientes();
        }
        return instancia;
    }

    private RepositorioClientes() {

    }
    private Map<UUID, Cliente> data = new HashMap<>();

    public Cliente obterPorId(UUID id){
          return this.data.get(id);
    }
    public void salvar(Cliente cliente){
        if(cliente.getId() == null){
            cliente.setId(UUID.randomUUID());
            this.data.put(cliente.getId(), cliente);
        }else{
            this.data.put(cliente.getId(), cliente);
        }
    }

    public List<Cliente> listarClientes(){
        return new ArrayList<>(this.data.values());
    }
}
