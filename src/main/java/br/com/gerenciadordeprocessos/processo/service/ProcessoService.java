package br.com.gerenciadordeprocessos.processo.service;

import java.util.List;

import br.com.gerenciadordeprocessos.processo.modelos.Processo;

public interface ProcessoService {

	Processo atualizarOuSalvar(Processo processo);

	Processo excluir(Integer id);

	List<Processo> listarPorUsuario(Integer idUsuario);

	List<Processo> listarProcessoSemParecer();

}
