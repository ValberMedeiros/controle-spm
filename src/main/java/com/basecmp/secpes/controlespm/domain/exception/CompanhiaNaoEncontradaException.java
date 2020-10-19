package com.basecmp.secpes.controlespm.domain.exception;

public class CompanhiaNaoEncontradaException extends EntidadeNaoEncontradaException {

    public CompanhiaNaoEncontradaException(String mensagem) {
        super(mensagem);
    }

    public CompanhiaNaoEncontradaException(Long id) {
        this(String.format("Companhia de código %d não pode ser encontrada.", id));
    }
}
