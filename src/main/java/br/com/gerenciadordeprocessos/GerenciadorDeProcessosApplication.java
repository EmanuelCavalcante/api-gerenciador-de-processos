package br.com.gerenciadordeprocessos;

import br.com.gerenciadordeprocessos.usuario.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableJpaRepositories({"br.com.gerenciadordeprocessos.usuario.repository", "br.com.gerenciadordeprocessos.processo.repository",
        "br.com.gerenciadordeprocessos.parecer.repository"})
@EntityScan({"br.com.gerenciadordeprocessos.usuario.modelos", "br.com.gerenciadordeprocessos.processo.modelos",
        "br.com.gerenciadordeprocessos.parecer.modelos"})

@RestController
@EnableAsync
public class GerenciadorDeProcessosApplication {

    @Autowired
    private UsuarioRepository repository;

    public static void main(String[] args) {
        SpringApplication.run(GerenciadorDeProcessosApplication.class, args);
    }

    @GetMapping("/")
    public String get200() {
        return "Server working";
    }

}
