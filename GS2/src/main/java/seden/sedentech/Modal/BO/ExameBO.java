package seden.sedentech.Modal.BO;

import org.springframework.stereotype.Service;
import seden.sedentech.Modal.beans.Usuario;

@Service
public class ExameBO {

    private static Usuario usuario;

    public static String avaliarRiscoAIDS( Usuario usuario) {
        ExameBO.usuario = usuario;
        int pontos = 0;

        // Fatores de risco para AIDS (ajuste conforme necessário)
        boolean praticaSexoSemProtecao = usuario.isPraticaSexoSemProtecao();
        boolean compartilhaAgulhas = usuario.isCompartilhaAgulhas();
        boolean parceiroComHIV = usuario.isParceiroComHIV();
        boolean transfusaoSanguinea = usuario.isTeveTransfusaoSanguinea();
        boolean realizouExameRecente = usuario.isRealizouExameRecente();

        // Outras verificações de fatores de risco
        if (praticaSexoSemProtecao) {
            pontos += 2;
        }

        if (compartilhaAgulhas) {
            pontos += 3;
        }

        if (parceiroComHIV) {
            pontos += 2;
        }

        if (transfusaoSanguinea) {
            pontos += 1;
        }

        if (!realizouExameRecente) {
            pontos += 3;
        }

        // Classificação de risco para AIDS (ajuste conforme necessário)
        if (pontos <= 3) {
            return "Baixo Risco - Recomendação: Exame a cada 1 ano";
        } else if (pontos <= 6) {
            return "Moderado Risco - Recomendação: Exame a cada 6 meses";
        } else {
            return "Alto Risco - Recomendação: Exame a cada 3 meses";
        }
    }
}
