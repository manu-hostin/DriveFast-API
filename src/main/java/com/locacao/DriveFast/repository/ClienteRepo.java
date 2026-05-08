package com.locacao.DriveFast.repository;

import com.locacao.DriveFast.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepo extends JpaRepository<Long, Cliente> {
}
