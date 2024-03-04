import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class PalestraService {

    @Autowired
    private PalestraRepository palestraRepository;

    public List<Palestra> getAllPalestras() {
        return palestraRepository.findAll();
    }

    public Optional<Palestra> getPalestraById(Long id) {
        return palestraRepository.findById(id);
    }

    public Palestra savePalestra(Palestra palestra) {
        return palestraRepository.save(palestra);
    }

    public void deletePalestra(Long id) {
        palestraRepository.deleteById(id);
    }
}
