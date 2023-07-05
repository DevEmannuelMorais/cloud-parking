package dio.desafioprojeto.emanuel.dio.repository;


import dio.desafioprojeto.emanuel.dio.model.Parking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstacionamentoRepository extends JpaRepository<Parking, Integer> {
}
