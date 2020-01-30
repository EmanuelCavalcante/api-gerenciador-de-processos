package br.com.gerenciadordeprocessos.parecer.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.gerenciadordeprocessos.parecer.modelos.Parecer;
import br.com.gerenciadordeprocessos.parecer.repository.ParecerRepository;
import br.com.gerenciadordeprocessos.parecer.service.ParecerService;

@Service
public class ParecerServiceImpl implements ParecerService {
	@Autowired
	private ParecerRepository repository;

	@Override
	public Parecer incluirParecer(Parecer parecer) {
		Parecer parecerSalvo = this.repository.save(parecer);
		return parecerSalvo;
	}

}
