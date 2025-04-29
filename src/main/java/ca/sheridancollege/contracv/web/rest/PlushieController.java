package ca.sheridancollege.contracv.web.rest;

import ca.sheridancollege.contracv.domain.Plushie;
import ca.sheridancollege.contracv.services.PlushieService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/plushies")
@AllArgsConstructor
public class PlushieController {

    private PlushieService plushieService;

    @GetMapping
    public List<Plushie> getAll() {
        return plushieService.findAll();
    }

    @GetMapping("/{id}")
    public Plushie getById(@PathVariable Long id) {
        return plushieService.findById(id);
    }

    @PostMapping
    public Plushie create(@RequestBody Plushie plushie) {
        return plushieService.save(plushie);
    }

    @PutMapping("/{id}")
    public Plushie update(@PathVariable Long id, @RequestBody Plushie plushie) {
        return plushieService.update(id, plushie);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        plushieService.deleteById(id);
    }
}
