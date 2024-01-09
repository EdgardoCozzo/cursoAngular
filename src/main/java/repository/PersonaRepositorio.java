package repository;

import entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface PersonaRepositorio extends JpaRepository<Persona,Integer> {

    @Override
    List<Persona> findAll();
    Persona findOne(int id);
    Persona save(Persona p);

    @Override
    void delete(Persona p);
}
