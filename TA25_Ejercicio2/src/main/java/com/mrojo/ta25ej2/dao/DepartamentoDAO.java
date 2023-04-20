/**
 * 
 */
package com.mrojo.ta25ej2.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mrojo.ta25ej2.dto.Departamento;

/**
 * @author Marc
 *
 */
public interface DepartamentoDAO extends JpaRepository<Departamento, Long> {
	
}
