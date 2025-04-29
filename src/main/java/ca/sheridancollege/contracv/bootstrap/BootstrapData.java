package ca.sheridancollege.contracv.bootstrap;

import ca.sheridancollege.contracv.domain.Plushie;
import ca.sheridancollege.contracv.services.PlushieService;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class BootstrapData implements CommandLineRunner {

    private PlushieService plushieService;

    @Override
    public void run(String... args) {
        plushieService.save(new Plushie("Teddy Bear", 19.99, 10, "Jake"));
        plushieService.save(new Plushie("Pikachu", 24.99, 5, "Amy"));
        plushieService.save(new Plushie("Dinosaur", 17.50, 3, "Terry"));
        plushieService.save(new Plushie("Penguin", 20.00, 7, "Holt"));
        plushieService.save(new Plushie("Dragon", 30.00, 2, "Gina"));
        plushieService.save(new Plushie("Unicorn", 21.49, 4, "Rosa"));
        plushieService.save(new Plushie("Koala", 15.75, 8, "Charles"));
        plushieService.save(new Plushie("Elephant", 22.99, 6, "Scully"));
        plushieService.save(new Plushie("Lion", 25.00, 2, "Hitchcock"));
        plushieService.save(new Plushie("Fox", 18.60, 3, "Doug Judy"));
    }
}
