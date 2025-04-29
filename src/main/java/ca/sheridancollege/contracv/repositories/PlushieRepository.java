package ca.sheridancollege.contracv.repositories;

import ca.sheridancollege.contracv.domain.Plushie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlushieRepository extends JpaRepository<Plushie, Long> {
}
