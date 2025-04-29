package ca.sheridancollege.contracv.services;

import ca.sheridancollege.contracv.domain.Plushie;
import ca.sheridancollege.contracv.repositories.PlushieRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class PlushieServiceImpl implements PlushieService {

    private PlushieRepository plushieRepository;

    @Override
    public List<Plushie> findAll() {
        return plushieRepository.findAll();
    }

    @Override
    public Plushie findById(Long id) {
        return plushieRepository.findById(id).orElse(null);
    }

    @Override
    public Plushie save(Plushie plushie) {
        return plushieRepository.save(plushie);
    }

    @Override
    public Plushie update(Long id, Plushie plushie) {
        Plushie existing = findById(id);
        if (existing != null) {
            existing.setName(plushie.getName());
            existing.setPrice(plushie.getPrice());
            existing.setQuantity(plushie.getQuantity());
            existing.setEmployeeName(plushie.getEmployeeName());
            return plushieRepository.save(existing);
        }
        return null;
    }

    @Override
    public void deleteById(Long id) {
        plushieRepository.deleteById(id);
    }
}
