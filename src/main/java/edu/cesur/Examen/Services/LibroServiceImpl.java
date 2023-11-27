package edu.cesur.Examen.Services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.cesur.Examen.Mappers.LibroMapper;
import edu.cesur.Examen.Models.LibroDTO;
import edu.cesur.Examen.Persitence.entities.LibroEntity;
import edu.cesur.Examen.Persitence.repository.LibroRepository;

@Service
public class LibroServiceImpl implements LibroService {
	
	
	
	@Autowired
	LibroRepository libroRepository;
	
	@Autowired
	LibroMapper libroMapper;
	

	
	  public LibroDTO crearlibro(LibroDTO libroDTO) {
	        LibroEntity libroEntity = libroMapper.toEntity(libroDTO);
	        LibroEntity libroGuardado = libroRepository.save(libroEntity);
	        return libroMapper.toDto(libroGuardado);
	    }
	  
	  public LibroDTO getLibro(Long id) {
	        Optional<LibroEntity> libroOptional = libroRepository.findById(id);

	        if (libroOptional.isPresent()) {
	            LibroEntity libroEntity = libroOptional.get();
	            return libroMapper.toDto(libroEntity);
	        } else {
	        	return null;
	

}
	  }
}

