package com.locacao.DriveFast.DTO;

import java.math.BigDecimal;

public record VeiculoResposta (
        Long id,
        String marca,
        String modelo,
        String placa,
        BigDecimal valorDiaria,
        boolean disponivel
){
}
