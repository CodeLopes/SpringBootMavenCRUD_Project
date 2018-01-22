package br.com.ironmountain.cadastroclientes.repository;

import org.springframework.data.repository.CrudRepository;
import br.com.ironmountain.cadastroclientes.model.Cliente;

public interface ClienteRepository extends CrudRepository<Cliente, Long> {

}