package com.locacao.DriveFast.DTO;

import java.math.BigDecimal;

public record VeiculoRequisicao (
        String marca,
        String modelo,
        String placa,
        BigDecimal valorDiaria,
        boolean disponivel
){
}
