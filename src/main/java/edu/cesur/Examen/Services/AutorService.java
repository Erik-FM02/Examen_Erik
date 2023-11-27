package edu.cesur.Examen.Services;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import edu.cesur.Examen.Models.AutorDTO;

@Service
public interface AutorService {
	AutorDTO crearAutor(AutorDTO autor);
	ArrayList<AutorDTO> verAutores();
}
