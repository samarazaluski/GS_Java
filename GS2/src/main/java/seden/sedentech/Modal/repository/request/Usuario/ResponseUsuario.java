package seden.sedentech.Modal.repository.request.Usuario;

import jakarta.validation.constraints.NotNull;
import seden.sedentech.Modal.beans.Usuario;

public record ResponseUsuario(
        @NotNull int id,
        String username,
        String email,
        String senha
) {
    public ResponseUsuario(Usuario usuario){
        this(
                usuario.getId(),
                usuario.getUsername(),
                usuario.getEmail(),
                usuario.getSenha()
        );
    }
}