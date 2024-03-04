import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OficineiroRepository extends JpaRepository<Oficineiro, Long> {
}
