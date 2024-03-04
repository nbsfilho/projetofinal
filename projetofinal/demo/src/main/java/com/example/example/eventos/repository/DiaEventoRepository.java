import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DiaEventoRepository extends JpaRepository<DiaEvento, Long> {
}
