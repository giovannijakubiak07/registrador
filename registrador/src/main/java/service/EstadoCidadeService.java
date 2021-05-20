package service;

import java.util.List;

import com.registrador.model.Cidade;
import com.registrador.model.Estado;

/**
 * EstadoCidadeService
 */
public interface EstadoCidadeService {

    List<Cidade> buscaCidadesPorId(Estado estado);

    Estado buscaEstado(Long id);

    void populaDadosBanco() throws Exception;
}