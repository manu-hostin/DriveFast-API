package com.locacao.DriveFast.mapper;

import com.locacao.DriveFast.DTO.veiculoDTO.VeiculoRequisicao;
import com.locacao.DriveFast.DTO.veiculoDTO.VeiculoResposta;
import com.locacao.DriveFast.model.Veiculo;
import org.springframework.stereotype.Component;

@Component
public class VeiculoMapper {

    public Veiculo paraResposta (VeiculoRequisicao requisicao) {
        return new Veiculo(
                requisicao.marca(),
                requisicao.modelo(),
                requisicao.placa(),
                requisicao.valorDiaria(),
                requisicao.disponivel()
        );
    }

    public VeiculoResposta paraEntidade (Veiculo veiculo) {
        return new VeiculoResposta(
                veiculo.getId(),
                veiculo.getMarca(),
                veiculo.getModelo(),
                veiculo.getPlaca(),
                veiculo.getValorDiaria(),
                veiculo.getDisponivel()
        );
    }
}
