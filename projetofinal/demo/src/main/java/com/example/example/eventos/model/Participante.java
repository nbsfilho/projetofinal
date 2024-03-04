import javax.persistence.*;

@Entity
public class Participante {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "palestra_id")
    private Palestra palestra;

    @ManyToOne
    @JoinColumn(name = "oficina_id")
    private Oficina oficina;

    private String nome;

    @ManyToOne
    @JoinColumn(name = "contato_id")
    private Contato contato;

    // getters e setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Palestra getPalestra() {
        return palestra;
    }

    public void setPalestra(Palestra palestra) {
        this.palestra = palestra;
    }

    public Oficina getOficina() {
        return oficina;
    }

    public void setOficina(Oficina oficina) {
        this.oficina = oficina;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Contato getContato() {
        return contato;
    }

    public void setContato(Contato contato) {
        this.contato = contato;
    }
    
    // Outros getters e setters
    
    public Long getPalestraId() {
        return palestra != null ? palestra.getId() : null;
    }

    public void setPalestraId(Long palestraId) {
        if (palestra == null) {
            palestra = new Palestra();
        }
        palestra.setId(palestraId);
    }

    // Getter e Setter para o id da Oficina
    public Long getOficinaId() {
        return oficina != null ? oficina.getId() : null;
    }

    public void setOficinaId(Long oficinaId) {
        if (oficina == null) {
            oficina = new Oficina();
        }
        oficina.setId(oficinaId);
    }

    // Getter e Setter para o id do Contato
    public Long getContatoId() {
        return contato != null ? contato.getId() : null;
    }

    public void setContatoId(Long contatoId) {
        if (contato == null) {
            contato = new Contato();
        }
        contato.setId(contatoId);
    }
}
