package edu.cesur.Examen.Controllers;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import edu.cesur.Examen.Models.LibroDTO;

@RestController
@RequestMapping("/libros")
public class LibroRestController {
    @Autowired
    LibroService LibroService;
    
    @PostMapping("/crear")
    public ResponseEntity<?> crearLibro(@RequestBody LibroDTO Libroe){
        LibroDTO Libro = LibroService.crearLibro(Libroe);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/" + Libro.getId()).buildAndExpand(Libro.getId()).toUri();
        return ResponseEntity.created(location).build();

    }


}