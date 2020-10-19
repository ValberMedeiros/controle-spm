package com.basecmp.secpes.controlespm.domain.exception;

import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus()
public class EntidadeNaoEncontradaException extends RuntimeException {
    public EntidadeNaoEncontradaException(String mensagem) {
        super(mensagem);
    }
}
