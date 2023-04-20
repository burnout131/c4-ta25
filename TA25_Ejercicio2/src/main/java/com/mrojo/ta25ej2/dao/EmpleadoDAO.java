/**
 * 
 */
package com.mrojo.ta25ej2.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mrojo.ta25ej2.dto.Empleado;

/**
 * @author Marc
 *
 */
public interface EmpleadoDAO extends JpaRepository<Empleado, String> {

}
