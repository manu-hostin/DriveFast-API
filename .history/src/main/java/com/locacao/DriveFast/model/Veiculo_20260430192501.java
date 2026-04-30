package com.locacao.DriveFast.model;

import java.math.BigDecimal;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="veiculo")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Veiculo {

    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private String marca;
    private String modelo;
    private String placa;
    private BigDecimal valorDiaria;
    private Boolean disponivel;



}
