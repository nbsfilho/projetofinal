import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/oficinas")
public class OficinaController {

    @Autowired
    private OficinaService oficinaService;

    @PostMapping
    public ResponseEntity<Oficina> salvarOficina(@RequestBody Oficina oficina) {
        Oficina novaOficina = oficinaService.salvarOficina(oficina);
        return new ResponseEntity<>(novaOficina, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Oficina> buscarOficinaPorId(@PathVariable Long id) {
        Oficina oficina = oficinaService.buscarOficinaPorId(id);
        if (oficina != null) {
            return new ResponseEntity<>(oficina, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping
    public ResponseEntity<List<Oficina>> buscarTodasOficinas() {
        List<Oficina> oficinas = oficinaService.buscarTodasOficinas();
        return new ResponseEntity<>(oficinas, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluirOficina(@PathVariable Long id) {
        oficinaService.excluirOficina(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
