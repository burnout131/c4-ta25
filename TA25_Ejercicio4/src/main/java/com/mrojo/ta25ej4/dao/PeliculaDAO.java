/**
 * 
 */
package com.mrojo.ta25ej4.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mrojo.ta25ej4.dto.Pelicula;

/**
 * @author Marc
 *
 */
public interface PeliculaDAO extends JpaRepository<Pelicula, Long> {
	
}
