package service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.registrador.model.Solicitacao;

import repository.SolicitacaoRepository;
import service.SolicitacaoService;

public class SolicitacaoServiceImpl implements SolicitacaoService {
	
	@Autowired
	private SolicitacaoRepository solicitacaoRepository;

	@Override
	public Solicitacao save(Solicitacao solicitacao) {
		return solicitacaoRepository.save(solicitacao);
	}

	@Override
	public Optional<Solicitacao> findById(Long id) {
		return solicitacaoRepository.findById(id);
	}

	@Override
	public List<Solicitacao> findAll() {
		return solicitacaoRepository.findAll();
	}

}
