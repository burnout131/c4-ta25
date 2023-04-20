/**
 * 
 */
package com.mrojo.ta25ej3.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mrojo.ta25ej3.dao.AlmacenDAO;
import com.mrojo.ta25ej3.dto.Almacen;

/**
 * @author Marc
 *
 */
@Service
public class AlmacenService {
	@Autowired
	AlmacenDAO almacenDAO;
	
	public List<Almacen> listAlmacenes() {
		return almacenDAO.findAll();
	}

	public Almacen saveAlmacen(Almacen almacen) {
		return almacenDAO.save(almacen);
	}

	public Almacen AlmacenById(Long id) {
		return almacenDAO.findById(id).get();
	}

	public Almacen updateAlmacen(Almacen almacen) {
		return almacenDAO.save(almacen);
	}

	public void deleteAlmacen(Long id) {
		almacenDAO.deleteById(id);
	}
}
