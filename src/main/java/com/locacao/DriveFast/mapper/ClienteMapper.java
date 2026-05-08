package com.locacao.DriveFast.mapper;

import com.locacao.DriveFast.DTO.clienteDTO.ClienteRequisicao;
import com.locacao.DriveFast.DTO.clienteDTO.ClienteResposta;
import com.locacao.DriveFast.model.Cliente;
import org.springframework.stereotype.Component;

@Component
public class ClienteMapper {

    public Cliente paraResposta (ClienteRequisicao requisicao) {
        Cliente cliente = new Cliente(
                requisicao.nome(),
                requisicao.cnh(),
                requisicao.email()
        );
        return cliente;
    }

    public ClienteResposta paraRequisicao (Cliente cliente) {
        return new ClienteResposta(
                cliente.getId(),
                cliente.getNome(),
                cliente.getCnh(),
                cliente.getEmail()
        );
    }

}
