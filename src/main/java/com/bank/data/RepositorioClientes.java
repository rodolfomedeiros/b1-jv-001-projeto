package com.bank.data;

import com.bank.models.Cliente;
import com.bank.models.PessoaFisica;
import com.bank.models.PessoaJuridica;

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

    public PessoaFisica obterPessoaFisica(String cpf) {
        Optional<Cliente> cliente =  this.data.values().stream()
            .filter(p -> p.isPessoaFisica())
            .filter(p -> {
                System.out.println(p);
                return ((PessoaFisica)p).getCpf().equals(cpf);
            })
            .findFirst();
        
        if(cliente.isPresent()) {
            return (PessoaFisica)cliente.get();
        } else {
            return null;
        }
    }

    public PessoaJuridica obterPessoaJuridica(String cnpj) {
        Optional<Cliente> cliente =  this.data.values().stream()
            .filter(p -> p.isPessoaJuridica())
            .filter(p -> {
                return ((PessoaJuridica)p).getCnpj().equals(cnpj);
            })
            .findFirst();
        
        if(cliente.isPresent()) {
            return (PessoaJuridica)cliente.get();
        } else {
            return null;
        }
    }
}
