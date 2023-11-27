package edu.cesur.Examen.Services;

import org.springframework.stereotype.Service;

import edu.cesur.Examen.Models.LibroDTO;

@Service
public interface LibroService {

	LibroDTO getLibro(Long id);
	LibroDTO crearlibro(LibroDTO libroDTO);
	
}
