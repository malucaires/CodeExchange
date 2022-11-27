package codeexchange.service;

import codeexchange.model.TransacaoModel;
import codeexchange.repository.TransacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TransacaoService {

    @Autowired
    private TransacaoRepository transacaoRepository;

    public TransacaoModel create (TransacaoModel transacao){
        return transacaoRepository.save(transacao);
    }

    public List<TransacaoModel> list(){
        return transacaoRepository.findAll();
    }

    public void delete (Long id){
        transacaoRepository.deleteById(id);
    }

}
