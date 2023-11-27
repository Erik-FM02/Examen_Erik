package edu.cesur.Examen.Persitence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.cesur.Examen.Persitence.entities.AutorEntity;

@Repository
public interface AutorRepository extends JpaRepository<AutorEntity,Long> {

}
