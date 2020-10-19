package com.basecmp.secpes.controlespm.api.controller;

import com.basecmp.secpes.controlespm.domain.model.Companhia;
import com.basecmp.secpes.controlespm.domain.model.Militar;
import com.basecmp.secpes.controlespm.domain.repository.MilitarRepository;
import com.basecmp.secpes.controlespm.domain.service.CadastroCompanhiaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/companhias")
public class CompanhiaController {

    @Autowired
    private MilitarRepository militarRepository;

    @Autowired
    private CadastroCompanhiaService cadastroCompanhia;

    @GetMapping
    public List<Companhia> listar() {
        return cadastroCompanhia.listar();
    }

    @GetMapping("/{id}")
    public Companhia buscar(@PathVariable Long id) {
            return cadastroCompanhia.buscar(id);
    }

    @GetMapping("/{id}/militares")
    public List<Militar> todosMilitaresDaCompanhia(@PathVariable Long id) {
        List<Militar> militaresDaCompanhia = militarRepository.findAllByCompanhiaId(id);

        return militaresDaCompanhia;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Companhia salvar(@RequestBody Companhia companhia) {
        return cadastroCompanhia.salvar(companhia);
    }

    @PutMapping("/{id}")
    public Companhia atualizar(@PathVariable Long id, @RequestBody Companhia companhia) {
        Companhia companhiaSalva = cadastroCompanhia.atualizar(companhia, id);

        return companhiaSalva;
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void remover(@PathVariable Long id) {
        cadastroCompanhia.remover(id);
    }

}
