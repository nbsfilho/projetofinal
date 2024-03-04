import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class DiaEvento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "evento_id")
    private Evento evento;

    @Temporal(TemporalType.DATE)
    private Date data;

    @OneToMany(mappedBy = "diaEvento", cascade = CascadeType.ALL)
    private List<Palestra> palestras;

    @OneToMany(mappedBy = "diaEvento", cascade = CascadeType.ALL)
    private List<Oficina> oficinas;

    // getters e setters
    // getId(), setId(), getEvento(), setEvento(), getData(), setData(), getPalestras(), setPalestras(), getOficinas(), setOficinas()
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Evento getEvento() {
        return evento;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public List<Palestra> getPalestras() {
        return palestras;
    }

    public void setPalestras(List<Palestra> palestras) {
        this.palestras = palestras;
    }

    public List<Oficina> getOficinas() {
        return oficinas;
    }

    public void setOficinas(List<Oficina> oficinas) {
        this.oficinas = oficinas;
    }
}
