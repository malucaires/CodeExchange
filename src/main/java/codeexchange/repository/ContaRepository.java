package codeexchange.repository;

import codeexchange.model.ContaModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ContaRepository extends JpaRepository<ContaModel, Long> {


}
