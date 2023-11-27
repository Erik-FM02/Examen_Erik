package edu.cesur.Examen.Services;

import java.util.ArrayList;
import java.util.List;

import org.mapstruct.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.cesur.Examen.Mappers.AutorMapper;
import edu.cesur.Examen.Models.AutorDTO;
import edu.cesur.Examen.Persitence.entities.AutorEntity;
import edu.cesur.Examen.Persitence.repository.*;

@Service
public class AutorServiceImpl implements AutorService {
  
	@Autowired
 edu.cesur.Examen.Persitence.repository.AutorRepository AutorRepository;
    
    @Autowired
    AutorMapper autorMapper;
    
    @Autowired
    AutorRepository autorRepository;
    
    
    
    @Override
    public AutorDTO crearAutor(AutorDTO autor) {
         AutorEntity AutorN = AutorEntity.autorToEntity(autor);
         AutorEntity GuardarAutor = AutorRepository.save(AutorN);
         return autorMapper.autorToDTO(GuardarAutor);
    }

    @Override
    public ArrayList<AutorDTO> verAutores() {
        List<AutorEntity> lista = AutorRepository.findAll();
        List<AutorDTO> autores = AutorMapper.listaToDTO(lista);

        return autores;
    }

}