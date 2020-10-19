package com.basecmp.secpes.controlespm.api.controller;

import com.basecmp.secpes.controlespm.domain.exception.EntidadeEmUsoException;
import com.basecmp.secpes.controlespm.domain.exception.EntidadeNaoEncontradaException;
import com.basecmp.secpes.controlespm.domain.model.Companhia;
import com.basecmp.secpes.controlespm.domain.model.Militar;
import com.basecmp.secpes.controlespm.domain.repository.CompanhiaRepository;
import com.basecmp.secpes.controlespm.domain.repository.MilitarRepository;
import com.basecmp.secpes.controlespm.domain.service.CadastroCompanhiaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/companhias")
public class CompanhiaController {

    @Autowired
    private CompanhiaRepository companhiaRepository;

    @Autowired
    private MilitarRepository militarRepository;

    @Autowired
    private CadastroCompanhiaService cadastroCompanhia;

    @GetMapping
    public List<Companhia> listar() {
        return cadastroCompanhia.listar();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Companhia> buscar(@PathVariable Long id) {
        try {
            Companhia companhia = cadastroCompanhia.buscar(id);
            return ResponseEntity.ok(companhia);
        } catch (EntidadeNaoEncontradaException e) {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/{id}/militares")
    public List<Militar> todosMilitaresDaCompanhia(@PathVariable Long id) {
        List<Militar> militaresDaCompanhia = militarRepository.findAllByCompanhiaId(id);

        return militaresDaCompanhia;
    }

    @PostMapping
    public ResponseEntity<Companhia> salvar(@RequestBody Companhia companhia) {
        companhia = cadastroCompanhia.salvar(companhia);

        return ResponseEntity.status(HttpStatus.CREATED).body(companhia);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Companhia> atualizar(@PathVariable Long id, @RequestBody Companhia companhia) {
        try {
            Companhia companhiaSalva = cadastroCompanhia.atualizar(companhia, id);

            return ResponseEntity.ok(companhiaSalva);
        } catch (EntidadeNaoEncontradaException e) {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> remover(@PathVariable Long id) {
        try {
            cadastroCompanhia.remover(id);
            return ResponseEntity.noContent().build();
        } catch (EntidadeNaoEncontradaException e) {
            return ResponseEntity.notFound().build();
        } catch (EntidadeEmUsoException e) {
            return ResponseEntity.status(HttpStatus.CONFLICT).body(e.getMessage());
        }
    }

}
