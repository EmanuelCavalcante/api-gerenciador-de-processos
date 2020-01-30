package br.com.gerenciadordeprocessos.security;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.gerenciadordeprocessos.usuario.modelos.Usuario;
import br.com.gerenciadordeprocessos.usuario.repository.UsuarioRepository;

public class SecurityDao {

	@Autowired
	UsuarioRepository repository;

	public Optional<Usuario> obterUsuaruio(String login) {
		Usuario usuario = repository.buscarUsuarioPeloLogin(login);
		return Optional.ofNullable(usuario);
	}
}
