package codeexchange.service;

import codeexchange.model.ClienteModel;
import codeexchange.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public ClienteModel create (ClienteModel cliente){
        return clienteRepository.save(cliente);
    }

    public ClienteModel update (ClienteModel cliente){
        return clienteRepository.save(cliente);
    }

    public void delete (Long id){
        clienteRepository.deleteById(id);
    }

    public List<ClienteModel> list(){
        return clienteRepository.findAll();
    }


}
