import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class PalestranteService {

    @Autowired
    private PalestranteRepository palestranteRepository;

    public List<Palestrante> getAllPalestrantes() {
        return palestranteRepository.findAll();
    }

    public Optional<Palestrante> getPalestranteById(Long id) {
        return palestranteRepository.findById(id);
    }

    public Palestrante savePalestrante(Palestrante palestrante) {
        return palestranteRepository.save(palestrante);
    }

    public void deletePalestrante(Long id) {
        palestranteRepository.deleteById(id);
    }
}
