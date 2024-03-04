import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/palestras")
public class PalestraController {

    @Autowired
    private PalestraService palestraService;

    @PostMapping
    public ResponseEntity<Palestra> salvarPalestra(@RequestBody Palestra palestra) {
        Palestra novaPalestra = palestraService.salvarPalestra(palestra);
        return new ResponseEntity<>(novaPalestra, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Palestra> buscarPalestraPorId(@PathVariable Long id) {
        Palestra palestra = palestraService.buscarPalestraPorId(id);
        if (palestra != null) {
            return new ResponseEntity<>(palestra, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping
    public ResponseEntity<List<Palestra>> buscarTodasPalestras() {
        List<Palestra> palestras = palestraService.buscarTodasPalestras();
        return new ResponseEntity<>(palestras, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluirPalestra(@PathVariable Long id) {
        palestraService.excluirPalestra(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
