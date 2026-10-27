package br.com.ecoscan.ecoscan.repository;

import br.com.ecoscan.ecoscan.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
