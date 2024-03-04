import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class DiaEventoService {

    @Autowired
    private DiaEventoRepository diaEventoRepository;

    public List<DiaEvento> getAllDiasEvento() {
        return diaEventoRepository.findAll();
    }

    public Optional<DiaEvento> getDiaEventoById(Long id) {
        return diaEventoRepository.findById(id);
    }

    public DiaEvento saveDiaEvento(DiaEvento diaEvento) {
        return diaEventoRepository.save(diaEvento);
    }

    public void deleteDiaEvento(Long id) {
        diaEventoRepository.deleteById(id);
    }
}
