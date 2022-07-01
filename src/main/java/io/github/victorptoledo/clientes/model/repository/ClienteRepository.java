package io.github.victorptoledo.clientes.model.repository;

import io.github.victorptoledo.clientes.model.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
}
