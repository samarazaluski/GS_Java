package seden.sedentech.Modal.beans;
import jakarta.persistence.*;
import lombok.*;
import seden.sedentech.Modal.beans.Usuario;

@Entity
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class InfoDoenca {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "risco_cardiaco")
    private String riscoCardiaco;

    @Column(name = "risco_aids") // Added a new field for the risk of AIDS
    private String riscoAIDS;

    // Assuming "diagnosticos" is a relationship, use @OneToOne or @ManyToOne as appropriate
    // @JoinColumn(name = "diagnosticos")
    // private Diagnosticos diagnosticos;

    @JoinColumn(name = "usuario")
    @OneToOne
    private Usuario usuarioDiagnostico;
}

