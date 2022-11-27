package codeexchange.repository;

import codeexchange.model.ClienteModel;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ClienteRepository extends JpaRepository<ClienteModel, Long> {

}
