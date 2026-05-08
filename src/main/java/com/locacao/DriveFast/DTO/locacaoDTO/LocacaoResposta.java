package com.locacao.DriveFast.DTO.locacaoDTO;

import com.locacao.DriveFast.model.Cliente;
import com.locacao.DriveFast.model.Veiculo;

import java.math.BigDecimal;

public record LocacaoResposta (
        Long id,
        Integer dias,
        BigDecimal valorTotal,
        String clienteNome,
        String veiculoNome
){
}
