package edu.cesur.Examen.Mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import edu.cesur.Examen.Models.AutorDTO;
import edu.cesur.Examen.Persitence.entities.AutorEntity;
import edu.cesur.Examen.Persitence.entities.LibroEntity;


@Mapper(componentModel = "spring")
public interface AutorMapper {
 
    @Mapping(source = "isbn", target = "id", qualifiedByName = "mapid")
    AutorDTO toDto(AutorEntity autor);
 
    AutorEntity toAutorEntity(AutorEntity AutorDTO);
 
    @Named("libroid")
    default Long libroid(LibroEntity libro) {
        if(libro == null) {
            return null;
        }
         return libro.getId();
    }
}