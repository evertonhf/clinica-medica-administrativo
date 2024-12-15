package br.edu.imepac.administrativo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import br.edu.imepac.administrativo.entidades.Paciente;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PacienteRepository extends JpaRepository<Paciente,Long> {
}
