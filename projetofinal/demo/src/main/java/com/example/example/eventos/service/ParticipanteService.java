import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class ParticipanteService {

    @Autowired
    private ParticipanteRepository participanteRepository;

    public List<Participante> getAllParticipantes() {
        return participanteRepository.findAll();
    }

    public Optional<Participante> getParticipanteById(Long id) {
        return participanteRepository.findById(id);
    }

    public Participante saveParticipante(Participante participante) {
        return participanteRepository.save(participante);
    }

    public void deleteParticipante(Long id) {
        participanteRepository.deleteById(id);
    }
}
