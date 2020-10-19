package com.basecmp.secpes.controlespm.domain.service;

import com.basecmp.secpes.controlespm.domain.exception.EntidadeEmUsoException;
import com.basecmp.secpes.controlespm.domain.exception.TipoMilitarNaoEncontradoException;
import com.basecmp.secpes.controlespm.domain.model.TipoMilitar;
import com.basecmp.secpes.controlespm.domain.repository.TipoMilitarRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CadastroTipoMilitarService {

    public static final String MSG_TIPO_MILITAR_EM_USO = "Tipo de Militar de código %d não pode ser removido, pois está em uso";
    @Autowired
    private TipoMilitarRepository tipoMilitarRepository;

    public List<TipoMilitar> listar() {
        return tipoMilitarRepository.findAll();
    }

    public TipoMilitar buscar(Long id) {
        return buscarOuFalhar(id);
    }

    public TipoMilitar salvar(TipoMilitar tipoMilitar) {
        return tipoMilitarRepository.save(tipoMilitar);
    }

    public TipoMilitar atualizar(TipoMilitar tipoMilitar, Long id) {
        TipoMilitar tipoMilitarAtual = buscarOuFalhar(id);

        BeanUtils.copyProperties(tipoMilitar, tipoMilitarAtual, "id");

        return salvar(tipoMilitarAtual);
    }

    public void excluir(Long id) {
        try {
            tipoMilitarRepository.deleteById(id);
        } catch (EmptyResultDataAccessException e) {
            throw new TipoMilitarNaoEncontradoException(id);
        } catch (DataIntegrityViolationException e) {
            throw new EntidadeEmUsoException(
                    String.format(MSG_TIPO_MILITAR_EM_USO, id)
            );
        }
    }

    public TipoMilitar buscarOuFalhar(Long id) {
        TipoMilitar tipoMilitar = tipoMilitarRepository.findById(id)
                .orElseThrow(() -> new TipoMilitarNaoEncontradoException(id));

        return tipoMilitar;
    }

}
