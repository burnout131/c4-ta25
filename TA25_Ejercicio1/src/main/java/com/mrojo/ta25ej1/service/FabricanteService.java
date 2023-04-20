/**
 * 
 */
package com.mrojo.ta25ej1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mrojo.ta25ej1.dao.FabricanteDAO;
import com.mrojo.ta25ej1.dto.Fabricante;

/**
 * @author Marc
 *
 */
@Service
public class FabricanteService {
	@Autowired
	FabricanteDAO fabricanteDAO;

	
	public List<Fabricante> listFabricantes() {
		return fabricanteDAO.findAll();
	}

	public Fabricante saveFabricante(Fabricante fabricante) {
		return fabricanteDAO.save(fabricante);
	}

	public Fabricante FabricanteById(Long id) {
		return fabricanteDAO.findById(id).get();
	}

	public Fabricante updateFabricante(Fabricante fabricante) {
		return fabricanteDAO.save(fabricante);
	}

	public void deleteFabricante(Long id) {
		fabricanteDAO.deleteById(id);
	}
}
