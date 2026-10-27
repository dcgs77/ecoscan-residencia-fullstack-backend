package br.com.ecoscan.ecoscan.controller;

import br.com.ecoscan.ecoscan.model.Usuario;
import br.com.ecoscan.ecoscan.service.UsuarioService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    private final UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService){
        this.usuarioService = usuarioService;
    }

    @PostMapping
    public ResponseEntity<Usuario> cadastrar(@RequestBody Usuario usuario){
        Usuario usuarioCadastrado = usuarioService.cadastrar(usuario);

        return ResponseEntity.ok(usuarioCadastrado);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Usuario> budcarPorId(@PathVariable Long id){
        Optional<Usuario> usuario = usuarioService.buscarPorId(id);

        return usuario.map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Usuario> atualizar(@PathVariable Long id, @RequestBody Usuario dadosAtualizados){
        Optional<Usuario> usuario = usuarioService.atualizar(id,dadosAtualizados);

        return usuario.map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluir(@PathVariable Long id){
        boolean excluido = usuarioService.excluir(id);

        if (excluido) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();

    }
}
