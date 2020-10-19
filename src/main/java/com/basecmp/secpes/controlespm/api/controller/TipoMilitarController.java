package com.basecmp.secpes.controlespm.api.controller;

import com.basecmp.secpes.controlespm.domain.model.TipoMilitar;
import com.basecmp.secpes.controlespm.domain.service.CadastroTipoMilitarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tipo_militar")
public class TipoMilitarController {


    @Autowired
    private CadastroTipoMilitarService cadastroTipoMilitar;

    @GetMapping
    public List<TipoMilitar> listar() {
        return cadastroTipoMilitar.listar();
    }

    @GetMapping("/{id}")
    public TipoMilitar buscar(@PathVariable Long id) {
        return cadastroTipoMilitar.buscar(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public TipoMilitar salvar(TipoMilitar tipoMilitar) {
        return cadastroTipoMilitar.salvar(tipoMilitar);
    }

    @PutMapping("/{id}")
    public TipoMilitar atualizar(@RequestBody TipoMilitar tipoMilitar, @PathVariable Long id) {
        TipoMilitar tipoMilitarSalvo = cadastroTipoMilitar.atualizar(tipoMilitar, id);

        return tipoMilitarSalvo;
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void excluir(@PathVariable Long id) {
        cadastroTipoMilitar.excluir(id);
    }

}
