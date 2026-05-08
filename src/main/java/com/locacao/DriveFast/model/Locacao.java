package com.locacao.DriveFast.model;

import java.math.BigDecimal;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="locacao")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Locacao {

    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    private Integer dias;

    private BigDecimal valorTotal;

    @ManyToOne
    private Cliente cliente;

    @ManyToOne
    private Veiculo veiculo;

    public Locacao(Integer dias, BigDecimal valorTotal, Cliente cliente, Veiculo veiculo) {
        this.dias = dias;
        this.valorTotal = valorTotal;
        this.cliente = cliente;
        this.veiculo = veiculo;
    }
}
