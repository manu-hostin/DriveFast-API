package com.locacao.DriveFast.DTO.clienteDTO;

public record ClienteResposta (
        Long id,
        String nome,
        String cnh,
        String email
) {
}
