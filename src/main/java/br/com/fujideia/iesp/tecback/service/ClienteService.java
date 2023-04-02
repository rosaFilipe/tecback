package br.com.fujideia.iesp.tecback.service;

import br.com.fujideia.iesp.tecback.model.Classificacao_Etaria;
import br.com.fujideia.iesp.tecback.model.Cliente;
import br.com.fujideia.iesp.tecback.model.Filme;
import br.com.fujideia.iesp.tecback.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service

public class ClienteService {
    @Autowired
    private ClienteRepository repository;

    public Cliente salvar(Cliente cliente){
        cliente = this.repository.save(cliente);
        return cliente;
    }

    public List<Cliente> listar(){
        return this.repository.findAll();
    }


    public Cliente consultarPorId(int id){
        return this.repository.findById(id).orElseThrow();
    }

    public Boolean excluir(int id){
        try {
            repository.deleteById(id);
        }catch (Exception e ){

            return false;}
        return true;
    }

    public Cliente alterar(Cliente cliente){
        if(Objects.isNull(cliente.getId())){
            throw new RuntimeException("ID não preenchido");
        }
        return this.repository.save(cliente);
    }
}
