package com.locacao.DriveFast.DTO;

import com.locacao.DriveFast.model.Cliente;
import com.locacao.DriveFast.model.Veiculo;

import java.math.BigDecimal;

public record LocacaoRequisicao (
        Integer dias,
        BigDecimal valorTotal,
        Cliente cliente,
        Veiculo veiculo
){
}
