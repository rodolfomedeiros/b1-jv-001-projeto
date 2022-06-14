package com.bank.data;

import com.bank.models.Conta;

import java.util.*;

public class RepositorioContas {

    private static RepositorioContas instancia;

    public static RepositorioContas getInstancia(){
        if(instancia == null){
            instancia = new RepositorioContas();
        }
        return instancia;
    }

    private RepositorioContas() {

    }

    private Map<UUID, Conta> data = new HashMap<>();

    public Conta obterPorId(UUID id){
        return this.data.get(id);
    }
    public void salvar(Conta conta){
        if(conta.getId() == null){
            conta.setId(UUID.randomUUID());
            this.data.put(conta.getId(), conta);
        }else{
            this.data.put(conta.getId(), conta);
        }
    }

    public List<Conta> listarContas(){
        return new ArrayList<>(this.data.values());
    }

    public Conta obterContaPorCodigo(String codigo) {
        Optional<Conta> conta =  this.data.values().stream()
            .filter(c -> c.getCodigo().equals(codigo))
            .findFirst();
        
        if(conta.isPresent()) {
            return (Conta)conta.get();
        } else {
            return null;
        }
    }

}
