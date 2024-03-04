import javax.persistence.*;
import java.util.List;

@Entity
public class Palestra {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "dia_evento_id")
    private DiaEvento diaEvento;

    private String titulo;
    private int duracao;

    @ManyToOne
    @JoinColumn(name = "palestrante_id")
    private Palestrante palestrante;

    @ManyToOne
    @JoinColumn(name = "monitor1_id")
    private Monitor monitor1;

    @ManyToOne
    @JoinColumn(name = "monitor2_id")
    private Monitor monitor2;

    // getters e setters
    // getId(), setId(), getDiaEvento(), setDiaEvento(), getTitulo(), setTitulo(), getDuracao(), setDuracao(), getPalestrante(), setPalestrante(), getMonitor1(), setMonitor1(), getMonitor2(), setMonitor2()
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public DiaEvento getDiaEvento() {
        return diaEvento;
    }

    public void setDiaEvento(DiaEvento diaEvento) {
        this.diaEvento = diaEvento;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public Palestrante getPalestrante() {
        return palestrante;
    }

    public void setPalestrante(Palestrante palestrante) {
        this.palestrante = palestrante;
    }

    public Monitor getMonitor1() {
        return monitor1;
    }

    public void setMonitor1(Monitor monitor1) {
        this.monitor1 = monitor1;
    }

    public Monitor getMonitor2() {
        return monitor2;
    }

    public void setMonitor2(Monitor monitor2) {
        this.monitor2 = monitor2;
    }
}
