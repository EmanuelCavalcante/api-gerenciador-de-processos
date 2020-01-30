package br.com.gerenciadordeprocessos.parecer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.gerenciadordeprocessos.parecer.modelos.Parecer;

@Repository
public interface ParecerRepository extends JpaRepository<Parecer, Integer> {
	Parecer save(Parecer persiste);
}
