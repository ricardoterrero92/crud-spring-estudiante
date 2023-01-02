package com.app.web.respositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.web.entidad.Estudiante;

@Repository
public interface EstudianteRepositorio extends JpaRepository<Estudiante, Long >{

}
