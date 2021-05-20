package service;

import java.util.List;
import java.util.Optional;

import com.registrador.model.Solicitacao;

public interface SolicitacaoService {

	
	Solicitacao save(Solicitacao solicitacao);
	
	Optional<Solicitacao> findById(Long id);
	
	List<Solicitacao> findAll();
}
