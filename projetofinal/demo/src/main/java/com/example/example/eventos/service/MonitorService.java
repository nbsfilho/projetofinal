import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class MonitorService {

    @Autowired
    private MonitorRepository monitorRepository;

    public List<Monitor> getAllMonitores() {
        return monitorRepository.findAll();
    }

    public Optional<Monitor> getMonitorById(Long id) {
        return monitorRepository.findById(id);
    }

    public Monitor saveMonitor(Monitor monitor) {
        return monitorRepository.save(monitor);
    }

    public void deleteMonitor(Long id) {
        monitorRepository.deleteById(id);
    }
}
