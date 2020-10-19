package com.basecmp.secpes.controlespm.domain.service;

import com.basecmp.secpes.controlespm.domain.exception.CompanhiaNaoEncontradaException;
import com.basecmp.secpes.controlespm.domain.exception.EntidadeEmUsoException;
import com.basecmp.secpes.controlespm.domain.exception.EntidadeNaoEncontradaException;
import com.basecmp.secpes.controlespm.domain.model.Companhia;
import com.basecmp.secpes.controlespm.domain.repository.CompanhiaRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CadastroCompanhiaService {

    public static final String MSG_COMPANHIA_EM_USO = "A companhia de código %d, não pode ser excluída pois está em uso";
    @Autowired
    private CompanhiaRepository companhiaRepository;

    public List<Companhia> listar() {
        return companhiaRepository.findAll();
    }

    public Companhia buscar (Long id) {
        Companhia companhia = buscarOuFalhar(id);

        return companhia;
    }

    public Companhia salvar(Companhia companhia) {
        return companhiaRepository.save(companhia);
    }

    public Companhia atualizar(Companhia companhia, Long id) {
        Companhia companhiaAtual = buscar(id);

        BeanUtils.copyProperties(companhia, companhiaAtual, "id");

        companhiaAtual = salvar(companhiaAtual);

        return companhiaAtual;
    }

    public void remover(Long id) {
        try {
            companhiaRepository.deleteById(id);
        } catch (EmptyResultDataAccessException e) {
            throw new CompanhiaNaoEncontradaException(id);
        } catch (DataIntegrityViolationException e) {
            throw new EntidadeEmUsoException(
                    String.format(MSG_COMPANHIA_EM_USO, id)
            );
        }
    }

    public Companhia buscarOuFalhar(Long id) {
        Companhia companhia = companhiaRepository.findById(id)
                .orElseThrow(() -> new CompanhiaNaoEncontradaException(id));

        return companhia;
    }

}
