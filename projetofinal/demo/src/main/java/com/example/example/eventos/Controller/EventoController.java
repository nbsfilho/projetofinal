import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/eventos")
public class EventoController {

    @Autowired
    private EventoService eventoService;

    @PostMapping
    public ResponseEntity<Evento> salvarEvento(@RequestBody Evento evento) {
        Evento novoEvento = eventoService.salvarEvento(evento);
        return new ResponseEntity<>(novoEvento, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Evento> buscarEventoPorId(@PathVariable Long id) {
        Evento evento = eventoService.buscarEventoPorId(id);
        if (evento != null) {
            return new ResponseEntity<>(evento, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping
    public ResponseEntity<List<Evento>> buscarTodosEventos() {
        List<Evento> eventos = eventoService.buscarTodosEventos();
        return new ResponseEntity<>(eventos, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluirEvento(@PathVariable Long id) {
        eventoService.excluirEvento(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
