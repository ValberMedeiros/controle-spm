package com.basecmp.secpes.controlespm.domain.exception;

public class TipoMilitarNaoEncontradoException extends EntidadeNaoEncontradaException {

    public TipoMilitarNaoEncontradoException(String mensagem) {
        super(mensagem);
    }

    public TipoMilitarNaoEncontradoException(Long id) {
        this(String.format("Tipo de Militar de código %d não pode ser encontrada.", id));
    }
}
