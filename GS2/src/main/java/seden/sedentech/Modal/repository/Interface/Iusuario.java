package seden.sedentech.Modal.repository.Interface;

import org.springframework.data.jpa.repository.JpaRepository;
import seden.sedentech.Modal.beans.Usuario;
public interface Iusuario extends JpaRepository<Usuario, String> {
}
