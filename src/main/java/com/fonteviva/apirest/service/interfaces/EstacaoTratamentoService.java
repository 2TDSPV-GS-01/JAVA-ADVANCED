package com.fonteviva.apirest.service.interfaces;
import com.fonteviva.apirest.dto.EstacaoTratamentoDTO;
import java.util.List;
import java.util.Optional;

public interface EstacaoTratamentoService {
    EstacaoTratamentoDTO salvar(EstacaoTratamentoDTO dto);
    List<EstacaoTratamentoDTO> listarTodas();
    Optional<EstacaoTratamentoDTO> buscarPorId(Long id);
    void deletar(Long id);
    EstacaoTratamentoDTO atualizar(Long id, EstacaoTratamentoDTO dto);
}
