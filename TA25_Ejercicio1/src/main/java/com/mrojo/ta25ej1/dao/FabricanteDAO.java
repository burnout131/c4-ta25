/**
 * 
 */
package com.mrojo.ta25ej1.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mrojo.ta25ej1.dto.Fabricante;

/**
 * @author Marc
 *
 */
public interface FabricanteDAO extends JpaRepository<Fabricante, Long> {
	
}
