package edu.cesur.Examen.Mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import edu.cesur.Examen.Models.LibroDTO;
import edu.cesur.Examen.Persitence.entities.LibroEntity;

@Mapper(componentModel = "spring", uses = AutorMapper.class)
public interface LibroMapper {

	 LibroDTO toDto(LibroEntity libro);
	 LibroEntity toEntity(LibroDTO libroDTO);

    @Mapping(target = "autores")
    LibroDTO toDtoWithoutLibroDTO(LibroEntity libro);

}