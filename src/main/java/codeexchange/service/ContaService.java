package codeexchange.service;

import codeexchange.model.ContaModel;
import codeexchange.repository.ContaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ContaService {
    @Autowired
    private ContaRepository contaRepository;

    public ContaModel create (ContaModel conta){
        return contaRepository.save(conta);
    }

    public ContaModel update (ContaModel conta){
        return contaRepository.save(conta);
    }

    public void delete(Long id){
        contaRepository.deleteById(id);
    }

    public List<ContaModel> list(){
        return contaRepository.findAll();
    }

    public ContaModel replace(ContaModel conta) {
        ContaModel contaorigem = contaRepository.findById(conta.getIdConta()).get();
        contaorigem.setStatus(conta.getStatus());
        return contaRepository.save(contaorigem);
    }
}
