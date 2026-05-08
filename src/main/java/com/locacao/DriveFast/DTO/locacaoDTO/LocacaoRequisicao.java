package com.locacao.DriveFast.DTO.locacaoDTO;

import com.locacao.DriveFast.model.Cliente;
import com.locacao.DriveFast.model.Veiculo;

import java.math.BigDecimal;

public record LocacaoRequisicao (
        Integer dias,
        Integer clienteId,
        Integer veiculoId
){
}
