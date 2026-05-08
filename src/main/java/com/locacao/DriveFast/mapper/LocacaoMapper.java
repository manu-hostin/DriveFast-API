package com.locacao.DriveFast.mapper;

import com.locacao.DriveFast.DTO.locacaoDTO.LocacaoRequisicao;
import com.locacao.DriveFast.DTO.locacaoDTO.LocacaoResposta;
import com.locacao.DriveFast.model.Locacao;
import org.springframework.stereotype.Component;

@Component
public class LocacaoMapper {

    public Locacao paraResposta (LocacaoRequisicao requisicao) {
        return new Locacao(
                requisicao.dias(),
                requisicao.valorTotal(),
                requisicao.cliente(),
                requisicao.veiculo()
        );
    }

    public LocacaoResposta paraEntidade (Locacao locacao) {
        return new LocacaoResposta(
                locacao.getId(),
                locacao.getDias(),
                locacao.getValorTotal(),
                locacao.getCliente(),
                locacao.getVeiculo()
        );
    }
}
