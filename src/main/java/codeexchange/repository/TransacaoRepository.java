package codeexchange.repository;

import codeexchange.model.TransacaoModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransacaoRepository extends JpaRepository<TransacaoModel, Long> {

}
