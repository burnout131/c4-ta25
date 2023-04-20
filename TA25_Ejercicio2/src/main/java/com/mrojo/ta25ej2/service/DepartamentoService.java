/**
 * 
 */
package com.mrojo.ta25ej2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mrojo.ta25ej2.dao.DepartamentoDAO;
import com.mrojo.ta25ej2.dto.Departamento;

/**
 * @author Marc
 *
 */
@Service
public class DepartamentoService {
	@Autowired
	DepartamentoDAO departamentoDAO;

	public List<Departamento> listDepartamentos() {
		return departamentoDAO.findAll();
	}

	public Departamento saveDepartamento(Departamento departamento) {
		return departamentoDAO.save(departamento);
	}

	public Departamento DepartamentoById(Long id) {
		return departamentoDAO.findById(id).get();
	}

	public Departamento updateDepartamento(Departamento departamento) {
		return departamentoDAO.save(departamento);
	}

	public void deleteDepartamento(Long id) {
		departamentoDAO.deleteById(id);
	}
}
