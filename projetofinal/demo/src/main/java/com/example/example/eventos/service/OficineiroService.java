import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class OficineiroService {

    @Autowired
    private OficineiroRepository oficineiroRepository;

    public List<Oficineiro> getAllOficineiros() {
        return oficineiroRepository.findAll();
    }

    public Optional<Oficineiro> getOficineiroById(Long id) {
        return oficineiroRepository.findById(id);
    }

    public Oficineiro saveOficineiro(Oficineiro oficineiro) {
        return oficineiroRepository.save(oficineiro);
    }

    public void deleteOficineiro(Long id) {
        oficineiroRepository.deleteById(id);
    }
}
