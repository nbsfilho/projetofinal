import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/diaeventos")
public class DiaEventoController {

    @Autowired
    private DiaEventoService diaEventoService;

    @PostMapping
    public ResponseEntity<DiaEvento> salvarDiaEvento(@RequestBody DiaEvento diaEvento) {
        DiaEvento novoDiaEvento = diaEventoService.salvarDiaEvento(diaEvento);
        return new ResponseEntity<>(novoDiaEvento, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<DiaEvento> buscarDiaEventoPorId(@PathVariable Long id) {
        DiaEvento diaEvento = diaEventoService.buscarDiaEventoPorId(id);
        if (diaEvento != null) {
            return new ResponseEntity<>(diaEvento, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping
    public ResponseEntity<List<DiaEvento>> buscarTodosDiaEventos() {
        List<DiaEvento> diaEventos = diaEventoService.buscarTodosDiaEventos();
        return new ResponseEntity<>(diaEventos, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluirDiaEvento(@PathVariable Long id) {
        diaEventoService.excluirDiaEvento(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
