package br.com.ecoscan.ecoscan.service;

import br.com.ecoscan.ecoscan.model.Usuario;
import br.com.ecoscan.ecoscan.repository.UsuarioRepository;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public Usuario cadastrar(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    public Optional<Usuario> buscarPorId(Long id) {
        return usuarioRepository.findById(id);
    }

    public Optional<Usuario> atualizar(Long id, Usuario dadosAtualizados){

        return usuarioRepository.findById(id)
                .map(usuario -> {
                    usuario.setNome(dadosAtualizados.getNome());
                    usuario.setNome(dadosAtualizados.getEmail());

                    return usuarioRepository.save(usuario);
                });
    }

    public boolean excluir(Long id) {

        if (!usuarioRepository.existsById(id)) {
            return false;
        }

        usuarioRepository.deleteById(id);
        return true;
    }
}
