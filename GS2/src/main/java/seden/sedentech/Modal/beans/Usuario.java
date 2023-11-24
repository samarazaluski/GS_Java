package seden.sedentech.Modal.beans;

import com.fasterxml.jackson.annotation.*;
import jakarta.persistence.*;
import lombok.*;
import seden.sedentech.Modal.repository.request.Usuario.RequestUsuario;
import seden.sedentech.Modal.repository.request.Usuario.ResponseUsuario;

@Entity
@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
@Table(name = "usuarios")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "username")
    private String username;

    @Column(name = "email")
    private String email;

    @Column(name = "senha")
    private String senha;


    public Usuario(RequestUsuario requestUsuario) {
        this.username = requestUsuario.username();
        this.email = requestUsuario.email();
        this.senha = requestUsuario.senha();
    }


    public Usuario upUsuario(ResponseUsuario responseUsuario) {
        Usuario usuario = new Usuario();
        if (responseUsuario.username() != null) this.username = responseUsuario.username();
        if (responseUsuario.email() != null) this.email = responseUsuario.email();
        if (responseUsuario.senha() != null) this.senha = responseUsuario.senha();
        return usuario;
    }

    public boolean isPraticaSexoSemProtecao() {
        return false;
    }

    public boolean isCompartilhaAgulhas() {
        return false;
    }

    public boolean isParceiroComHIV() {
        return false;
    }

    public boolean isTeveTransfusaoSanguinea() {
        return false;
    }

    public boolean isRealizouExameRecente() {
        return false;
    }
}
