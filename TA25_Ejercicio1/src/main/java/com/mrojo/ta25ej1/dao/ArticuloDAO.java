/**
 * 
 */
package com.mrojo.ta25ej1.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mrojo.ta25ej1.dto.Articulo;

/**
 * @author Marc
 *
 */
public interface ArticuloDAO extends JpaRepository<Articulo, Long> {

}
