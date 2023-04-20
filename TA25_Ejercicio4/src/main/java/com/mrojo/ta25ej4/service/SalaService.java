/**
 * 
 */
package com.mrojo.ta25ej4.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mrojo.ta25ej4.dao.SalaDAO;
import com.mrojo.ta25ej4.dto.Sala;

/**
 * @author Marc
 *
 */
@Service
public class SalaService {
	@Autowired
	SalaDAO salaDAO;

	// CRUD functions
	public List<Sala> listSalas() {
		return salaDAO.findAll();
	}

	public Sala saveSala(Sala sala) {
		return salaDAO.save(sala);
	}

	public Sala salaById(Long id) {
		return salaDAO.findById(id).get();
	}

	public Sala updateSala(Sala sala) {
		return salaDAO.save(sala);
	}

	public void deleteSala(Long id) {
		salaDAO.deleteById(id);
	}
}
