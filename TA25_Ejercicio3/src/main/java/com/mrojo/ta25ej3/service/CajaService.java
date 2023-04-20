/**
 * 
 */
package com.mrojo.ta25ej3.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mrojo.ta25ej3.dao.CajaDAO;
import com.mrojo.ta25ej3.dto.Caja;

/**
 * @author Marc
 *
 */
@Service
public class CajaService {
	@Autowired
	CajaDAO cajaDAO;
	
	public List<Caja> listCajas() {
		return cajaDAO.findAll();
	}

	public Caja saveCaja(Caja caja) {
		return cajaDAO.save(caja);
	}

	public Caja CajaById(Long id) {
		return cajaDAO.findById(id).get();
	}

	public Caja updateCaja(Caja caja) {
		return cajaDAO.save(caja);
	}

	public void deleteCaja(Long id) {
		cajaDAO.deleteById(id);
	}
}
