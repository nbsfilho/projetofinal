import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Evento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @Temporal(TemporalType.TIMESTAMP)
    private Date dataInicio;

    @Temporal(TemporalType.TIMESTAMP)
    private Date dataFim;

    @OneToMany(mappedBy = "evento", cascade = CascadeType.ALL)
    private List<DiaEvento> diasEvento;

    // getters e setters
    // getId(), setId(), getNome(), setNome(), getDataInicio(), setDataInicio(), getDataFim(), setDataFim()
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Date getDataFim() {
        return dataFim;
    }

    public void setDataFim(Date dataFim) {
        this.dataFim = dataFim;
    }

    public List<DiaEvento> getDiasEvento() {
        return diasEvento;
    }

    public void setDiasEvento(List<DiaEvento> diasEvento) {
        this.diasEvento = diasEvento;
    }
}
