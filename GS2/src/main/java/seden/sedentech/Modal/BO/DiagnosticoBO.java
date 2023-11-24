package seden.sedentech.Modal.BO;

import org.springframework.stereotype.Service;
import seden.sedentech.Modal.beans.InfoDoenca;
import seden.sedentech.Modal.beans.Usuario;

@Service
public class DiagnosticoBO {

    public String fazerDiagnostico(Usuario usuario) {

        // Chama o método para calcular o risco de AIDS no controlador de dados do usuário
        String riscoAIDS = UsuarioBO.calcularRiscoAIDS(usuario);

        // Cria um objeto de Diagnostico com base no risco calculado para AIDS
        InfoDoenca diagnostico = new InfoDoenca();
        diagnostico.setRiscoCardiaco(null); // Assuming riscoCardiaco is not relevant for AIDS diagnosis
        diagnostico.setRiscoAIDS(riscoAIDS);

        // Adiciona lógica adicional de diagnóstico para AIDS, se necessário

        return diagnostico.getRiscoAIDS();
    }
}

