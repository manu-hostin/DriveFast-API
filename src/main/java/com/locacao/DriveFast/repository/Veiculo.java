package com.locacao.DriveFast.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Veiculo extends JpaRepository<Long, Veiculo> {
}
