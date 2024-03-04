import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class OficinaService {

    @Autowired
    private OficinaRepository oficinaRepository;

    public List<Oficina> getAllOficinas() {
        return oficinaRepository.findAll();
    }

    public Optional<Oficina> getOficinaById(Long id) {
        return oficinaRepository.findById(id);
    }

    public Oficina saveOficina(Oficina oficina) {
        return oficinaRepository.save(oficina);
    }

    public void deleteOficina(Long id) {
        oficinaRepository.deleteById(id);
    }
}
