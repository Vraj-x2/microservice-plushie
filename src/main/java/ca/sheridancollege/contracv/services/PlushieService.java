package ca.sheridancollege.contracv.services;

import ca.sheridancollege.contracv.domain.Plushie;
import java.util.List;

public interface PlushieService {
    List<Plushie> findAll();
    Plushie findById(Long id);
    Plushie save(Plushie plushie);
    Plushie update(Long id, Plushie plushie);
    void deleteById(Long id);
}
