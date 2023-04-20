/**
 * 
 */
package com.mrojo.ta25ej1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mrojo.ta25ej1.dao.ArticuloDAO;
import com.mrojo.ta25ej1.dto.Articulo;

/**
 * @author Marc
 *
 */
@Service
public class ArticuloService {
	@Autowired
	ArticuloDAO articuloDAO;

	
	public List<Articulo> listArticulos() {
		return articuloDAO.findAll();
	}

	public Articulo saveArticulo(Articulo articulo) {
		return articuloDAO.save(articulo);
	}

	public Articulo ArticuloById(Long id) {
		return articuloDAO.findById(id).get();
	}

	public Articulo updateArticulo(Articulo articulo) {
		return articuloDAO.save(articulo);
	}

	public void deleteArticulo(Long id) {
		articuloDAO.deleteById(id);
	}
}
